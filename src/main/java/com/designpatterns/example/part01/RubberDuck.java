package com.designpatterns.example.part01;

import org.springframework.stereotype.Component;

/**
 * Created by zn.wang on 17/5/4.
 */
@Component
public class RubberDuck extends Duck{

    public RubberDuck(){

    }

    @Override
    public void display ( ) {
        System.out.println ("看起来像橡皮鸭.");
    }
}
