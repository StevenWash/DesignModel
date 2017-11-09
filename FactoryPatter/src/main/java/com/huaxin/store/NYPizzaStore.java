package com.huaxin.store;

import com.huaxin.product.NYCheesePizza;
import com.huaxin.product.NYClamPizza;
import com.huaxin.product.Pizza;

public class NYPizzaStore extends PizzaStore {

    public Pizza createPizza(String type) {
        if (type.equals("cheese")){
            return new NYCheesePizza();
        }else if (type.equals("clam")) {
            return new NYClamPizza();
        }else
            return null;
    }
}
