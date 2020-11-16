package com.techass.prodcutpriceoptimizer.repository;

import com.techass.prodcutpriceoptimizer.models.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.namedparam.MapSqlParameterSource;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.jdbc.core.namedparam.SqlParameterSource;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository("ProductDao")
public class ProductRepositoryImp implements ProductRepository {

    @Autowired
    private NamedParameterJdbcTemplate namedParameterJdbcTemplate;


    @Override
    public List<Product> findAll() {
        String query = "select * from productlist;";
         return namedParameterJdbcTemplate.query(query, new ProductRowMapper());
    }

    @Override
    public Product findById(long id) {
        String query = "select * from productlist where id=:id;";
        SqlParameterSource namedParameters = new MapSqlParameterSource("id",Long.valueOf(id));
        return namedParameterJdbcTemplate.queryForObject(query,namedParameters,new ProductRowMapper());
    }
}
