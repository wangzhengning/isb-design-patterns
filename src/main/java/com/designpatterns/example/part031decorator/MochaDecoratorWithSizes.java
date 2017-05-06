package com.designpatterns.example.part031decorator;

/**
 * Created by zn.wang on 17/5/6.
 * 摩卡配料
 */
public class MochaDecoratorWithSizes extends CondimentDecoratorAbstractWithSizes {

    public MochaDecoratorWithSizes ( BeverageComponentAbstractWithSizes beverageComponentAbstract){
        this.beverage = beverageComponentAbstract;
    }

    @Override
    public String getDescription ( ) {
        return beverage.getDescription () + " , Mocha";
    }

    @Override
    public double cost ( ) {
        return 0.20 + beverage.cost ();
    }
}
