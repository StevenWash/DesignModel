package com.huaxin.product;

public class ChicagoCheesePizza extends Pizza {

    public ChicagoCheesePizza(){
        name = "ChicagoCheesePizza";
        dough = "薄饼";
        sauce = "少量酱料";

        toppings.add("意大利白干酪");
    }

    @Override
    public void cut() {
        System.out.println("Cut the pizza into square shape...");
    }
}
