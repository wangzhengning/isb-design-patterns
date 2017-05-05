package com.designpatterns.example.part02;

/**
 * Created by zn.wang on 17/5/4.
 * "气象统计(平均温度,最低温度,最高温度)"布告
 */
public class StatisticsDisplay implements Observer , DisplayElement{

    private float maxTemp = 0.0f;
    private float minTemp = 200;
    private float tempSum = 0.0f;
    private int numReadings;
    private Subject weatherData;

    public StatisticsDisplay(Subject weatherData){
        this.weatherData = weatherData;
        weatherData.registerObserver ( this );
    }

    @Override
    public void display ( ) {
        System.out.println ("Avg/Max/Min temperature = " + (tempSum/numReadings ) + "/" + maxTemp + "/" + minTemp);
    }


    @Override
    public void update ( float temperature, float humidity, float pressure ) {
        tempSum = tempSum + temperature;
        numReadings ++;
        if(temperature > maxTemp){
            maxTemp = temperature;
        }
        if(temperature < minTemp){
            minTemp = temperature;
        }
        display ();
    }
}
