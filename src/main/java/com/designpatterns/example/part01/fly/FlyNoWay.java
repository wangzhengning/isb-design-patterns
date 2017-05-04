package com.designpatterns.example.part01.fly;

/**
 * Created by zn.wang on 17/5/4.
 */
public class FlyNoWay implements FlyBehavior{
    @Override
    public void fly ( ) {
        System.out.println ("什么事都不做,不会飞!");
    }
}
