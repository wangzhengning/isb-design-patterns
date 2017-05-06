package com.designpatterns.example.part031decorator;

import org.apache.commons.lang3.StringUtils;

/**
 * Created by zn.wang on 17/5/6.
 */
public class StarBuzzCoffeeWithSizesApplication {

    public static void main ( String[] args ) {

        BeverageComponentAbstractWithSizes beverage = buildBeverage ( EspressoComponentWithSizes.class.getSimpleName ( ) );
        System.out.println ( beverage.getDescription ( ) + " , $" + String.format ( "%.2f", beverage.cost ( ) ) );

        System.out.println ( "====================" );
        BeverageComponentAbstractWithSizes beverage2 = new DarkRoastComponentWithSizes ( );
        beverage2 = new MochaDecoratorWithSizes ( beverage2 );
        beverage2 = new MochaDecoratorWithSizes ( beverage2 );
        beverage2 = new WhipDecoratorWithSizes ( beverage2 );
        System.out.println ( beverage2.getDescription ( ) + " , $" + String.format ( "%.2f", beverage2.cost ( ) ) );

        System.out.println ( "====================" );
        BeverageComponentAbstractWithSizes beverage3 = new HouseBlendComponentWithSizes ( );
        beverage3 = new SoyDecoratorWithSizes ( beverage3 );
        beverage3 = new MochaDecoratorWithSizes ( beverage3 );
        beverage3 = new WhipDecoratorWithSizes ( beverage3 );
        System.out.println ( beverage3.getDescription ( ) + " , $" + String.format ( "%.2f", beverage3.cost ( ) ) );
    }

    /**
     * 构建: 饮料组件
     *
     * @param beverageName
     * @return
     */
    private static BeverageComponentAbstractWithSizes buildBeverage ( String beverageName ) {

        if (StringUtils.isBlank ( beverageName )) return null;

        if (beverageName.equals ( DarkRoastComponentWithSizes.class.getSimpleName ( ) )) {
            //深焙咖啡组件
            return new DarkRoastComponentWithSizes ( );
        } else if (beverageName.equals ( DecafComponentWithSizes.class.getSimpleName ( ) )) {
            //低咖啡因咖啡组件
            return new DecafComponentWithSizes ( );
        } else if (beverageName.equals ( EspressoComponentWithSizes.class.getSimpleName ( ) )) {
            //浓缩咖啡组件
            return new EspressoComponentWithSizes ( );
        } else if (beverageName.equals ( HouseBlendComponentWithSizes.class.getSimpleName ( ) )) {
            //综合咖啡组件
            return new HouseBlendComponentWithSizes ( );
        }

        return null;
    }


    /**
     * 构建:调料装饰器
     *
     * @param condimentName
     * @return
     */
    private static CondimentDecoratorAbstractWithSizes buildCondimentDecorator ( String condimentName, BeverageComponentAbstractWithSizes beverageComponent ) {

        if (StringUtils.isBlank ( condimentName )) return null;

        if (condimentName.equals ( MilkDecoratorWithSizes.class.getSimpleName ( ) )) {
            //牛奶配料
            return new MilkDecoratorWithSizes ( beverageComponent );
        } else if (condimentName.equals ( MochaDecoratorWithSizes.class.getSimpleName ( ) )) {
            //摩卡配料
            return new MochaDecoratorWithSizes ( beverageComponent );
        } else if (condimentName.equals ( SoyDecoratorWithSizes.class.getSimpleName ( ) )) {
            //豆浆配料
            return new SoyDecoratorWithSizes ( beverageComponent );
        } else if (condimentName.equals ( WhipDecoratorWithSizes.class.getSimpleName ( ) )) {
            //奶泡配料
            return new WhipDecoratorWithSizes ( beverageComponent );
        }

        return null;
    }

}



