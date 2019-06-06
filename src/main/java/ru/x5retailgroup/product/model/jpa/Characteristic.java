package ru.x5retailgroup.product.model.jpa;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Data;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Data
@Entity
@JsonIgnoreProperties({"hibernateLazyInitializer", "handler", "products"})
class Characteristic {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @OneToMany(mappedBy = "characteristic")
    private List<Product> products = new ArrayList<>();

    private String cpu;
    private String memory;
    private String color;
    private String weight;
}
