package com.huaxin.store_;

import com.huaxin.factory.NYPizzaIngredientFactory;
import com.huaxin.factory.PizzaIngredientFactory;
import com.huaxin.product_.CheesePizza;
import com.huaxin.product_.ClamPizza;
import com.huaxin.product_.Pizza_;

public class NYPizzaStore extends PizzaStore {
    public Pizza_ createPizza(String type) {
        Pizza_ pizza = null ;
        PizzaIngredientFactory pizzaIngredientFactory = new NYPizzaIngredientFactory();

        if(type.equals("cheese")){
            pizza = new CheesePizza(pizzaIngredientFactory);
            pizza.setName("NY Cheese");
        }else if(type.equals("clam")){
            pizza = new ClamPizza(pizzaIngredientFactory);
            pizza.setName("NY Clam");
        }
        return pizza;
    }
}
