package com.techass.productpriceoptimizer

import com.techass.prodcutpriceoptimizer.Application
import com.techass.prodcutpriceoptimizer.services.ProductService
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.test.context.SpringBootContextLoader
import org.springframework.boot.test.context.SpringBootTest
import org.springframework.context.ApplicationContext
import org.springframework.test.context.ContextConfiguration
import spock.lang.Shared
import spock.lang.Specification


@ContextConfiguration(loader = SpringBootContextLoader.class, classes = [Application.class])
class ProductServiceTest extends Specification {





}