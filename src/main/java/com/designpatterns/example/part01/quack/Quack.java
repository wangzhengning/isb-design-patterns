package com.designpatterns.example.part01.quack;

/**
 * Created by zn.wang on 17/5/4.
 */
public class Quack implements QuackBehavior{
    @Override
    public void quack ( ) {
        System.out.println ("实现鸭子呱呱叫");
    }
}
