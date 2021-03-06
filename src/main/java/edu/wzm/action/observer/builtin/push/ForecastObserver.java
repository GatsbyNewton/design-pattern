package edu.wzm.action.observer.builtin.push;

import edu.wzm.action.observer.builtin.pull.DisplayElement;
import edu.wzm.action.observer.builtin.pull.WeatherData;

import java.util.Observable;
import java.util.Observer;

public class ForecastObserver implements Observer, DisplayElement {
	private float currentPressure = 29.92f;  
	private float lastPressure;

	@Override
	public void update(Observable o, Object arg) {
		if (arg instanceof Data) {
			Data data = (Data)arg;
			lastPressure = currentPressure;
			currentPressure = data.getPressure();

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