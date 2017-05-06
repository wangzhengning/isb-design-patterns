package com.designpatterns.example.part03decorator;

/**
 * Created by zn.wang on 17/5/6.
 * 浓缩咖啡
 */
public class EspressoComponent extends BeverageComponentAbstract{

    public EspressoComponent(){
        description = "Espresso";
    }
    @Override
    public double cost ( ) {
        return 1.99;
    }
}
