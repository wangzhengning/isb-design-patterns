package com.designpatterns.example.part031decorator;

/**
 * Created by zn.wang on 17/5/6.
 * 奶泡配料
 */
public class WhipDecoratorWithSizes extends CondimentDecoratorAbstractWithSizes {

    public WhipDecoratorWithSizes ( BeverageComponentAbstractWithSizes beverageComponentAbstract){
        this.beverage = beverageComponentAbstract;
    }

    @Override
    public String getDescription ( ) {
        return beverage.getDescription () + " , Whip";
    }

    @Override
    public double cost ( ) {
        return 0.10 + beverage.cost ();
    }
}
