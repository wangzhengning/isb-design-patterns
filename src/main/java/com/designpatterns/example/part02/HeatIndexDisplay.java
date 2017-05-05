package com.designpatterns.example.part02;

/**
 * Created by zn.wang on 17/5/5.
 * "酷热指数"布告板
 */
public class HeatIndexDisplay implements Observer , DisplayElement{
    private float heatIndex;
    private Subject weatherData;

    public HeatIndexDisplay(Subject weatherData){
        this.weatherData = weatherData;
        weatherData.registerObserver ( this );
    }

    @Override
    public void display ( ) {
        System.out.println ("[(酷热指数)->布告面板] Heat index is : " + heatIndex);
    }

    @Override
    public void update ( float t, float rh, float pressure ) {
        heatIndex = computerHeatIndex ( t , rh );
        display ();
    }

    /**
     * 计算酷热指数
     * 何为酷热指数:它是一个集合温度和相对湿度的指数,用来显示人的温度感受.
     * @param t 温度
     * @param rh 相对湿度
     * @return
     */
    public float computerHeatIndex(float t , float rh){
        float index = (float)((16.923 + (0.185212 * t) + (5.37941 * rh) - (0.100254 * t * rh)
                + (0.00941695 * (t * t)) + (0.00728898 * (rh * rh))
                + (0.000345372 * (t * t * rh)) - (0.000814971 * (t * rh * rh)) +
                (0.0000102102 * (t * t * rh * rh)) - (0.000038646 * (t * t * t)) + (0.0000291583 *
                (rh * rh * rh)) + (0.00000142721 * (t * t * t * rh)) +
                (0.000000197483 * (t * rh * rh * rh)) - (0.0000000218429 * (t * t * t * rh * rh)) +
                0.000000000843296 * (t * t * rh * rh * rh)) -
                (0.0000000000481975 * (t * t * t * rh * rh * rh)));
        return index;
    }


}
