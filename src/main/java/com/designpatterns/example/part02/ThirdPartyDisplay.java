package com.designpatterns.example.part02;

/**
 * Created by zn.wang on 17/5/4.
 * "第三方定制"布告
 */
public class ThirdPartyDisplay implements Observer, DisplayElement {

    private float temperature;//温度
    private float humidity;//湿度
    private float pressure;//气压
    private Subject weatherData;

    public ThirdPartyDisplay ( Subject weatherData ) {
        this.weatherData = weatherData;
        weatherData.registerObserver ( this );
    }

    @Override
    public void display ( ) {
        System.out.println ( "ThirdParty display: temperature = " + temperature + " , humidity = " + humidity
                + "  , pressure = " + pressure );
    }


    @Override
    public void update ( float temperature, float humidity, float pressure ) {
        this.temperature = temperature;
        this.humidity = humidity;
        this.pressure = pressure;
        display ();
    }
}
