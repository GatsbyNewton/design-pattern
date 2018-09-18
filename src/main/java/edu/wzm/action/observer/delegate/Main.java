package edu.wzm.action.observer.delegate;

public class Main {
    public static void main(String[] args){
        WeatherData weatherData = new WeatherData();
        CurrentConditionsObserver currentConditionsObserver = new CurrentConditionsObserver();
        ForecastObserver forecastObserver = new ForecastObserver();

        weatherData.addObserver(currentConditionsObserver, "currentCondition", 80f, 65f, 30.4f);
        weatherData.addObserver(forecastObserver, "forecast", 82f, 70f, 29.2f);
        weatherData.notifyObservers();
    }
}
