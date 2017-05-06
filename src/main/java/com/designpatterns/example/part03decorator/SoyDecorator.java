package com.designpatterns.example.part03decorator;

/**
 * Created by zn.wang on 17/5/6.
 * 豆浆配料
 */
public class SoyDecorator extends CondimentDecoratorAbstract{

    BeverageComponentAbstract beverageComponentAbstract;

    public SoyDecorator(BeverageComponentAbstract beverageComponentAbstract){
        this.beverageComponentAbstract = beverageComponentAbstract;
    }

    @Override
    public String getDescription ( ) {
        return beverageComponentAbstract.getDescription () + " , Soy";
    }

    @Override
    public double cost ( ) {
        return 0.15 + beverageComponentAbstract.cost ();
    }
}
