package org.example.restaurant_service.service.impl;

import lombok.RequiredArgsConstructor;
import org.example.restaurant_service.model.Restaurant;
import org.example.restaurant_service.repository.RestaurantRepository;
import org.example.restaurant_service.service.RestaurantService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class RestaurantServiceImpl implements RestaurantService {
    private final RestaurantRepository restaurantRepository;

    @Override
    public List<Restaurant> findAll() {
        return restaurantRepository.findAll();
    }

    @Override
    public Restaurant add(Restaurant restaurant) {
        return restaurantRepository.saveAndFlush(restaurant);
    }
}
