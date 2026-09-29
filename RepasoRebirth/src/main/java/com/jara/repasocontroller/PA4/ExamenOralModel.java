package com.PA1.model;

public class ExamenOralModel extends EvaluacionModel {

    public ExamenOralModel(String codigo, String curso, int cantidadPreguntas,
                           int respuestasValidas, int tiempoRespuesta) {
        super(codigo, curso, cantidadPreguntas, respuestasValidas, tiempoRespuesta);
    }

    @Override
    public String getTipoEvaluacion() {
        return "Examen Oral";
    }

    @Override
    public double getPuntajePorTiempo() {
        if (tiempoRespuesta < 30) {
            return 1.40;
        } else if (tiempoRespuesta <= 45) {
            return 1.50;
        } else {
            return 1.60;
        }
    }

    @Override
    public double getBonificacionPreguntasValidas() {
        if (respuestasValidas >= 30 && respuestasValidas <= 50) {
            return 0.03;
        } else if (respuestasValidas >= 51 && respuestasValidas <= 80) {
            return 0.035;
        } else if (respuestasValidas >= 81 && respuestasValidas <= 100) {
            return 0.04;
        }
        return 0;
    }

    @Override
    public double getBonificacionTipo() {
        return 0.04;
    }
}