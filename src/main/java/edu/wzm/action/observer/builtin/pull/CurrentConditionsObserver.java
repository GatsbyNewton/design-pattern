package edu.wzm.action.observer.builtin.pull;

import java.util.Observable;
import java.util.Observer;

public class CurrentConditionsObserver implements Observer, DisplayElement {
    private float temperature;
    private float humidity;

    private Observable observable;

    public CurrentConditionsObserver(Observable observable) {
        this.observable = observable;
        observable.addObserver(this);
    }

    @Override
    public void update(Observable o, Object arg) {
        if (o instanceof WeatherData){
            /* 观察者从主题拉数据 */
            WeatherData weatherData = (WeatherData)o;
            this.temperature = weatherData.getTemperature();
            this.humidity = weatherData.getHumidity();

            display();
        }
    }

    @Override
    public void display() {
        System.out.println("Current conditions: " + temperature +
                "F degrees and " + humidity + "% humidity");
    }
}
