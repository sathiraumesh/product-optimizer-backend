package com.techass.productpriceoptimizer

import com.techass.prodcutpriceoptimizer.Application
import com.techass.prodcutpriceoptimizer.repository.ProductRepository
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.test.context.SpringBootTest
import org.springframework.context.ApplicationContext
import spock.lang.Shared
import spock.lang.Specification

@SpringBootTest(classes = Application.class)
class ProductDaoTest extends Specification {
    @Autowired
    ApplicationContext context;
    @Shared
    def ProductRepository productRepository

    def setup(){
        productRepository = context.getBean("ProductDao")
    }

    def "product service bean loading test  "(){

        expect:"Expect the ProductService Bean is loaded when the context loads"
        productRepository!=null
    }

    def "find product by ID Test"(){

        expect:"Expect product service test to be not null for an ID"
        productRepository.findById(1)!==null;

        when:"The id is not valid"
        productRepository.findById(0);
        then:
        thrown RuntimeException


    }

    def "get all products  Test"(){
        expect:
        productRepository.findAll()!==null;
    }

}