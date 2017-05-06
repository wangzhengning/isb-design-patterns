package com.designpatterns.example.part03decorator;

import org.apache.commons.lang3.StringUtils;

/**
 * Created by zn.wang on 17/5/6.
 */
public class StarBuzzCoffeeApplication {

    public static void main ( String[] args ) {
        //浓缩咖啡组件
        BeverageComponentAbstract beverage = buildBeverage ( EspressoComponent.class.getSimpleName () );
        System.out.println (beverage.getDescription () + " $" + beverage.cost ());

    }

    /**
     * 构建: 饮料组件
     * @param beverageName
     * @return
     */
    private static BeverageComponentAbstract buildBeverage(String beverageName){

        if(StringUtils.isBlank ( beverageName )) return null;

        if(beverageName.equals ( DarkRoastComponent.class.getSimpleName () )){
            //深焙咖啡组件
            return new DarkRoastComponent ();
        }
        else if(beverageName.equals ( DecafComponent.class.getSimpleName () )){
            //低咖啡因咖啡组件
            return new DecafComponent();
        }
        else if(beverageName.equals ( EspressoComponent.class.getSimpleName () )){
            //浓缩咖啡组件
            return new EspressoComponent();
        }
        else if(beverageName.equals ( HouseBlendComponent.class.getSimpleName () )){
            //综合咖啡组件
            return new HouseBlendComponent();
        }

        return null;
    }


    /**
     * 构建:调料装饰器
     * @param condimentName
     * @return
     */
    private static CondimentDecoratorAbstract buildCondimentDecorator(String condimentName , BeverageComponentAbstract beverageComponent){

        if(StringUtils.isBlank ( condimentName )) return null;

        if(condimentName.equals ( MilkDecorator.class.getSimpleName () )){
            //牛奶配料
            return new MilkDecorator (beverageComponent);
        }
        else if(condimentName.equals ( MochaDecorator.class.getSimpleName () )){
            //摩卡配料
            return new MochaDecorator(beverageComponent);
        }
        else if(condimentName.equals ( SoyDecorator.class.getSimpleName () )){
            //豆浆配料
            return new SoyDecorator(beverageComponent);
        }
        else if(condimentName.equals ( WhipDecorator.class.getSimpleName () )){
            //奶泡配料
            return new WhipDecorator(beverageComponent);
        }

        return null;
    }






}



