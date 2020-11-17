package com.techass.productpriceoptimizer

import com.techass.prodcutpriceoptimizer.Application
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.test.context.SpringBootContextLoader
import org.springframework.boot.test.context.SpringBootTest
import org.springframework.context.ApplicationContext
import org.springframework.test.context.ContextConfiguration
import spock.lang.Specification


@ContextConfiguration(loader = SpringBootContextLoader.class, classes = [Application.class])
class ApplicationContextTest extends Specification {

    @Autowired
    ApplicationContext context
    def "when context is loaded" () {
        expect:"Expect the context to be not null"
         context !=null

    }


}