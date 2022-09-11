package com.composite;

import java.util.ArrayList;
import java.util.List;

public class Component extends Composite {
    String name;
    public Component( String name){

        this.name = name;
    }
    List<Composite> children = new ArrayList<>();

    public void add(Composite composite){
        children.add(composite);
    }

    @Override
    public void price() {
        System.out.println(this.name);
        for(Composite composite:children){
            composite.price();
        }
    }
}
