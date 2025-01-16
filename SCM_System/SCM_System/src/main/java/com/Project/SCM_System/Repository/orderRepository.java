package com.Project.SCM_System.Repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.Project.SCM_System.Model.Order;
import com.Project.SCM_System.enums.orderStatus;

public interface orderRepository extends MongoRepository<Order, String>{
    Optional<Order> findByOrderNumber(String orderNumber);
    List<Order> findByCustId(String custId);
    List<Order> findByStatus(orderStatus status);
    List<Order> findByOrderDateBetween(String startDate, String endDate);
}
