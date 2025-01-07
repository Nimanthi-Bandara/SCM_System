package com.Project.SCM_System.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.Project.SCM_System.Model.Order;

import com.Project.SCM_System.Service.orderService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;


@RestController
@RequestMapping({"/api/orders"})
public class orderController {
    @Autowired
    private orderService orderService;
    public orderController(){
    }

    @PostMapping
    public ResponseEntity<Order> createOrder(@RequestBody Order order){
        Order createOrder = this.orderService.createOrder(order);
        return ResponseEntity.ok(createOrder);
    }

    @GetMapping({"/{orderId}"})
    public ResponseEntity<Order> getOrderById(@PathVariable String orderId){
        Order order = this.orderService.getOrderById(orderId);
        return order != null? ResponseEntity.ok(order) : ResponseEntity.notFound().build();
    }

    @GetMapping
    public ResponseEntity<List<Order>> getAllOrder(){
        List<Order> Order = this.orderService.getAllOrders();
        return ResponseEntity.ok(Order);
    }

    @PutMapping({"/orderId"})
    public ResponseEntity<Order> updateOrder(@PathVariable String orderId,@RequestBody Order Order){
        Order updateOrder = this.orderService.updateOrder(orderId, Order);
        return updateOrder != null? ResponseEntity.ok(updateOrder) : ResponseEntity.notFound().build();
    }

    @DeleteMapping({"/{orderId}"})
    public ResponseEntity<Order> deleteProduct(@PathVariable String orderId){
        this.orderService.deleteOrder(orderId);
        return ResponseEntity.noContent().build();
    }

    }
