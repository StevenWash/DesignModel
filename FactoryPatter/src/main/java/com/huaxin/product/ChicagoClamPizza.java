package com.huaxin.product;

public class ChicagoClamPizza extends Pizza {
    public ChicagoClamPizza(){
        name = "ChicagoClamPizza";
        dough = "薄饼";
        sauce = "适量的酱料";

        toppings.add("意大利Clam");
    }

    @Override
    public void cut() {
        System.out.println("Cut the pizza into square shape...");
    }
}
