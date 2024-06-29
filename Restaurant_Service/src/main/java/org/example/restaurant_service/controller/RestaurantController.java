package org.example.restaurant_service.controller;

import lombok.RequiredArgsConstructor;
import org.example.restaurant_service.model.Restaurant;
import org.example.restaurant_service.service.RestaurantService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/restaurant/")
@RequiredArgsConstructor
public class RestaurantController {
    private final RestaurantService restaurantService;

    @GetMapping
    public List<Restaurant> getAll() {
        return restaurantService.findAll();
    }

    @PostMapping
    public Restaurant add(@RequestBody Restaurant restaurant) {
        return restaurantService.add(restaurant);
    }
}
