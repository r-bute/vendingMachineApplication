package com.perscholas.java_basics;

public class Product {
    private String name;
    private double price;

    public Product(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }
    //setter for name
    public void setName(String name) {
        this.name = name;
    }
    public double getPrice() {
        return price;
    }
    //setter for price
    public void setPrice(double price) {
        this.price = price;
    }
    //Override toString
    @Override
    public String toString() {
        return "Product [name=" + name + ", price=" + price + "]";
    }


}
