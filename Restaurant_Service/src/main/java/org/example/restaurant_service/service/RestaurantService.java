package org.example.restaurant_service.service;

import org.example.restaurant_service.model.Restaurant;

import java.util.List;

public interface RestaurantService {
    List<Restaurant> findAll();

    Restaurant add(Restaurant restaurant);
}
