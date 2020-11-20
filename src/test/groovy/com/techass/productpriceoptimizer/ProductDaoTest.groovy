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
class ProductDaoTest extends Specification {

    private NamedParameterJdbcTemplate jdbcTemplate;

    private ProductRepositoryImp productRepositoryImp;

    @Autowired
    public ControllerTest(NamedParameterJdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
        productRepositoryImp = new ProductRepositoryImp(jdbcTemplate);

    }
//    @Autowired
//    ApplicationContext context;
//    @Shared
//    def ProductRepository productRepository
//
    def setup(){
       productRepositoryImp.createTable()
    }
//
    def "product service bean loading test  "(){

        expect:"Expect the ProductService Bean is loaded when the context loads"
        productRepositoryImp!=null
    }
//
//    def "find product by ID Test"(){
//
//        expect:"Expect product service test to be not null for an ID"
//        productRepository.findById(1)!==null;
//
//        when:"The id is not valid"
//        productRepository.findById(0);
//        then:
//        thrown RuntimeException
//
//
//    }
//
    def "get all products  Test"(){
        productRepositoryImp.createTable()
    }

}