package org.example.delivery_service.model;

import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "delivery", schema = "public")
@NoArgsConstructor
@Data
public class Delivery {
    @Id
    @Column(name = "delivery_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer deliveryId;

    @Column(name = "courier_name")
    private String courierName;

    @Column(name = "delivery_status")
    private Boolean deliveryStatus;
}
