package com.Project.SCM_System.Service;

import com.Project.SCM_System.DTO.OrderRequest;
import com.Project.SCM_System.DTO.OrderSearchCriteria;
import com.Project.SCM_System.DTO.OrderTrackingInfo;
import com.Project.SCM_System.Model.Order;
import com.Project.SCM_System.enums.orderStatus;

import java.util.List;

public interface orderService {
    Order createOrder(OrderRequest request);
    Order getOrderById(String orderId);
    List<Order> getAllOrders();
    void deleteOrder(String orderId);
    Order updateorderStatus(String orderId, orderStatus status, String description, String updatedBy);
    List<Order> getOrdersByCustomer(String custId);
    List<Order> getOrdersByStatus(orderStatus status);
    OrderTrackingInfo getOrderTrackingInfo(String orderId);
    List<Order> searchOrders(OrderSearchCriteria criteria);
}
