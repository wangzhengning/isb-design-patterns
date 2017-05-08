package com.designpatterns.example.part042factory;

/**
 * Created by zn.wang on 17/5/8.
 * 披萨原料工厂
 */
public interface PizzaIngredientFactory {

    public Dough createDough();
    public Sauce createSauce();
    public Cheese createCheese();
    public Veggies[] createVeggies();
    public Pepperoni createPepperoni();
    public Clams createClam();

}
