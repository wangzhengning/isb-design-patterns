package com.designpatterns.example.part02;

/**
 * Created by zn.wang on 17/5/4.
 * "天气预报"布告
 */
public class ForcastDisplay implements Observer , DisplayElement{

    private float currentPressure = 29.92f;
    private float lastPressure;
    private Subject weatherData;

    public ForcastDisplay (Subject weatherData){
        this.weatherData = weatherData;
        weatherData.registerObserver ( this );
    }

    @Override
    public void display ( ) {
        System.out.print ("[(天气预报)->布告面板] Forecast: ");
        if(currentPressure > lastPressure){
            System.out.println ("Improving weather on the way!");//天气即将得到改善
        }
        else if(currentPressure == lastPressure){
            System.out.println ("More of the same!");
        }
        else if(currentPressure < lastPressure){
            System.out.println ("Watch out for cooler , rainy weather!");//下雨天,当心着凉!
        }
    }

    @Override
    public void update ( float temperature, float humidity, float pressure ) {
        lastPressure = currentPressure;
        currentPressure = pressure;
        display ();
    }



}
