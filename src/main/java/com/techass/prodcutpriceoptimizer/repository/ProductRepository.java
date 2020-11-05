package com.techass.prodcutpriceoptimizer.repository;

import com.techass.prodcutpriceoptimizer.models.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductRepository extends JpaRepository<Product,Long> {
}
