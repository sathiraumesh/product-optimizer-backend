package com.techass.prodcutpriceoptimizer.models;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

@Data
public class ProductOrder {

    private final int productId;

    private final int units;

    public ProductOrder( int productId, int units) {
        this.productId = productId;
        this.units = units;
    }


}
