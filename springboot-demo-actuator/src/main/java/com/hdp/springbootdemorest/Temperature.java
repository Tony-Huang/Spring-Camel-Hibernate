package com.hdp.springbootdemorest;

public class Temperature {
    String id;
    float temperature;
    char unit='C';


    public Temperature(String id, float temperature) {
        this.id = id;
        this.temperature = temperature;
    }

    public Temperature(String id, float temperature, char unit) {
        this.id = id;
        this.temperature = temperature;
        this.unit = unit;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public float getTemperature() {
        return temperature;
    }

    public void setTemperature(float temperature) {
        this.temperature = temperature;
    }

    public char getUnit() {
        return unit;
    }

    public void setUnit(char unit) {
        this.unit = unit;
    }
}
