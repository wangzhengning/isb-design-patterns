package com.designpatterns.example.part03decorator;

/**
 * Created by zn.wang on 17/5/6.
 * 摩卡配料
 */
public class MochaDecorator extends CondimentDecoratorAbstract{

    BeverageComponentAbstract beverageComponentAbstract;

    public MochaDecorator(BeverageComponentAbstract beverageComponentAbstract){
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
