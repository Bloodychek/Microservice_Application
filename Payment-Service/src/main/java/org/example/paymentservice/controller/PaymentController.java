package org.example.paymentservice.controller;

import lombok.RequiredArgsConstructor;
import org.example.paymentservice.model.Payment;
import org.example.paymentservice.service.PaymentService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/payment/")
@RequiredArgsConstructor
public class PaymentController {
    private final PaymentService paymentService;

    @GetMapping
    public List<Payment> getAll(){
        return paymentService.findAll();
    }

    @GetMapping("{id}")
    public Payment getById(@PathVariable int id){
        return paymentService.findById(id);
    }

    @PostMapping
    public Payment add(@RequestBody Payment payment){
        return paymentService.add(payment);
    }

    @PutMapping("{id}")
    public Payment update(@RequestBody Payment payment, @PathVariable int id){
        return paymentService.update(payment, id);
    }
}
