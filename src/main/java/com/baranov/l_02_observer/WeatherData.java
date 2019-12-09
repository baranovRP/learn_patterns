package com.baranov.l_02_observer;

import java.util.ArrayList;
import java.util.List;

public class WeatherData implements Subject {

    private List observers;
    private float temperature;
    private float humidity;
    private float pressure;

    public WeatherData() {
        this.observers = new ArrayList();
    }

    @Override

    public void registerObserver(final Observer o) {
        observers.add(o);
    }

    @Override
    public void removeObserver(final Observer o) {
        int i = observers.indexOf(o);
        if (i > 0) {
            observers.remove(i);
        }
    }

    @Override
    public void notifyObservers() {
        for (Object o : observers) {
            ((Observer) o).update(temperature, humidity, pressure);
        }
    }

    float getTemperature() {
        return 0.0f;
    }

    float getHumidity() {
        return 0.0f;
    }

    float getPressure() {
        return 0.0f;
    }

    public void measurementsChanged() {
        notifyObservers();
    }

    public void setMeasurements(float temperature, float humidity, float pressure) {
        this.temperature = temperature;
        this.humidity = humidity;
        this.pressure = pressure;
        measurementsChanged();
    }

}
