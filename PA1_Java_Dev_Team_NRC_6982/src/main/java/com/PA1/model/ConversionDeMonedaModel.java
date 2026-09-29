package com.PA1.model;
public class ConversionDeMonedaModel {

    private String origen;
    private String destino;
    private double monto;

    public ConversionDeMonedaModel(String origen, String destino, double monto) {
        this.origen = origen;
        this.destino = destino;
        this.monto = monto;
    }

    public double mostrarCambio() {
        double resultado = 0;

        if (origen.equals("soles") && destino.equals("dolares")) {
            resultado = monto / 3.5;
        } 
        else if (origen.equals("soles") && destino.equals("euros")) {
            resultado = monto / 4;
        } 
        else if (origen.equals("dolares") && destino.equals("soles")) {
            resultado = monto * 3.5;
        } 
        else if (origen.equals("dolares") && destino.equals("euros")) {
            resultado = (monto * 3.5) / 4;
        } 
        else if (origen.equals("euros") && destino.equals("soles")) {
            resultado = monto * 4;
        } 
        else if (origen.equals("euros") && destino.equals("dolares")) {
            resultado = (monto * 4) / 3.5;
        } 
        else if (origen.equals(destino)) {
            resultado = monto;
        }
        resultado = Math.round(resultado * 100.0) / 100.0;

        return resultado;
    }
}
