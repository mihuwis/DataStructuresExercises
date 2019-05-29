package com.mihu.utills;

public class Product {

    private String name;
    private int price;

    public Product(String name, int price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public int getPrice() {
        return price;
    }

    @Override
    public int hashCode(){
        int prime = 31;
        int code = 1;
        code = prime * code + ((name == null)? 0 : name.hashCode());
        return code;
    }
}
