package edu.wzm.action.observer.builtin.pull;

import java.util.Observer;

public class Main {
    public static void main(String[] args){
        WeatherData weatherData = new WeatherData();

        Observer currentConditionsObserver = new CurrentConditionsObserver(weatherData);
        Observer forecastObserver = new ForecastObserver(weatherData);

        weatherData.setMeasureMents(80, 65, 30.4f);
        weatherData.setMeasureMents(82, 70, 29.2f);
        weatherData.notifyALL();
    }
}
