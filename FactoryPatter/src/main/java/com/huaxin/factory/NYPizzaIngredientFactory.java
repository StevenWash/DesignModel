package com.huaxin.factory;

import com.huaxin.ingredient.cheese.Cheese;
import com.huaxin.ingredient.cheese.ReggianoCheese;
import com.huaxin.ingredient.clam.Clams;
import com.huaxin.ingredient.clam.FreshClams;
import com.huaxin.ingredient.dough.Dough;
import com.huaxin.ingredient.dough.ThinCrustDough;
import com.huaxin.ingredient.pepperoni.Pepperoni;
import com.huaxin.ingredient.pepperoni.SlicedPepperoni;
import com.huaxin.ingredient.sauce.MarinaraSauce;
import com.huaxin.ingredient.sauce.Sauce;
import com.huaxin.ingredient.veggies.*;

public class NYPizzaIngredientFactory implements PizzaIngredientFactory {
    public Dough createDough() {
        return new ThinCrustDough();
    }

    public Sauce createSauce() {
        return new MarinaraSauce();
    }

    public Clams createClams() {
        return new FreshClams();
    }

    public Cheese createCheese() {
        return new ReggianoCheese();
    }

    public Veggies[] createVeggies() {
        Veggies [] veggies = {new Garlic(),new Onion(),new Mushroom(),new RedPepper()};
        return veggies;
    }

    public Pepperoni createPrpperoni() {
        return new SlicedPepperoni();
    }
}
