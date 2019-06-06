package ru.x5retailgroup.product.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;
import ru.x5retailgroup.product.model.jpa.Product;
import ru.x5retailgroup.product.service.ProductService;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api")
@RequiredArgsConstructor
public class ProductController {

    private final ProductService productService;

    @GetMapping(value = "/{id}")
    public Optional<Product> getProductById(@PathVariable("id") Long id) {
        return productService.findById(id);
    }

    @GetMapping(value = "/products")
    public List<Product> getAllProducts() {
        return productService.getAll();
    }

    @PostMapping(value = "/product")
    public Product createProduct(@RequestBody Product product) {
        return productService.save(product);
    }

    @GetMapping(value = "/product/{name}")
    public Product getProductByName(@PathVariable("name") String name) {
        return productService.findByName(name);
    }
}



