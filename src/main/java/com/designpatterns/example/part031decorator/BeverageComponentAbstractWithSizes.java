package com.designpatterns.example.part031decorator;

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
public abstract class BeverageComponentAbstractWithSizes {

    public enum Size{
        TALL,//小杯
        GRANDE,//中杯
        VENTI//大杯
    }

    Size size = Size.TALL;

    String description = "Unknown Beverage";

    public String getDescription(){
        return description;
    }

    public Size getSize ( ) {
        return size;
    }

    public void setSize ( Size size ) {
        this.size = size;
    }

    public abstract double cost();



}




















