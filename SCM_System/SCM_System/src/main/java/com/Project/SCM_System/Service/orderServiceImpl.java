package com.Project.SCM_System.Service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Project.SCM_System.Repository.orderRepository;
import com.Project.SCM_System.Model.Order;

@Service

public class orderServiceImpl implements orderService {
    @Autowired
    private orderRepository OrderRepository;
    @Override
    public Order createOrder(Order order){
        return OrderRepository.save(order);
    }

    @Override
    public Order getOrderById(String OrderId){
        Optional<Order> order = OrderRepository.findById(OrderId);
        return order.orElse(null);
    }

    @Override
    public List<Order> getAllOrders(){
        return OrderRepository.findAll();
    }

    @Override
    public Order updateOrder(String orderId, Order order){
        if (orderRepository.existsById(orderId)){
            order.setorderId(orderId);
            return orderRepository.save(order);
        }
        return null; // throw exception
    }

    @Override
    public void deleteOrder(String orderId){
        OrderRepository.deleteById(orderId);
    }
}
