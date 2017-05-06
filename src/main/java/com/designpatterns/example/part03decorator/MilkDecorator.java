package com.designpatterns.example.part03decorator;

/**
 * Created by zn.wang on 17/5/6.
 * 牛奶配料
 */
public class MilkDecorator extends CondimentDecoratorAbstract{

    BeverageComponentAbstract beverageComponentAbstract;

    public MilkDecorator(BeverageComponentAbstract beverageComponentAbstract){
        this.beverageComponentAbstract = beverageComponentAbstract;
    }

    @Override
    public String getDescription ( ) {
        return beverageComponentAbstract.getDescription () + ", Milk";
    }

    @Override
    public double cost ( ) {
        return 0.10 + beverageComponentAbstract.cost ();
    }
}
