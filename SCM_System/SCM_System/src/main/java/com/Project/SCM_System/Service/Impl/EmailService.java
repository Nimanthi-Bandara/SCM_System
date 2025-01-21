package com.Project.SCM_System.Service.Impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Project.SCM_System.Model.Order;

import org.springframework.mail.MailSendException;
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

    public void sendOrderRejectionEmail(Order order, String customerEmail) {
        SimpleMailMessage message = new SimpleMailMessage();
        message.setTo(customerEmail);
        message.setSubject("Order Rejected - Timeout");
        message.setText("Your order " + order.getorderId() + 
                       " has been automatically rejected as it was not processed within 3 days. " +
                       "Please place a new order if you wish to proceed.");
        
        emailSender.send(message);
    }

    public void sendOrderConfirmation(Order savedOrder) {
       SimpleMailMessage message = new SimpleMailMessage();
       message.setTo(savedOrder.getcustomerEmail());
       message.setSubject("Order Confirmation");
       message.setText("Dear" + updateOrder.getcustomerName()+ "\n\n The status of your order with ID" + updateOrder.getorderId() +
                        "has been updated to:" + updateOrder.getstatus() + "\n\n Thank you for your patience. \n\n Best regards, \n Stylo ");
        MailSendException.send(message);
    }

    public void sendStatusUpdate(Order updatedOrder) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'sendStatusUpdate'");
    }
}
