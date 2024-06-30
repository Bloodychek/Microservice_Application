package org.example.delivery_service.controller;

import lombok.RequiredArgsConstructor;
import org.example.delivery_service.model.Delivery;
import org.example.delivery_service.service.DeliveryService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/delivery/")
@RequiredArgsConstructor
public class DeliveryController {
    private final DeliveryService deliveryService;
    @GetMapping
    public List<Delivery> getAll(){
        return deliveryService.findAll();
    }

    @GetMapping("{courierName}/{status}")
    public Delivery getDeliveryByCourierNameAndStatus(@PathVariable String courierName, @PathVariable Boolean status) {
        return deliveryService.findByCourierNameAndDeliveryStatus(courierName, status);
    }
}
