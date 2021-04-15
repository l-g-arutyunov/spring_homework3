package com.geekbrains.repository;

import com.geekbrains.entity.Product;
import lombok.Getter;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

@Getter
@Repository
public class ProductRepositoryImpl implements ProductRepository {
    private final Set<Product> productSet = new HashSet<>();

    @Override
    public void addProduct(Product product) {
        productSet.add(product);
    }
}
