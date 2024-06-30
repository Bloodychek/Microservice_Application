package org.example.delivery_service.service;

import org.example.delivery_service.model.Delivery;

import java.util.List;

public interface DeliveryService {
    List<Delivery> findAll();
    Delivery findByCourierNameAndDeliveryStatus(String courierName, Boolean status);
}
