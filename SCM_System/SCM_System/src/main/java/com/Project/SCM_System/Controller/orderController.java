package com.Project.SCM_System.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.Project.SCM_System.DTO.OrderRequest;
import com.Project.SCM_System.DTO.OrderSearchCriteria;
import com.Project.SCM_System.DTO.OrderTrackingInfo;
import com.Project.SCM_System.Model.Order;

import com.Project.SCM_System.Service.orderService;
import com.Project.SCM_System.enums.orderStatus;

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
    public orderController(orderService orderService){
        this.orderService = orderService;
    }

    @PostMapping
    public ResponseEntity<Order> createOrder(@RequestBody OrderRequest request){
        return ResponseEntity.ok(orderService.createOrder(request));
    }

    @PutMapping("/{orderId}/status")
    public ResponseEntity<Order> updateStatus(
            @PathVariable String orderId,
            @RequestParam orderStatus status,
            @RequestParam String description,
            @RequestParam String updatedBy) {
        return ResponseEntity.ok(orderService.updateorderStatus(orderId, status, description, updatedBy));
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

     @GetMapping("/customer/{custId}")
    public ResponseEntity<List<Order>> getOrdersByCustomer(@PathVariable String custId) {
        return ResponseEntity.ok(orderService.getOrdersByCustomer(custId));
    }

    @GetMapping("/status/{status}")
    public ResponseEntity<List<Order>> getOrdersByStatus(@PathVariable orderStatus status) {
        return ResponseEntity.ok(orderService.getOrdersByStatus(status));
    }

    @GetMapping("/{orderId}/tracking")
    public ResponseEntity<OrderTrackingInfo> getOrderTracking(@PathVariable String orderId) {
        return ResponseEntity.ok(orderService.getOrderTrackingInfo(orderId));
    }

    @GetMapping("/search")
    public ResponseEntity<List<Order>> searchOrders(@RequestBody OrderSearchCriteria criteria) {
        return ResponseEntity.ok(orderService.searchOrders(criteria));
    }

    /*@GetMapping("/statistics")
    public ResponseEntity<OrderStatistics> getOrderStatistics() {
        return ResponseEntity.ok(orderService.getOrderStatistics());

    }*/

    @GetMapping("/accepted")
    public ResponseEntity<List<Order>> getAcceptedOrders() {
        return ResponseEntity.ok(orderService.getAcceptedOrders());
    }
    
    @PutMapping("/{orderId}/accept")
    public ResponseEntity<Order> acceptOrder(@PathVariable String orderId) {
        try {
            Order acceptedOrder = orderService.acceptOrder(orderId);
            return ResponseEntity.ok(acceptedOrder);
        } catch (RuntimeException e) {
            return ResponseEntity.notFound().build();
        }
    }
}
