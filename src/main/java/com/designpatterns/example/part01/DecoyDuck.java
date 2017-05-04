package com.designpatterns.example.part01;

import org.springframework.stereotype.Component;

/**
 * Created by zn.wang on 17/5/4.
 */
@Component
public class DecoyDuck extends Duck{

    public DecoyDuck(){

    }

    @Override
    public void display ( ) {
        System.out.println ("看起来像诱饵鸭.");
    }

}
