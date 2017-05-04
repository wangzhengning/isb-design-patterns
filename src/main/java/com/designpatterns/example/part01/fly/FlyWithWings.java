package com.designpatterns.example.part01.fly;

/**
 * Created by zn.wang on 17/5/4.
 */
public class FlyWithWings implements FlyBehavior{
    @Override
    public void fly ( ) {
       System.out.println ("实现鸭子的飞行.");
    }
}
