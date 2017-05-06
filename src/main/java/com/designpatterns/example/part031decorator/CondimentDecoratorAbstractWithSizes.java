package com.designpatterns.example.part031decorator;

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
public abstract class CondimentDecoratorAbstractWithSizes extends BeverageComponentAbstractWithSizes {

    public BeverageComponentAbstractWithSizes beverage;

    public abstract String getDescription();

    public Size getSize ( ) {
        return beverage.getSize ();
    }

}
