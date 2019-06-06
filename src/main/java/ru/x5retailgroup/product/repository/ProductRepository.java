package ru.x5retailgroup.product.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ru.x5retailgroup.product.model.jpa.Product;

@Repository
public interface ProductRepository extends JpaRepository<Product, Long> {
    Product findByName(String name);
}
