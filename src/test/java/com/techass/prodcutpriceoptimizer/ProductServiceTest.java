package com.techass.prodcutpriceoptimizer;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.techass.prodcutpriceoptimizer.models.Order;
import com.techass.prodcutpriceoptimizer.models.ProductOrder;
import com.techass.prodcutpriceoptimizer.services.ProductService;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.ArrayList;
import java.util.List;

@SpringBootTest
public class ProductServiceTest {

    @Autowired
    ProductService productService;
    @Test
    public void calculatePriceOrderedUnitsTest() throws Exception{
        // test with 0 values
        assertEquals(0, this.productService.calculatePriceOrderedUnits(0,0,0) );

        // test for cartons without discount and single units
        assertEquals(10, this.productService.calculatePriceOrderedUnits(10,10,10) );

        // test for carton and single units
        assertEquals(10+13,this.productService.calculatePriceOrderedUnits(10,10,11) );

        // test for discounts for cartons
        assertEquals(3*10-3*10*0.1,this.productService.calculatePriceOrderedUnits(10,10,30) );

        // test for discounts for cartons and single units
        assertEquals(3*10-3*10*0.1+13,this.productService.calculatePriceOrderedUnits(10,10,31) );


    }

    @Test
    public void getPriceTest() throws Exception{


        // test for carton price
        List<ProductOrder> productOrderList = new ArrayList<>();
        ProductOrder prodOd1 = new ProductOrder(1,20);
        productOrderList.add(prodOd1);
        Order order = new Order(2,productOrderList);
        assertEquals(175,this.productService.getPrice(order));

        // test for single units
        productOrderList = new ArrayList<>();
        prodOd1 = new ProductOrder(1,21);
        productOrderList.add(prodOd1);
        Order order2 = new Order(2,productOrderList);
        assertEquals(175+175*1.3,this.productService.getPrice(order2));

        // test for discount
        productOrderList = new ArrayList<>();
        prodOd1 = new ProductOrder(1,60);
        productOrderList.add(prodOd1);
        Order order3 = new Order(2,productOrderList);
        assertEquals(175*3 - 3*0.1*175,this.productService.getPrice(order3));

        // test for discount with single units
        productOrderList = new ArrayList<>();
        prodOd1 = new ProductOrder(1,61);
        productOrderList.add(prodOd1);
        Order order4 = new Order(2,productOrderList);
        assertEquals(175*3 - 3*0.1*175 +175*1.3,this.productService.getPrice(order4));

        // test for combined products considering all the cases
        productOrderList = new ArrayList<>();
        prodOd1 = new ProductOrder(1,61);
        ProductOrder prodOd2 = new ProductOrder(2,16);
        productOrderList.add(prodOd1);
        productOrderList.add(prodOd2);
        Order order5 = new Order(2,productOrderList);
        assertEquals((175*3 - 3*0.1*175+175*1.3)+ (825*3- 3*0.1*825+825*1.3),this.productService.getPrice(order5));
    }
}
