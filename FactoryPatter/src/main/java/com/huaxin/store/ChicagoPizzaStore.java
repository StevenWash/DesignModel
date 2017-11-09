package com.huaxin.store;

import com.huaxin.product.ChicagoCheesePizza;
import com.huaxin.product.ChicagoClamPizza;
import com.huaxin.product.Pizza;

public class ChicagoPizzaStore extends PizzaStore {
    public Pizza createPizza(String type) {
        if (type.equals("cheese")) {
            return new ChicagoCheesePizza();
        }else if (type.equals("clam")) {
            return new ChicagoClamPizza();
        }else {
            return null;
        }
    }
}
