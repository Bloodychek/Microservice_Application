package org.example.restaurant_service.repository;

import org.example.restaurant_service.model.Menu;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MenuRepository extends JpaRepository<Menu, Integer> {
    Menu findByDishName(String dishName);
}
