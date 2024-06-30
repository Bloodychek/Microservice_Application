package org.example.paymentservice.service;

import org.example.paymentservice.model.Payment;

import java.util.List;

public interface PaymentService {
    List<Payment> findAll();
    Payment findById(int id);
    Payment add(Payment payment);
    Payment update(Payment newPayment, int id);
}
