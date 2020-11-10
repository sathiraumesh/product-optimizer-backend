package com.techass.prodcutpriceoptimizer.repository;

import com.techass.prodcutpriceoptimizer.models.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class ProductRepositoryImp implements ProductRepository {

    @Autowired
    private  JdbcTemplate jdbcTemplate;




    @Override
    public List<Product> findAll() {
         return jdbcTemplate.query("select * from productlist;",
                new ProductRowMapper());
    }

    @Override
    public Product findById(long id) {
        return jdbcTemplate.queryForObject("select * from productlist where id=?;",
                new Object[]{id},
                new BeanPropertyRowMapper<>(Product.class));
    }
}
