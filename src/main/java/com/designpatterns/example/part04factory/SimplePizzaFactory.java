package com.designpatterns.example.part04factory;

/**
 * Created by zn.wang on 17/5/7.
 */
public class SimplePizzaFactory {

    public Pizza createPizza(String type){
        Pizza pizza = null;
        if(type.equals ( "cheese" )){
            //芝士汉堡
            pizza = new CheesePizza ();
        }
        else if(type.equals ( "pepperoniPizza" )){
            //意大利辣香肠汉堡
            pizza = new PepperoniPizza ();
        }
        else if(type.equals ( "clam" )){
            //蛤蜊汉堡
            pizza = new ClamPizza ();
        }
        else if(type.equals ( "veggie" )){
            //蔬菜汉堡
            pizza = new VeggiePizza ();
        }

        return pizza;
    }

}















