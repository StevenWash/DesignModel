package com.huaxin.product_;

import com.huaxin.ingredient.cheese.Cheese;
import com.huaxin.ingredient.clam.Clams;
import com.huaxin.ingredient.dough.Dough;
import com.huaxin.ingredient.pepperoni.Pepperoni;
import com.huaxin.ingredient.sauce.Sauce;
import com.huaxin.ingredient.veggies.Veggies;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * 定一个抽象的pizza类，其中参数的具体值由其继承的之类来进行赋值的操作
 */
public abstract class Pizza_ {
    public String name;
    public Dough dough;
    public Sauce sauce;
    public Veggies veggies[];
    public Cheese cheese;
    public Pepperoni pepperoni;
    public Clams clams;

    public abstract void prepare ();

    public void bake (){
        System.out.println("Bake the pizza...");
    }

    public void cut (){
        System.out.println("Cut the pizza to circle...");
    }

    public void box (){
        System.out.println("Place the pizza into a box...");
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Pizza_{" +
                "name='" + name + '\'' +
                ", dough='" + dough + '\'' +
                ", sauce='" + sauce + '\'' +
                ", veggies=" + Arrays.toString(veggies) +
                ", cheese=" + cheese +
                ", pepperoni=" + pepperoni +
                ", clams=" + clams +
                '}';
    }
}
