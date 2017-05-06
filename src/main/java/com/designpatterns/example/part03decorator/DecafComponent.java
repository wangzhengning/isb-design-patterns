package com.designpatterns.example.part03decorator;

/**
 * Created by zn.wang on 17/5/6.
 * 低咖啡因咖啡
 */
public class DecafComponent extends BeverageComponentAbstract{

    public DecafComponent(){
        description = "Decaf coffer";
    }

    @Override
    public double cost ( ) {
        return 1.05;
    }

}
