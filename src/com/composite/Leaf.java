package com.composite;




public class Leaf extends Composite {
    int price;
    String name;
    public Leaf(int price, String name){
        this.price = price;
        this.name = name;
    }


    @Override
    public void price() {
        System.out.println(this.name + " : " + this.price);
    }
}
