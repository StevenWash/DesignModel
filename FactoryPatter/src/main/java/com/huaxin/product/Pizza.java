package com.huaxin.product;

import java.util.ArrayList;
import java.util.List;

/**
 * 定一个抽象的pizza类，其中参数的具体值由其继承的之类来进行赋值的操作
 */
public abstract class Pizza {
    public String name;
    public String dough;
    public String sauce;
    public List<String> toppings =new ArrayList<String>();

    public void prepare (){
        System.out.println("Preparing "+name);
        System.out.println("Tossing dough...");
        System.out.println("Adding sauce...");
        System.out.println("Adding topping:");

        for (int i=0 ; i<toppings.size() ;i++){
            System.out.println("     add "+toppings.get(i));
        }
    }

    public void bake (){
        System.out.println("Bake the pizza...");
    }

    public void cut (){
        System.out.println("Cut the pizza to circle...");
    }

    public void box (){
        System.out.println("Place the pizza into a box...");
    }

    public String getName() {
        return name;
    }
}
