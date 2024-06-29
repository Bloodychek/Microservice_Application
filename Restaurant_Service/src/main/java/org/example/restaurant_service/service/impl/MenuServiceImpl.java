package org.example.restaurant_service.service.impl;

import lombok.RequiredArgsConstructor;
import org.example.restaurant_service.model.Menu;
import org.example.restaurant_service.repository.MenuRepository;
import org.example.restaurant_service.service.MenuService;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
@RequiredArgsConstructor
public class MenuServiceImpl implements MenuService {
    private final MenuRepository menuRepository;

    @Override
    public Menu findByDishName(String dishName) {
        Optional<Menu> optional = Optional.ofNullable(menuRepository.findByDishName(dishName));
        Menu menu;
        if (optional.isPresent()) {
            menu = optional.get();
        } else {
            throw new RuntimeException();
        }
        return menu;
    }

    @Override
    public Menu add(Menu menu) {
        return this.menuRepository.saveAndFlush(menu);
    }

    @Override
    public Menu update(Menu newDish, int id) {
        return menuRepository.findById(id).map(dish -> {
                    dish.setDishName(newDish.getDishName());
                    return menuRepository.saveAndFlush(dish);
                })
                .orElseGet(() -> menuRepository.saveAndFlush(newDish));
    }

    @Override
    public void delete(int id) {
        this.menuRepository.deleteById(id);
    }
}
