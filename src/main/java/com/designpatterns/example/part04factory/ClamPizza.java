package com.designpatterns.example.part04factory;

/**
 * Created by zn.wang on 17/5/7.
 * 蛤蜊汉堡
 */
public class ClamPizza extends Pizza{
    public ClamPizza(){
        name = "Clam Pizza";
        dough = "Thin crust";
        sauce = "White garlic sauce";
        toppings.add ( "Clams" );
        toppings.add ( "Grated parmesan cheese" );
    }
}
