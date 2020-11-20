package com.techass.productpriceoptimizer

import com.techass.prodcutpriceoptimizer.Application
import com.techass.prodcutpriceoptimizer.models.Product
import com.techass.prodcutpriceoptimizer.repository.ProductRepository
import com.techass.prodcutpriceoptimizer.repository.ProductRepositoryImp
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.SpringApplication
import org.springframework.boot.test.autoconfigure.jdbc.JdbcTest
import org.springframework.boot.test.context.SpringBootContextLoader
import org.springframework.boot.test.context.SpringBootTest
import org.springframework.context.ApplicationContext
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate
import org.springframework.test.annotation.DirtiesContext
import org.springframework.test.context.ContextConfiguration
import org.springframework.test.context.TestExecutionListeners
import org.springframework.test.context.TestPropertySource
import org.springframework.test.context.jdbc.Sql
import org.springframework.test.context.jdbc.SqlScriptsTestExecutionListener
import spock.lang.Shared
import spock.lang.Specification


@JdbcTest
@ContextConfiguration(loader = SpringBootContextLoader.class, classes = [ProductRepositoryImp.class])
//@Sql("classpath:data.sql")
class ProductDaoTest extends Specification {

    @Autowired
    private NamedParameterJdbcTemplate jdbcTemplate;

    private ProductRepositoryImp productRepositoryImp;


    def setup(){
        productRepositoryImp = new ProductRepositoryImp(jdbcTemplate);
    }

    def "product service bean loading test  "(){
        List<Product> products = productRepositoryImp.findAll();
        expect:"Expect the ProductService Bean is loaded when the context loads"
        products!=null
    }

    def "find product by ID Test"(){
        Product product = productRepositoryImp.findById(1);
        println product.name
        expect:"Expect product service test to be not null for an ID"
        product !=null

        when:"The id is not valid"
        productRepositoryImp.findById(0);
        then:
        thrown RuntimeException


    }

}