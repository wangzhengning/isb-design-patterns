package com.designpatterns.example.part021;

import java.util.Map;
import java.util.Observable;

/**
 * Created by zn.wang on 17/5/5.
 */
public class WeatherData extends Observable{

    private float temperature;//温度
    private float humidity;//湿度
    private float pressure;//气压

    public WeatherData(){
    }

    public void measurementsChanged(){
        setChanged ();
        notifyObservers ();
    }

    public void measurementsChanged(Map<String , String> arg){
        setChanged ();
        notifyObservers (arg);
    }

    public void setMeasurements(float temperature , float humidity , float pressure){
        this.temperature = temperature;
        this.humidity = humidity;
        this.pressure = pressure;
        measurementsChanged ();
    }

    public float getTemperature ( ) {
        return temperature;
    }

    public float getPressure ( ) {
        return pressure;
    }

    public float getHumidity ( ) {
        return humidity;
    }
}
