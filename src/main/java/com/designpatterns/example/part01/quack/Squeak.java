package com.designpatterns.example.part01.quack;

/**
 * Created by zn.wang on 17/5/4.
 */
public class Squeak implements QuackBehavior{
    @Override
    public void quack ( ) {
        System.out.println ("橡皮鸭吱吱叫.");
    }
}
