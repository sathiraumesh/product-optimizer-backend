package com.techass.prodcutpriceoptimizer.models;

import com.fasterxml.jackson.annotation.JsonAutoDetect;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

@Data
public class ProductPrice {

    private final long id;

    private final String name;

    private final double price;

    public ProductPrice( long id,  String name, double price) {
        this.id = id;
        this.name = name;
        this.price = price;
    }

}
