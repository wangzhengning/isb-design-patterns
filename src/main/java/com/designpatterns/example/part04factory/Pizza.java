package com.designpatterns.example.part04factory;

import com.google.common.collect.Lists;

import java.util.List;

/**
 * Created by zn.wang on 17/5/7.
 * 使用简单工厂,描述披萨店
 * 注意:披萨的制作流程哈
 * (1)从工厂得到一个原始披萨对象,不能吃.
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
    }

    public void bake(){
        System.out.println ("Baking "+ name);
    }

    public void cut(){
        System.out.println ("Cutting " + name);
    }

    public void box(){
        System.out.println ("Boxing " + name);
    }

    /**
     * code to display pizza name and ingredients
     * @return
     */
    public String toString(){
        StringBuffer dispaly = new StringBuffer (  );
        dispaly.append ( "---- " + name + "-----\n" );
        dispaly.append ( dough + "\n" );
        dispaly.append ( sauce + "\n" );
        for (String topping : toppings  ){
            dispaly.append ( topping + "\n" );
        }
        return dispaly.toString ();
    }



}



















