package com.Project.SCM_System.Service.Impl;

import java.time.LocalDateTime;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.stereotype.Service;

import com.Project.SCM_System.Repository.orderRepository;
import com.Project.SCM_System.Service.orderService;
import com.Project.SCM_System.enums.orderStatus;
import com.Project.SCM_System.DTO.OrderRequest;
import com.Project.SCM_System.DTO.OrderSearchCriteria;
import com.Project.SCM_System.DTO.OrderTrackingInfo;
import com.Project.SCM_System.Model.Order;
import com.Project.SCM_System.Model.Parcel;
import com.Project.SCM_System.Model.ProductionUpdate;

@Service

public class orderServiceImpl implements orderService {
    @Autowired
    private orderRepository orderRepository;

    @Autowired
    private MongoTemplate mongoTemplate;

    @Autowired
    private ParcelService parcelService;

    @Autowired
    private EmailService emailService;

    public Order createOrder(OrderRequest request){
        Order order = new Order();
        order.setordername(request.getorderName());
        order.setcustId(request.getcustId());
        order.setunitPrice(request.getunitPrice());
        order.setquantity(request.getquantity());
        order.calculateTotalAmount();

        order.setorderNumber(generateOrderNumber());
        order.setcustomerName(request.getcustomerName());
        order.setcustomerEmail(request.getcustomerEmail());
        order.setdeliveryAddress(request.getdeliveryAddress());
        order.setestimatedCompletionDate(calculateEstimatedCompletion(request.getquantity()));

        order.addProductionUpdate(
            new ProductionUpdate(
                orderStatus.ORDER_RECEIVED,
                "Order received and scheduled for production",
                "System"
            )
        );

        Order savedOrder = orderRepository.save(order);
        emailService.sendOrderConfirmation(savedOrder);
        return savedOrder;
    }

    public Order updateorderStatus(String orderId, orderStatus newStatus, String description, String updatedBy) {
        Order order = orderRepository.findById(orderId)
            .orElseThrow(() -> new RuntimeException("Order not found"));

        order.addProductionUpdate(
            new ProductionUpdate(newStatus, description, updatedBy)
        );
        order.setstatus(newStatus);

        if (newStatus == orderStatus.READY_FOR_SHIPPING) {
            Parcel parcel = new Parcel();
            parcel.setReceiverName(order.getcustomerName());
            parcel.setDeliveryAddress(order.getdeliveryAddress());
            parcel.setRecipientEmail(order.getcustomerEmail());
            
            Parcel trackedParcel = parcelService.createParcel(parcel);
            order.settrackingNumber(trackedParcel.getTrackingNumber());
            order.setstatus(orderStatus.SHIPPED);
        }

        Order updatedOrder = orderRepository.save(order);
        emailService.sendStatusUpdate(updatedOrder);
        return updatedOrder;
    }

    public List<Order> getOrdersByCustomer(String custId) {
        return orderRepository.findByCustId(custId);
    }

    public List<Order> getOrdersByStatus(orderStatus status) {
        return orderRepository.findByStatus(status);
    }

    public List<Order> getOrdersByDateRange(String startDate, String endDate) {
        return orderRepository.findByOrderDateBetween(startDate, endDate);
    }

    @Override
    public Order getOrderById(String orderId){
        Optional<Order> order = orderRepository.findById(orderId);
        return order.orElse(null);
    }

     public OrderTrackingInfo getOrderTrackingInfo(String orderId) {
        Order order = orderRepository.findById(orderId)
            .orElseThrow(() -> new RuntimeException("Order not found"));

        OrderTrackingInfo trackingInfo = new OrderTrackingInfo();
        trackingInfo.setorderId(order.getorderId());
        trackingInfo.setorderNumber(order.getorderNumber());
        trackingInfo.setstatus(order.getstatus());
        trackingInfo.setorderDate(order.getorderDate());
        trackingInfo.setproductionUpdates(order.productionUpdates());
        
        if (order.gettrackingNumber() != null) {
            trackingInfo.setParcelStatus(
                parcelService.getParcelStatus(order.gettrackingNumber())
            );
        }

        return trackingInfo;
    }

     public List<Order> searchOrders(OrderSearchCriteria criteria) {
        Query query = new Query();
        
        if (criteria.getcustId() != null) {
            query.addCriteria(Criteria.where("custId").is(criteria.getcustId()));
        }
        
        if (criteria.getstatus() != null) {
            query.addCriteria(Criteria.where("status").is(criteria.getstatus()));
        }
        
        if (criteria.getstartDate() != null) {
            query.addCriteria(Criteria.where("orderDate").gte(criteria.getstartDate()));
        }
        
        if (criteria.getendDate() != null) {
            query.addCriteria(Criteria.where("orderDate").lte(criteria.getendDate()));
        }
        
        return mongoTemplate.find(query, Order.class);
    }

    /*public OrderStatistics getOrderStatistics() {
        OrderStatistics stats = new OrderStatistics();
        
        stats.setTotalOrders(mongoTemplate.count(new Query(), Order.class));
        
        for (orderStatus status : orderStatus.values()) {
            Query query = new Query(Criteria.where("status").is(status));
            long count = mongoTemplate.count(query, Order.class);
            stats.getOrdersByStatus().put(status, count);
        }
        
        return stats;
    }*/

    private String generateOrderNumber() {
        return "ORD-" + System.currentTimeMillis();
    }

    private LocalDateTime calculateEstimatedCompletion(int quantity) {
        return LocalDateTime.now().plusDays(quantity > 100 ? 14 : 7);
    }

    @Override
    public List<Order> getAllOrders(){
        return orderRepository.findAll();
    }

    @Override
    public Order updateOrder(String orderId, Order order){
        if (orderRepository.existsById(orderId)){
            order.setorderId(orderId);
            return orderRepository.save(order);
        }
        return null; // throw exception
    }

    //delete the order
    @Override
    public void deleteOrder(String orderId){
        orderRepository.deleteById(orderId);
    }

    //manage the accepted orders
    public List<Order> getAcceptedOrders() {
        return orderRepository.findByStatus("ACCEPTED");
    }

    @Override
    public Order acceptOrder(String orderId) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'acceptOrder'");
    }   
}
