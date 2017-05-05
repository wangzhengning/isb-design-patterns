package com.designpatterns.example.part02;

import com.google.common.collect.Lists;

import java.util.List;

/**
 * Created by zn.wang on 17/5/4.
 */
public class WeatherData implements Subject{

    private float temperature;//温度
    private float humidity;//湿度
    private float pressure;//气压

    private List<Observer> observers;

    public WeatherData(){
        observers = Lists.newArrayList ( );
    }

    @Override
    public void registerObserver ( Observer registerObserver ) {
        observers.add ( registerObserver );
    }

    @Override
    public void removeObserver ( Observer removeObserver ) {
        int i = observers.indexOf ( removeObserver );
        if(i >0 )
            observers.remove ( i );
    }

    @Override
    public void notifyObserver ( ) {
        for(Observer observer : observers){
            observer.update ( temperature , humidity , pressure );
        }
    }

    public void measurementsChanged(){
        notifyObserver ();
    }

    public void setMeasurements(float temperature , float humidity , float pressure){
        this.temperature = temperature;
        this.humidity = humidity;
        this.pressure = pressure;
        measurementsChanged ();
    }

}
