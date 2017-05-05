package com.designpatterns.example.part021;

import java.util.Observable;
import java.util.Observer;

/**
 * Created by zn.wang on 17/5/5.
 */
public class ForcastDisplay implements Observer, DisplayElement {

    private float currentPressure = 29.92f;
    private float lastPressure;
    private Observable observable;

    public ForcastDisplay ( Observable observable ) {
        this.observable = observable;
        observable.addObserver ( this );
    }

    @Override
    public void display ( ) {
        System.out.print ( "[(天气预报)->布告面板] Forecast: " );
        if (currentPressure > lastPressure) {
            System.out.println ( "Improving weather on the way!" );//天气即将得到改善
        }
        else if (currentPressure == lastPressure) {
            System.out.println ( "More of the same!" );
        }
        else if (currentPressure < lastPressure) {
            System.out.println ( "Watch out for cooler , rainy weather!" );//下雨天,当心着凉!
        }
    }

    @Override
    public void update ( Observable o, Object arg ) {
        if (o instanceof WeatherData) {
            WeatherData weatherData = (WeatherData) o;
            lastPressure = currentPressure;
            currentPressure = ((WeatherData) o).getPressure ( );
            display ( );
        }
    }
}
