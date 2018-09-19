package edu.wzm.action.observer.builtin.push;

import edu.wzm.action.observer.builtin.pull.DisplayElement;
import edu.wzm.action.observer.builtin.pull.WeatherData;

import java.util.Observable;
import java.util.Observer;

public class CurrentConditionsObserver implements Observer, DisplayElement {
    private float temperature;
    private float humidity;

    @Override
    public void update(Observable o, Object arg) {
        if (arg instanceof Data){
            /* 主题向观察者推数据 */
            Data data = (Data)arg;
            this.temperature = data.getTemperature();
            this.humidity = data.getHumidity();

            display();
        }
    }

    @Override
    public void display() {
        System.out.println("Current conditions: " + temperature +
                "F degrees and " + humidity + "% humidity");
    }
}
