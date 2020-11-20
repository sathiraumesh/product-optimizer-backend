package com.techass.prodcutpriceoptimizer.models;


import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;

@Data
@Entity
public class Product {

    @Id
    public  long id ;


    private  String name;


    private  int unitsPerCarton;


    private  double cartonPrice;

    public Product() {
    }

    public Product(long id, String name, int unitsPerCarton, double cartonPrice) {
        this.id = id;
        this.name = name;
        this.unitsPerCarton = unitsPerCarton;
        this.cartonPrice = cartonPrice;
    }



}
