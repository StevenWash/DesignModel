package com.huaxin.store;

import com.huaxin.product.Pizza;

public abstract class PizzaStore {

    public Pizza orderPizza (String type){
        Pizza pizza;
        pizza = createPizza(type);

        pizza.prepare();
        pizza.bake();
        pizza.cut();
        pizza.box();

        return pizza;
    }

    /**
     * 抽象的工厂方法，必须由子类实现
     * @param type 要创建的披萨的口味
     * @return 一个创建好了的pizza
     */
    public abstract Pizza createPizza(String type) ;
}
