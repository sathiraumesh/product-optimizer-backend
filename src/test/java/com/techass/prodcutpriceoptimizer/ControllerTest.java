package com.techass.prodcutpriceoptimizer;

import com.techass.prodcutpriceoptimizer.models.Product;
import com.techass.prodcutpriceoptimizer.repository.ProductRepositoryImp;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.jdbc.JdbcTest;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.test.annotation.DirtiesContext;
import org.springframework.test.context.TestExecutionListeners;
import org.springframework.test.context.jdbc.Sql;
import org.springframework.test.context.jdbc.SqlScriptsTestExecutionListener;

import java.util.List;



@JdbcTest
@Sql("classpath:data.sql")
public class ControllerTest {

    private NamedParameterJdbcTemplate jdbcTemplate;

    private ProductRepositoryImp productRepositoryImp;

    @Autowired
    public ControllerTest(NamedParameterJdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
        productRepositoryImp = new ProductRepositoryImp(jdbcTemplate);
    }

    @Test
    public  void run(){
        List<Product> products = productRepositoryImp.findAll();
    }
}
