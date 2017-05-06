package com.designpatterns.example.part021;


/**
 * Created by zn.wang on 17/5/5.
 */
public class WeatherStationApplication {

    public static void main ( String[] args ) {
        buildWeatherData ();
    }

    private static void buildWeatherData(){
        WeatherData weatherData = new WeatherData ();

        GeneralDisplay generalDisplay= new GeneralDisplay ( weatherData );
        StatisticsDisplay statisticsDisplay = new StatisticsDisplay ( weatherData );
        ForcastDisplay forcastDisplay = new ForcastDisplay (weatherData);

        weatherData.setMeasurements ( 80 , 65 , 30.4f );
        System.out.println ("========================");
        weatherData.setMeasurements ( 80 , 70 , 29.2f );
        System.out.println ("========================");
        weatherData.setMeasurements ( 78 , 90 , 29.2f );
    }
}
