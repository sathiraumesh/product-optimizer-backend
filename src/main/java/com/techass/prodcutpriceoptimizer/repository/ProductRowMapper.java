package com.techass.prodcutpriceoptimizer.repository;

import com.techass.prodcutpriceoptimizer.models.Product;
import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

public class ProductRowMapper implements RowMapper<Product> {

    @Override
    public Product mapRow(ResultSet rs, int rowNum) throws SQLException {
        Product product = new Product();
        product.setId(rs.getLong("id"));
        product.setName(rs.getString("name"));
        product.setCartonPrice(rs.getDouble("price"));
        product.setUnitsPerCarton(rs.getInt("upc"));
        return product;
    }
}
