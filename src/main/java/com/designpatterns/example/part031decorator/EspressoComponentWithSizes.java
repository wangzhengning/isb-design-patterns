package com.designpatterns.example.part031decorator;

/**
 * Created by zn.wang on 17/5/6.
 * 浓缩咖啡
 */
public class EspressoComponentWithSizes extends BeverageComponentAbstractWithSizes {

    public EspressoComponentWithSizes (){
        description = "Espresso";
    }
    @Override
    public double cost ( ) {
        return 1.99;
    }
}
