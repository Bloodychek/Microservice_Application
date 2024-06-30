package org.example.delivery_service.repository;

import org.example.delivery_service.model.Delivery;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DeliveryRepository extends JpaRepository<Delivery, Integer> {
    Delivery findByCourierNameAndDeliveryStatus(String courierName, Boolean status);
}
