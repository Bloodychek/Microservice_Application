package org.example.delivery_service.service.impl;

import lombok.RequiredArgsConstructor;
import org.example.delivery_service.model.Delivery;
import org.example.delivery_service.repository.DeliveryRepository;
import org.example.delivery_service.service.DeliveryService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class DeliveryServiceImpl implements DeliveryService {
    private final DeliveryRepository deliveryRepository;

    @Override
    public List<Delivery> findAll() {
        return deliveryRepository.findAll();
    }

    @Override
    public Delivery findByCourierNameAndDeliveryStatus(String courierName, Boolean status) {
        return this.deliveryRepository.findByCourierNameAndDeliveryStatus(courierName, status);
    }
}
