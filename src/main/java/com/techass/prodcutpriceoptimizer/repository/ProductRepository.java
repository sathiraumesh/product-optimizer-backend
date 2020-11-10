package com.techass.prodcutpriceoptimizer.repository;

import com.techass.prodcutpriceoptimizer.models.Product;

import java.util.List;

public interface ProductRepository {

    public List<Product> findAll();

    public Product findById(long id);
}
