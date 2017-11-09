package com.huaxin.factory;

import com.huaxin.ingredient.cheese.Cheese;
import com.huaxin.ingredient.cheese.MozzarellaCheese;
import com.huaxin.ingredient.clam.Clams;
import com.huaxin.ingredient.clam.FrozenClams;
import com.huaxin.ingredient.dough.Dough;
import com.huaxin.ingredient.dough.ThickCrustDough;
import com.huaxin.ingredient.pepperoni.Pepperoni;
import com.huaxin.ingredient.pepperoni.SlicedPepperoni;
import com.huaxin.ingredient.sauce.PlumTomtoSauce;
import com.huaxin.ingredient.sauce.Sauce;
import com.huaxin.ingredient.veggies.BlackOlives;
import com.huaxin.ingredient.veggies.EggPlant;
import com.huaxin.ingredient.veggies.Spinach;
import com.huaxin.ingredient.veggies.Veggies;

public class ChicagoPizzaIngredientFactory implements PizzaIngredientFactory {
    public Dough createDough() {
        return new ThickCrustDough();
    }

    public Sauce createSauce() {
        return new PlumTomtoSauce();
    }

    public Clams createClams() {
        return new FrozenClams();
    }

    public Cheese createCheese() {
        return new MozzarellaCheese();
    }

    public Veggies[] createVeggies() {
        Veggies[] veggies = {new BlackOlives(),new Spinach(),new EggPlant()};
        return veggies;
    }

    public Pepperoni createPrpperoni() {
        return new SlicedPepperoni();
    }
}
