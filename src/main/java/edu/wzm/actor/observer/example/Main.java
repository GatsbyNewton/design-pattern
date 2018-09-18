package edu.wzm.actor.observer.example;

public class Main {
    public static void main(String[] args){
        WeatherData weatherData = new WeatherData();

        Observer currentConditionsDisplay = new CurrentConditionsDisplay(weatherData);
        Observer statisticsDisplay = new StatisticsDisplay(weatherData);

        weatherData.setMeasureMents(80, 65, 30.4f);
        weatherData.notifyObservers();
        weatherData.setMeasureMents(82, 70, 29.2f);
        weatherData.notifyObservers();
        weatherData.setMeasureMents(78, 90, 29.2f);
        weatherData.notifyObservers();
    }
}
