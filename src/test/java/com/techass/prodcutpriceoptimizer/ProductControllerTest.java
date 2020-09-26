package com.techass.prodcutpriceoptimizer;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.techass.prodcutpriceoptimizer.models.Order;
import com.techass.prodcutpriceoptimizer.models.ProductOrder;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;

import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;


import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.web.servlet.MockMvc;

import java.util.ArrayList;
import java.util.List;

@SpringBootTest
@AutoConfigureMockMvc
public class ProductControllerTest {
    @Autowired
    private MockMvc mockMvc;


    @Test
    public void getAllProductReturnMessage() throws Exception {
        this.mockMvc.perform(get("/api/product")
                .contentType("application/json")).andDo(print())
                .andExpect(status().isOk());
    }

    @Test
    public void getPricePerUnits() throws Exception {
        this.mockMvc.perform(
                get("/api/product/price/{units}",10)
                .contentType("application/json")).andDo(print())
                .andExpect(status().isOk());
    }

    public static void main(String[] args) {

    }
    @Test
    public void calculatePrice() throws Exception {
        ObjectMapper obj = new ObjectMapper();
        List<ProductOrder> productOrderList = new ArrayList<>();
        ProductOrder prodOd1 = new ProductOrder(0,23);
        ProductOrder prodOd2 = new ProductOrder(1,25);
        productOrderList.add(prodOd1);
        productOrderList.add(prodOd2);
        Order order = new Order(2,productOrderList);
        String jsonStr = obj.writeValueAsString(order);
        this.mockMvc.perform(post("/api/product/price")
                .contentType("application/json")
                .content(jsonStr))
                .andDo(print())
                .andExpect(status().isOk());
    }


}
