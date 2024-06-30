package org.example.restaurant_service.service;

import org.example.restaurant_service.model.Menu;

public interface MenuService {
    Menu findByDishName(String dishName);

    Menu add(Menu dish);

    Menu update(Menu dish, int id);

    void delete(int id);
}
