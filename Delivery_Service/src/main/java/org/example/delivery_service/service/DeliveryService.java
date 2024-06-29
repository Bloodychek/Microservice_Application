package org.example.delivery_service.service;

import org.example.delivery_service.model.Delivery;

public interface DeliveryService {
    Delivery findByCourierNameAndDeliveryStatus(String courierName, Boolean status);
}
