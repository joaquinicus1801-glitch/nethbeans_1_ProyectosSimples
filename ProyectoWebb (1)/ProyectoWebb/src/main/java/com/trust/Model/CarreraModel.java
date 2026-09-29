package com.trust.Model;

public class CarreraModel {

    
    public int valor1;

    
    public CarreraModel(int Valor1) {

        this.valor1 = Valor1;
    }

    
    public double velocidadA() {

        return 18.0 / 20.0;
    }

    
    public double velocidadB() {

        return 27.0 / 30.0;
    }

    
    public double diferenciaTiempo() {

        double tiempoA = valor1 / velocidadA();

        double tiempoB = valor1 / velocidadB();

        return Math.abs(tiempoA - tiempoB);
    }

    
    public String ganador() {

        double tiempoA = valor1 / velocidadA();

        double tiempoB = valor1 / velocidadB();

        if (tiempoA < tiempoB) {

            return "Auto A";

        } else if (tiempoB < tiempoA) {

            return "Auto B";

        } else {

            return "Empate";
        }
    }
}
