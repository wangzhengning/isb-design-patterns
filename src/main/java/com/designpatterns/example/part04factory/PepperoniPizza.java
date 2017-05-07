package com.designpatterns.example.part04factory;

/**
 * Created by zn.wang on 17/5/7.
 * 意大利辣香肠披萨
 */
public class PepperoniPizza extends Pizza{
    public PepperoniPizza(){
        name = "pepperoni Pizza";
        dough = "Crust";
        sauce = "Marinara sauce";
        toppings.add ( "Sliced Pepperoni" );
        toppings.add ( "Sliced Onion" );
        toppings.add ( "Grated parmesan cheese" );
    }
}
