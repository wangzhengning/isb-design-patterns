package com.designpatterns.example.part03decorator;

/**
 * Created by zn.wang on 17/5/6.
 * 调味品装饰
 *
 * 配料种类:
 牛奶：Milk
 摩卡：Mocha
 豆浆：Soy
 奶泡：Whip
 */
public abstract class CondimentDecoratorAbstract extends BeverageComponentAbstract{
    public abstract String getDescription();
}
