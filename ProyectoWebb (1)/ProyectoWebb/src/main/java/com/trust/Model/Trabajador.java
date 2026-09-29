package com.trust.Model;

public class Trabajador {

    private int horasTrabajadas;
    private double salarioPorHora;

    public Trabajador(int horasTrabajadas,
            double salarioPorHora)
            throws IllegalArgumentException {

        if (horasTrabajadas < 40
                || horasTrabajadas > 60) {

            throw new IllegalArgumentException(
                    "Las horas deben estar entre 40 y 60.");
        }

        if (salarioPorHora < 80
                || salarioPorHora > 100) {

            throw new IllegalArgumentException(
                    "El salario debe estar entre 80 y 100.");
        }

        this.horasTrabajadas = horasTrabajadas;
        this.salarioPorHora = salarioPorHora;
    }

    public int getHorasTrabajadas() {
        return horasTrabajadas;
    }

    public double getSalarioPorHora() {
        return salarioPorHora;
    }

    public double calcularPorcentajeBono() {

        if (horasTrabajadas >= 40
                && horasTrabajadas <= 50) {

            return 0.25;

        } else if (horasTrabajadas <= 55) {

            return 0.30;

        } else {

            return 0.35;
        }
    }

    public double calcularSueldoTotal() {

        double sueldoBase =
                horasTrabajadas * salarioPorHora;

        double bono =
                sueldoBase * calcularPorcentajeBono();

        return sueldoBase + bono;
    }
}
