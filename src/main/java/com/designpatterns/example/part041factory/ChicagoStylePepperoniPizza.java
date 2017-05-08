package com.designpatterns.example.part041factory;

/**
 * Created by zn.wang on 17/5/8.
 * 芝加哥风格辣香肠披萨
 */
public class ChicagoStylePepperoniPizza extends Pizza {
    public ChicagoStylePepperoniPizza() {
        name = "Chicago Style Pepperoni Pizza";
        dough = "Extra Thick Crust Dough";
        sauce = "Plum Tomato Sauce";

        toppings.add("Shredded Mozzarella Cheese");
        toppings.add("Black Olives");
        toppings.add("Spinach");
        toppings.add("Eggplant");
        toppings.add("Sliced Pepperoni");
    }

    public void cut() {
        System.out.println("Cutting the pizza into square slices");
    }
}
