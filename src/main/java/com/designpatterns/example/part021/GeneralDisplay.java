package com.designpatterns.example.part021;

import java.util.Observable;
import java.util.Observer;

/**
 * Created by zn.wang on 17/5/5.
 */
public class GeneralDisplay implements Observer, DisplayElement{

    private float temperature;//温度
    private float humidity;//湿度
    private float pressure;//气压

    private Observable observable;

    public GeneralDisplay (Observable observable){
        this.observable = observable;
        observable.addObserver ( this );
    }

    @Override
    public void display ( ) {
        System.out.println ("[(目前状态)->布告面板] Current conditions , temperature = " + temperature  + " F degrees , " +
                "humidity = " + humidity + "% , pressure = " + pressure +" ↓ ");
    }

    @Override
    public void update ( Observable o, Object arg ) {
        if(o instanceof  Observable){
            WeatherData weatherData = (WeatherData) o;
            this.temperature = weatherData.getTemperature ();
            this.humidity = weatherData.getHumidity ();
            this.pressure = weatherData.getPressure ();
            display ();
        }

    }
}
