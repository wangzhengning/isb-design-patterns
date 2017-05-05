package com.designpatterns.example.part02;

/**
 * Created by zn.wang on 17/5/4.
 * "目前状态(温度,湿度,气压)"布告
 */
public class CurrentConditionDisplay implements Observer , DisplayElement{

    private float temperature;//温度
    private float humidity;//湿度
    private float pressure;//气压

    private  Subject weatherData;

    public CurrentConditionDisplay(Subject weatherData){
        this.weatherData = weatherData;
        weatherData.registerObserver ( this );
    }

    @Override
    public void display ( ) {
        System.out.println ("[(目前状态)->布告面板] Current conditions , temperature = " + temperature  + " F degrees , " +
                "humidity = " + humidity + "% , pressure = " + pressure +" ↓ ");
    }


    @Override
    public void update ( float temperature, float humidity, float pressure ) {
        this.temperature = temperature;
        this.humidity = humidity;
        this.pressure = pressure;
        display ();
    }


}
