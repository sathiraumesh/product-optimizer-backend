package com.techass.prodcutpriceoptimizer.models;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

import java.util.List;

@Data
public class Order {

    private final int Id;

    private final List<ProductOrder> order;

    public Order(  int id, List<ProductOrder> order) {
        Id = id;
        this.order = order;
    }

}
