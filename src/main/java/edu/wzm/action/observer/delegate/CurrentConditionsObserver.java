package edu.wzm.action.observer.delegate;

public class CurrentConditionsObserver implements DisplayElement {
    private float temperature;
    private float humidity;

    public void currentCondition(Float temp, Float humidity, Float pressure) {
        this.temperature = temp;
        this.humidity = humidity;
        display();
    }

    @Override
    public void display() {
        System.out.println("Current conditions: " + temperature +
            "F degrees and " + humidity + "% humidity");
    }
}
