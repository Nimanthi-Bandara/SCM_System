package com.Project.SCM_System.Service.Impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Project.SCM_System.Model.Order;

import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;

@Service
public class EmailService {
    @Autowired
    private JavaMailSender emailSender;

    public void sendUserId(String to, String userId){
        SimpleMailMessage message = new SimpleMailMessage();
        message.setTo(to);
        message.setSubject("Your User Id");
        message.setText("Your User Id is: " +userId);
        emailSender.send(message);
    }

    public void sendOrderConfirmation(Order savedOrder, String userId) {
        SimpleMailMessage message = new SimpleMailMessage();
        message.setTo(userId);
        message.setSubject("Order Confirmed.");
        message.setText("Your order " + savedOrder.getorderId() + 
                       " has confirmed. Thank you for placing your order. " );
        emailSender.send(message);
    }

    public void sendStatusUpdate(String to,Order updatedOrder) {
        SimpleMailMessage message = new SimpleMailMessage();
        message.setTo();
        message.setSubject("Order Status Updated.");
        message.setText("Your order " + updatedOrder.getorderId() + "status has been updated. Look at the order status for the new updated status of your order."
                            + "Thank you.");
        emailSender.send(message);
    }

    public void sendOrderRejectionEmail(Order order, String customerEmail) {
        SimpleMailMessage message = new SimpleMailMessage();
        message.setTo(customerEmail);
        message.setSubject("Order Rejected - Timeout");
        message.setText("Your order " + order.getorderId() + 
                       " has been automatically rejected as it was not processed within 3 days. " +
                       "Please place a new order if you wish to proceed.");
        
        emailSender.send(message);
    }
}
