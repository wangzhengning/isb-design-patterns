package com.designpatterns.example.part031decorator;

/**
 * Created by zn.wang on 17/5/6.
 * 奶泡配料
 */
public class WhipDecoratorWithSizes extends CondimentDecoratorAbstractWithSizes {

    BeverageComponentAbstractWithSizes beverageComponentAbstract;

    public WhipDecoratorWithSizes ( BeverageComponentAbstractWithSizes beverageComponentAbstract){
        this.beverageComponentAbstract = beverageComponentAbstract;
    }

    @Override
    public String getDescription ( ) {
        return beverageComponentAbstract.getDescription () + " , Whip";
    }

    @Override
    public double cost ( ) {
        return 0.10 + beverageComponentAbstract.cost ();
    }
}
