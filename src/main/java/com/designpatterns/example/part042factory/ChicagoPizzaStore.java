package com.designpatterns.example.part042factory;

/**
 * Created by zn.wang on 17/5/8.
 */
public class ChicagoPizzaStore extends PizzaStore {

    PizzaIngredientFactory ingredientFactory;
    public ChicagoPizzaStore(PizzaIngredientFactory ingredientFactory){
        this.ingredientFactory = ingredientFactory;
    }

    protected Pizza createPizza(String item) {
        Pizza pizza = null;
//        PizzaIngredientFactory ingredientFactory =
//                new ChicagoPizzaIngredientFactory();

        if (item.equals("cheese")) {

            pizza = new CheesePizza(ingredientFactory);
            pizza.setName("Chicago Style Cheese Pizza");

        } else if (item.equals("veggie")) {

            pizza = new VeggiePizza (ingredientFactory);
            pizza.setName("Chicago Style Veggie Pizza");

        } else if (item.equals("clam")) {

            pizza = new ClamPizza (ingredientFactory);
            pizza.setName("Chicago Style Clam Pizza");

        } else if (item.equals("pepperoni")) {

            pizza = new PepperoniPizza (ingredientFactory);
            pizza.setName("Chicago Style Pepperoni Pizza");

        }
        return pizza;
    }
}
