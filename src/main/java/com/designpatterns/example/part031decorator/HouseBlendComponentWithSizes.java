package com.designpatterns.example.part031decorator;

/**
 * Created by zn.wang on 17/5/6.
 * 综合咖啡
 */
public class HouseBlendComponentWithSizes extends BeverageComponentAbstractWithSizes {

    public HouseBlendComponentWithSizes (){
        description = "House Blend Coffee";
    }

    @Override
    public double cost ( ) {
        return 0.89;
    }
}
