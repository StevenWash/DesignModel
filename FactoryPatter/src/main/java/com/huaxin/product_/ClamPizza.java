package com.huaxin.product_;

import com.huaxin.factory.PizzaIngredientFactory;
import com.huaxin.product_.Pizza_;

/**
 * 创建蛤蜊披萨
 */
public class ClamPizza extends Pizza_ {
    PizzaIngredientFactory pizzaIngredientFactory;

    public ClamPizza(PizzaIngredientFactory pizzaIngredientFactory){
        this.pizzaIngredientFactory = pizzaIngredientFactory;
    }

    public void prepare() {
        System.out.println("Preparing "+name);
        dough = pizzaIngredientFactory.createDough();
        sauce = pizzaIngredientFactory.createSauce();
        cheese = pizzaIngredientFactory.createCheese();
        clams = pizzaIngredientFactory.createClams();
    }
}
