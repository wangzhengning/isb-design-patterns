package com.designpatterns.example.part042factory;

/**
 * Created by zn.wang on 17/5/8.
 */
public class PizzaTestDriveAbstractFactoryFunctionApplication {
    public static void main(String[] args) {
        PizzaIngredientFactory nyIngredientFactory = new NYPizzaIngredientFactory();
        PizzaStore nyStore = new NYPizzaStore(nyIngredientFactory);

        PizzaIngredientFactory chicagoingredientFactory = new ChicagoPizzaIngredientFactory();
        PizzaStore chicagoStore = new ChicagoPizzaStore(chicagoingredientFactory);

        Pizza pizza = nyStore.orderPizza("cheese");
        System.out.println("Ethan ordered a " + pizza + "\n");

        pizza = chicagoStore.orderPizza("cheese");
        System.out.println("Joel ordered a " + pizza + "\n");

        pizza = nyStore.orderPizza("clam");
        System.out.println("Ethan ordered a " + pizza + "\n");

        pizza = chicagoStore.orderPizza("clam");
        System.out.println("Joel ordered a " + pizza + "\n");

        pizza = nyStore.orderPizza("pepperoni");
        System.out.println("Ethan ordered a " + pizza + "\n");

        pizza = chicagoStore.orderPizza("pepperoni");
        System.out.println("Joel ordered a " + pizza + "\n");

        pizza = nyStore.orderPizza("veggie");
        System.out.println("Ethan ordered a " + pizza + "\n");

        pizza = chicagoStore.orderPizza("veggie");
        System.out.println("Joel ordered a " + pizza + "\n");
    }
}
