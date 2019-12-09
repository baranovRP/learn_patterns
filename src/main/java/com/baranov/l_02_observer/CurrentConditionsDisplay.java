package com.baranov.l_02_observer;

public class CurrentConditionsDisplay implements Observer, DisplayElement {

    private float temperature;
    private float humidity;
    private Subject weatherData;

    public CurrentConditionsDisplay(final Subject weatherData) {
        this.weatherData = weatherData;
        weatherData.registerObserver(this);
    }

    @Override
    public void display() {
        System.out.printf("Current conditions: %sF degrees and %s%% humidity%n", temperature, humidity);
    }

    @Override
    public void update(final float temp, final float humidity, final float pressure) {
        this.temperature = temp;
        this.humidity = humidity;
        display();
    }
}
