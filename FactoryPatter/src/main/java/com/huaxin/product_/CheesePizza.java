package com.huaxin.product_;

import com.huaxin.factory.PizzaIngredientFactory;
import com.huaxin.product_.Pizza_;

/**
 * 创建奶酪披萨
 */
public class CheesePizza extends Pizza_ {
    private PizzaIngredientFactory pizzaIngredientFactory ;

    public CheesePizza(PizzaIngredientFactory pizzaIngredientFactory){
        this.pizzaIngredientFactory = pizzaIngredientFactory;
    }

    public void prepare() {
        System.out.println("Preparing "+name);
        dough = pizzaIngredientFactory.createDough();
        sauce = pizzaIngredientFactory.createSauce();
        cheese = pizzaIngredientFactory.createCheese();
    }
}
