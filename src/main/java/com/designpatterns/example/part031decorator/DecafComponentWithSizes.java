package com.designpatterns.example.part031decorator;

/**
 * Created by zn.wang on 17/5/6.
 * 低咖啡因咖啡
 */
public class DecafComponentWithSizes extends BeverageComponentAbstractWithSizes {

    public DecafComponentWithSizes (){
        description = "Decaf coffer";
    }

    @Override
    public double cost ( ) {
        return 1.05;
    }

}
