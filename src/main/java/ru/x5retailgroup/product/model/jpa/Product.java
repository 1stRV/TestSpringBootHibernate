package ru.x5retailgroup.product.model.jpa;

import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;

@Entity(name = "PRODUCT")
@Data
public class Product implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String model;

    @OneToOne(cascade=CascadeType.ALL)
    private Characteristic characteristic;

}
