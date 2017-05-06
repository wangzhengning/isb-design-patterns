package com.designpatterns.example.part031decorator;

/**
 * Created by zn.wang on 17/5/6.
 * 牛奶配料
 */
public class MilkDecoratorWithSizes extends CondimentDecoratorAbstractWithSizes {

    public MilkDecoratorWithSizes ( BeverageComponentAbstractWithSizes beverageComponentAbstract){
        this.beverage = beverageComponentAbstract;
    }

    @Override
    public String getDescription ( ) {
        return beverage.getDescription () + ", Milk";
    }

    @Override
    public double cost ( ) {
        return 0.10 + beverage.cost ();
    }
}
