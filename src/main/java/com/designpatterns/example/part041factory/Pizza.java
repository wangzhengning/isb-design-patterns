package com.designpatterns.example.part041factory;

import com.google.common.collect.Lists;

import java.util.List;

/**
 * Created by zn.wang on 17/5/7.
 * 使用工厂方法,描述披萨店
 * 注意:披萨的制作流程哈
 * (2)prepare:准备
 * (3)bake:烘烤
 * (4)cut:切片
 * (5)box:装盒
 *
 * 其他:还会遇到的单词
 * ingredients:佐料,材料
 * dough:生面团
 * sauce:酱油
 *
 */
public abstract class Pizza {

    String name;//披萨名字
    String dough;//生面团
    String sauce;//酱油

    List<String> toppings = Lists.newArrayList ( );//糕点上的装饰配料

    public String getName(){
        return name;
    }

    public void prepare(){
        System.out.println ("Preparing " + name);
        System.out.println("Tossing dough...");
        System.out.println("Adding sauce...");
        System.out.println("Adding toppings: ");
        for (String topping : toppings) {
            System.out.println("   " + topping);
        }
    }

    public void bake(){
        System.out.println("Bake for 25 minutes at 350");
    }

    public void cut(){
        System.out.println("Cut the pizza into diagonal slices");
    }

    public void box(){
        System.out.println("Place pizza in official PizzaStore box");
    }

    /**
     * code to display pizza name and ingredients
     * @return
     */
    public String toString(){
        StringBuffer display = new StringBuffer();
        display.append("---- " + name + " ----\n");
        display.append(dough + "\n");
        display.append(sauce + "\n");
        for (String topping : toppings) {
            display.append(topping + "\n");
        }
        return display.toString();
    }



}



















