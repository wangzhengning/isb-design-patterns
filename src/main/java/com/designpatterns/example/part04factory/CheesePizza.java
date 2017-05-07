package com.designpatterns.example.part04factory;

/**
 * Created by zn.wang on 17/5/7.
 * 芝士汉堡饱
 */
public class CheesePizza extends Pizza{
    public CheesePizza(){
        name = "Cheese Pizza";
        dough = "Regular Crust";
        sauce = "Marinara Pizza Sauce";
        toppings.add ( "Fresh Mozzarella" );
        toppings.add ( "Parmesan" );
    }
}
