package com.designpatterns.example.part041factory;

/**
 * Created by zn.wang on 17/5/8.
 * 芝加哥风格蔬菜披萨
 */
public class ChicagoStyleVeggiePizza extends Pizza {
    public ChicagoStyleVeggiePizza() {
        name = "Chicago Deep Dish Veggie Pizza";
        dough = "Extra Thick Crust Dough";
        sauce = "Plum Tomato Sauce";

        toppings.add("Shredded Mozzarella Cheese");
        toppings.add("Black Olives");
        toppings.add("Spinach");
        toppings.add("Eggplant");
    }

    public void cut() {
        System.out.println("Cutting the pizza into square slices");
    }
}
