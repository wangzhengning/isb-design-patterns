package com.designpatterns.example.part041factory;

/**
 * Created by zn.wang on 17/5/8.
 * 纽约风格奶酪披萨
 */
public class NYStyleCheesePizza extends Pizza {

    public NYStyleCheesePizza() {
        name = "NY Style Sauce and Cheese Pizza";
        dough = "Thin Crust Dough";
        sauce = "Marinara Sauce";

        toppings.add("Grated Reggiano Cheese");
    }
}