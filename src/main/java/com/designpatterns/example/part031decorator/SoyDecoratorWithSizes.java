package com.designpatterns.example.part031decorator;

/**
 * Created by zn.wang on 17/5/6.
 * 豆浆配料
 */
public class SoyDecoratorWithSizes extends CondimentDecoratorAbstractWithSizes {


    public SoyDecoratorWithSizes ( BeverageComponentAbstractWithSizes beverageComponentAbstract){
        this.beverage = beverageComponentAbstract;
    }

    @Override
    public String getDescription ( ) {
        return beverage.getDescription () + " , Soy";
    }

    @Override
    public double cost ( ) {
        double cost = beverage.cost ();
        if(beverage.getSize () == Size.TALL){
           cost += 0.10;
        }
        else if(beverage.getSize () == Size.GRANDE){
           cost += 0.15;
        }
        else if(beverage.getSize () == Size.VENTI){
           cost += 0.20;
        }
        return cost;
    }
}
