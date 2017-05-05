package com.designpatterns.example.part01;

import com.designpatterns.example.part01.fly.FlyBehavior;
import com.designpatterns.example.part01.quack.QuackBehavior;

/**
 * Created by zn.wang on 17/5/4.
 * 鸭子模型:特性
 * (1)叫:行为会变化
 * (2)飞:行为会变化
 * (3)游泳:不会变化
 * (4)展示:不会变化
 *
 */
public abstract class Duck {

    private FlyBehavior flyBehavior;
    private QuackBehavior quackBehavior;

    public Duck(){

    }

    public abstract void display ( );

    public void swim(){
        System.out.println ( "All ducks float , even decoys." );
    }

    public void  performFly(){
        flyBehavior.fly ();
    }

    public void performQuack(){
        quackBehavior.quack ();
    }

    public FlyBehavior getFlyBehavior ( ) {
        return flyBehavior;
    }


    /**
     * 称为:动态设定行为.
     * @param flyBehavior
     */
    public void setFlyBehavior ( FlyBehavior flyBehavior ) {
        this.flyBehavior = flyBehavior;
    }

    public QuackBehavior getQuackBehavior ( ) {
        return quackBehavior;
    }

    public void setQuackBehavior ( QuackBehavior quackBehavior ) {
        this.quackBehavior = quackBehavior;
    }
}
