package com.designpatterns.example.part03decorator;

/**
 * Created by zn.wang on 17/5/6.
 * 深焙咖啡
 */
public class DarkRoastComponent extends BeverageComponentAbstract{

    public DarkRoastComponent(){
        description = "Dark Roast Coffee";
    }

    @Override
    public double cost ( ) {
        return 0.99;
    }
}
