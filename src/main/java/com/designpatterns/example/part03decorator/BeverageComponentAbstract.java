package com.designpatterns.example.part03decorator;

/**
 * Created by zn.wang on 17/5/6.
 * 饮料(咖啡)
 * 咖啡种类:
 综合：HouseBlend
 深焙：DarkRoast
 低咖啡因：Decaf
 浓缩：Espresso
 *
 */
public abstract class BeverageComponentAbstract {
    String description = "Unknown Beverage";

    public String getDescription(){
        return description;
    }

    public abstract double cost();

}
