package com.designpatterns.example.part031decorator;

/**
 * Created by zn.wang on 17/5/6.
 * 深焙咖啡
 */
public class DarkRoastComponentWithSizes extends BeverageComponentAbstractWithSizes {

    public DarkRoastComponentWithSizes (){
        description = "Dark Roast Coffee";
    }

    @Override
    public double cost ( ) {
        return 0.99;
    }
}
