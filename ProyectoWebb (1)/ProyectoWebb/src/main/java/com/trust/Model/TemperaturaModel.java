package com.trust.Model;

public class TemperaturaModel {

    private double celsius;

    public TemperaturaModel(double celsius) {

        this.celsius = celsius;
    }

    public double getFahrenheit() {

        return (celsius * 9 / 5) + 32;
    }

    public double getKelvin() {

        return celsius + 273.15;
    }

    public double getRankine() {

        return (celsius + 273.15) * 9 / 5;
    }

    public double getReaumur() {

        return celsius * 4 / 5;
    }

    public double getNewton() {

        return celsius * 33 / 100;
    }
}
