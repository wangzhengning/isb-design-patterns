package com.designpatterns.example.part01.quack;

/**
 * Created by zn.wang on 17/5/4.
 */
public class MuteQuack implements QuackBehavior{

    @Override
    public void quack ( ) {
        System.out.println ("什么都不做,不会叫.");
    }
}
