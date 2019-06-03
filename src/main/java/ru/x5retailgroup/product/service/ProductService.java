package ru.x5retailgroup.product.service;

import ru.x5retailgroup.product.model.jpa.Product;

import java.util.List;
import java.util.Optional;

public interface ProductService {
    Optional<Product> findById(Long id);

    Product save(Product product);

    List<Product> getAll();
}
