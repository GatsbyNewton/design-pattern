package edu.wzm.action.observer.builtin.pull;

import java.util.Observable;
import java.util.Observer;

public class ForecastObserver implements Observer, DisplayElement {
	private float currentPressure = 29.92f;  
	private float lastPressure;

	private Observable observable;

	public ForecastObserver(Observable observable) {
		this.observable = observable;
		observable.addObserver(this);
	}

	@Override
	public void update(Observable o, Object arg) {
		if (o instanceof Observable) {
			WeatherData weatherData = (WeatherData)o;
			lastPressure = currentPressure;
			currentPressure = weatherData.getPressure();

			display();
		}
	}

	public void display() {
		System.out.print("Forecast: ");
		if (currentPressure > lastPressure) {
			System.out.println("Improving weather on the way!");
		} else if (currentPressure == lastPressure) {
			System.out.println("More of the same");
		} else if (currentPressure < lastPressure) {
			System.out.println("Watch out for cooler, rainy weather");
		}
	}
}