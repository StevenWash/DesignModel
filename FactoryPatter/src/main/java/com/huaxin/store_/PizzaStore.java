package com.huaxin.store_;

import com.huaxin.product_.Pizza_;

public abstract class PizzaStore {

    public Pizza_ orderPizza (String type){
        Pizza_ pizza;
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
    public abstract Pizza_ createPizza(String type) ;
}
