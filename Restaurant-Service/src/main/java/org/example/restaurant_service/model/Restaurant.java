package org.example.restaurant_service.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Entity
@Table(name = "restaurants", schema = "public")
@NoArgsConstructor
@Data
public class Restaurant {
    @Id
    @Column(name = "restaurant_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer restaurantId;

    @Column(name = "restaurant_name")
    private String restaurantName;

    @OneToMany(mappedBy = "restaurant")
    @JsonIgnoreProperties("menuList")
    private List<Menu> menuList;
}
