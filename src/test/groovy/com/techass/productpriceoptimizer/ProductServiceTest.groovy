package com.techass.productpriceoptimizer

import com.techass.prodcutpriceoptimizer.Application
import com.techass.prodcutpriceoptimizer.services.ProductService
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.test.context.SpringBootTest
import org.springframework.context.ApplicationContext
import spock.lang.Specification


@SpringBootTest(classes = Application.class)
class ProductServiceTest extends Specification {


    @Autowired
    ApplicationContext context;


    def "when context is loaded check for ProductServiceBean"(){
        given:
        def ProductService productService = context.getBean("ProductService")
        expect:
        productService!=null
    }

    def "find product by ID Test"(){
        given:
        def ProductService productService = context.getBean("ProductService")

        expect:
        productService.getProductById(1)!==null;


    }


}