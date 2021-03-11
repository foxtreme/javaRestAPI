package com.shopping.demo.model;

public class ShoppingItem {
    private final long id;
    private final String name;
    private int quantity;

    public ShoppingItem(long id, String name, int quantity) {
        this.id = id;
        this.name = name;
        this.quantity = quantity;
    }

    public long getId(){
        return this.id;
    }

    public String getName(){
        return this.name;
    }

    public int getQuantity(){
        return this.quantity;
    }
    
}
