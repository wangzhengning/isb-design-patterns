package com.designpatterns.example.part04factory;

/**
 * Created by zn.wang on 17/5/7.
 */
public class PizzaTestDriveApplication {

    public static void main ( String[] args ) {

        SimplePizzaFactory factory = new SimplePizzaFactory ();
        PizzaStore pizzaStore = new PizzaStore ( factory );

        Pizza pizza = pizzaStore.orderPizza ( "cheese" );
        System.out.println ("We ordered a " + pizza.getName () +"\n");
        System.out.println (pizza);

        System.out.println ("=======================");

        pizza = pizzaStore.orderPizza ( "veggie" );
        System.out.println ("We ordered a " + pizza.getName () +"\n");
        System.out.println (pizza);

    }
}
