package com.designpatterns.example.part03decorator;

/**
 * Created by zn.wang on 17/5/6.
 * 综合咖啡
 */
public class HouseBlendComponent extends BeverageComponentAbstract{

    public HouseBlendComponent(){
        description = "House Blend Coffee";
    }

    @Override
    public double cost ( ) {
        return 0.89;
    }
}
