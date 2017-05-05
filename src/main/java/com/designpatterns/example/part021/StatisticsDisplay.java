package com.designpatterns.example.part021;

import java.util.Observable;
import java.util.Observer;

/**
 * Created by zn.wang on 17/5/5.
 */
public class StatisticsDisplay implements Observer, DisplayElement {

    private float maxTemp = 0.0f;
    private float minTemp = 200;
    private float tempSum = 0.0f;
    private int numReadings;
    private Observable observable;


    public StatisticsDisplay ( Observable observable ) {
        this.observable = observable;
        observable.addObserver ( this );
    }

    @Override
    public void display ( ) {
        System.out.println ( "[(气象统计)->布告面板] Avg/Max/Min temperature = " + (tempSum / numReadings) + "/" + maxTemp + "/" + minTemp );
    }

    @Override
    public void update ( Observable o, Object arg ) {
        if (o instanceof WeatherData) {
            float temperature = ((WeatherData) o).getTemperature ( );
            tempSum = tempSum + temperature;
            numReadings++;
            if (temperature > maxTemp) {
                maxTemp = temperature;
            }
            if (temperature < minTemp) {
                minTemp = temperature;
            }
            display ( );
        }
    }
}
