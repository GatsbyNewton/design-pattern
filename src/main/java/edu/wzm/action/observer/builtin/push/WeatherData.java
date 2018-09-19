package edu.wzm.action.observer.builtin.push;

import java.util.Observable;

public class WeatherData extends Observable {
    private float temperature;
    private float humidity;
    private float pressure;

    private Data data;

    public void notifyALL() {
        setChanged();

        /* 主题向观察者推数据 */
        notifyObservers(data);
    }

    public void setMeasureMents(float temp, float humidity, float pressure) {
        data = new Data();
        data.setTemperature(temp);
        data.setHumidity(humidity);
        data.setPressure(pressure);
    }
}
