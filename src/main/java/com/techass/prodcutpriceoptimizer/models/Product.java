package com.techass.prodcutpriceoptimizer.models;


public class Product {


    private  long id ;


    private  String name;


    private  int unitsPerCarton;


    private  double catrtonPrice;

    public Product() {
    }

    public Product(long id, String name, int unitsPerCarton, double catrtonPrice) {
        this.id = id;
        this.name = name;
        this.unitsPerCarton = unitsPerCarton;
        this.catrtonPrice = catrtonPrice;
    }

    public long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getUnitsPerCarton() {
        return unitsPerCarton;
    }

    public double getCatrtonPrice() {
        return catrtonPrice;
    }

    public void setId(long id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setUnitsPerCarton(int unitsPerCarton) {
        this.unitsPerCarton = unitsPerCarton;
    }

    public void setCatrtonPrice(double catrtonPrice) {
        this.catrtonPrice = catrtonPrice;
    }
}
