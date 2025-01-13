package com.Project.SCM_System.Service;

import com.Project.SCM_System.Model.Order;

import java.util.List;

public interface orderService {
    Order createOrder(Order order);
    Order getOrderById(String orderId);
    List<Order> getAllOrders();
    Order updateOrder(String orderId, Order order);
    void deleteOrder(String orderId);
}
