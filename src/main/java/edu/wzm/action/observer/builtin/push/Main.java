package edu.wzm.action.observer.builtin.push;

import java.util.Observer;

public class Main {
    public static void main(String[] args){
        WeatherData weatherData = new WeatherData();
        Observer currentConditionsObserver = new CurrentConditionsObserver();
        Observer forecastObserver = new ForecastObserver();
        weatherData.addObserver(currentConditionsObserver);
        weatherData.addObserver(forecastObserver);
        weatherData.setMeasureMents(80, 65, 30.4f);
        weatherData.notifyALL();

        System.out.println("------------------------");
        weatherData.deleteObserver(forecastObserver);
        weatherData.notifyALL();
    }
}
