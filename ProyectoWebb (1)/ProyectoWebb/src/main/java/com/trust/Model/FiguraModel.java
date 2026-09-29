package com.trust.Model;

public class FiguraModel {

    private double catetoAdyacente;
    private double catetoOpuesto;

    public FiguraModel(double catetoAdyacente,
                       double catetoOpuesto) {

        this.catetoAdyacente = catetoAdyacente;
        this.catetoOpuesto = catetoOpuesto;
    }

    public double getHipotenusa() {

        return Math.sqrt(
                Math.pow(catetoAdyacente, 2)
                +
                Math.pow(catetoOpuesto, 2));
    }

    public double getArea() {

        return (catetoAdyacente
                *
                catetoOpuesto) / 2;
    }

    public double getAnguloA() {

        double angulo;

        angulo =
                Math.toDegrees(
                        Math.atan(
                                catetoOpuesto
                                /
                                catetoAdyacente));

        return Math.round(angulo * 100) / 100.0;
    }

    public double getAnguloB() {

        double angulo;

        angulo = 90 - getAnguloA();

        return Math.round(angulo * 100) / 100.0;
    }
}