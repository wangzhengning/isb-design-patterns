package com.designpatterns.example.part04factory;

/**
 * Created by zn.wang on 17/5/7
 * 蔬菜比萨
 */
public class VeggiePizza extends Pizza{
    public VeggiePizza(){
        name = "Veggie Pizza";
        dough = "Crust";
        sauce = "Marinara sauce";
        toppings.add ( "Shredded mozzarella" );
        toppings.add ( "Grated parmesan" );
        toppings.add ( "Diced onion" );
        toppings.add ( "Sliced mushrooms" );
        toppings.add ( "Sliced red pepper" );
        toppings.add ( "Sliced black olives" );
    }
}























