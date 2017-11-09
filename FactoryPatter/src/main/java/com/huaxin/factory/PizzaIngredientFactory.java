package com.huaxin.factory;

import com.huaxin.ingredient.cheese.Cheese;
import com.huaxin.ingredient.clam.Clams;
import com.huaxin.ingredient.dough.Dough;
import com.huaxin.ingredient.pepperoni.Pepperoni;
import com.huaxin.ingredient.sauce.Sauce;
import com.huaxin.ingredient.veggies.Veggies;

/**
 * 创建原料的接口
 */
public interface PizzaIngredientFactory {

    public Dough createDough();

    public Sauce createSauce();

    public Clams createClams();

    public Cheese createCheese();

    public Veggies[] createVeggies();

    public Pepperoni createPrpperoni();
}
