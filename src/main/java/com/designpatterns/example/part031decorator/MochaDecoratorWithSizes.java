package com.designpatterns.example.part031decorator;

/**
 * Created by zn.wang on 17/5/6.
 * 摩卡配料
 */
public class MochaDecoratorWithSizes extends CondimentDecoratorAbstractWithSizes {

    BeverageComponentAbstractWithSizes beverageComponentAbstract;

    public MochaDecoratorWithSizes ( BeverageComponentAbstractWithSizes beverageComponentAbstract){
        this.beverageComponentAbstract = beverageComponentAbstract;
    }

    @Override
    public String getDescription ( ) {
        return beverageComponentAbstract.getDescription () + " , Mocha";
    }

    @Override
    public double cost ( ) {
        return 0.20 + beverageComponentAbstract.cost ();
    }
}
