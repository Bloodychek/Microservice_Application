package org.example.paymentservice.service.impl;

import lombok.RequiredArgsConstructor;
import org.example.paymentservice.model.Payment;
import org.example.paymentservice.repository.PaymentRepository;
import org.example.paymentservice.service.PaymentService;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class PaymentServiceImpl implements PaymentService {
    private final PaymentRepository paymentRepository;
    @Override
    public List<Payment> findAll() {
        return paymentRepository.findAll();
    }

    @Override
    public Payment findById(int id) {
        Optional<Payment> optional = paymentRepository.findById(id);
        Payment payment;
        if (optional.isPresent()) {
            payment = optional.get();
        } else {
            throw new RuntimeException();
        }
        return payment;
    }

    @Override
    public Payment add(Payment payment) {
        return paymentRepository.saveAndFlush(payment);
    }

    @Override
    public Payment update(Payment newPayment, int id) {
        return paymentRepository.findById(id).map(payment -> {
                    payment.setAmount(newPayment.getAmount());
                    payment.setPaymentDate(newPayment.getPaymentDate());
                    payment.setStatus(newPayment.getStatus());
                    return paymentRepository.saveAndFlush(payment);
                })
                .orElseGet(() -> paymentRepository.saveAndFlush(newPayment));
    }
}
