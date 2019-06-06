package ru.x5retailgroup.product.model.jpa;

import lombok.Data;

import javax.persistence.*;

@Entity(name = "PRODUCT")
@Data
public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    private String name;

    @ManyToOne(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    @JoinColumn(name = "characteristic_id")
    private Characteristic characteristic;
}
