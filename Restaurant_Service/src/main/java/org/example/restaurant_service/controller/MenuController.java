package org.example.restaurant_service.controller;

import lombok.RequiredArgsConstructor;
import org.example.restaurant_service.model.Menu;
import org.example.restaurant_service.service.MenuService;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/menu/dish/")
@RequiredArgsConstructor
public class MenuController {
    private final MenuService menuService;

    @GetMapping("{name}")
    public Menu getByDishName(@PathVariable String name) {
        return menuService.findByDishName(name);
    }

    @PostMapping
    public Menu add(@RequestBody Menu menu) {
        return menuService.add(menu);
    }

    @PutMapping("{id}")
    public Menu update(@RequestBody Menu menu, @PathVariable int id) {
        return menuService.update(menu, id);
    }

    @DeleteMapping("{id}")
    public void delete(@PathVariable int id) {
        menuService.delete(id);
    }
}
