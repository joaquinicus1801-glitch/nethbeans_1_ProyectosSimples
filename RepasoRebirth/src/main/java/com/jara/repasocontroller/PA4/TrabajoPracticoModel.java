package com.PA1.model;

public class TrabajoPracticoModel extends EvaluacionModel {

    public TrabajoPracticoModel(String codigo, String curso, int cantidadPreguntas,
                                int respuestasValidas, int tiempoRespuesta) {
        super(codigo, curso, cantidadPreguntas, respuestasValidas, tiempoRespuesta);
    }

    @Override
    public String getTipoEvaluacion() {
        return "Trabajo Práctico";
    }

    @Override
    public double getPuntajePorTiempo() {
        if (tiempoRespuesta < 30) {
            return 1.20;
        } else if (tiempoRespuesta <= 45) {
            return 1.25;
        } else {
            return 1.25;
        }
    }

    @Override
    public double getBonificacionPreguntasValidas() {
        if (respuestasValidas >= 30 && respuestasValidas <= 50) {
            return 0.01;
        } else if (respuestasValidas >= 51 && respuestasValidas <= 80) {
            return 0.015;
        } else if (respuestasValidas >= 81 && respuestasValidas <= 100) {
            return 0.02;
        }
        return 0;
    }

    @Override
    public double getBonificacionTipo() {
        return 0.02;
    }
}