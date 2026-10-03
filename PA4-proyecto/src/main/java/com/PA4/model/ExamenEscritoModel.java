package com.PA4.model;

public class ExamenEscritoModel extends EvaluacionModel {
  /*
   s8. FUNCIONAMIENTO: 
    esta es la clase hija el tipo de dato real del objeto
    como vemos a los metodos de isntancia de la clase padre y abstractos se implementa aqui se usa override
    
   */
    
    public ExamenEscritoModel(String codigo, String curso, int cantidadPreguntas,
                              int respuestasValidas, int tiempoRespuesta) {
        super(codigo, curso, cantidadPreguntas, respuestasValidas, tiempoRespuesta);
    }

    @Override
    public String getTipoEvaluacion() {
        return "Examen Escrito";
    }

    @Override
    public double getPuntajePorTiempo() {
        if (tiempoRespuesta < 30) {
            return 1.10;
        } else if (tiempoRespuesta <= 45) {
            return 1.20;
        } else {
            return 1.30;
        }
    }

    @Override
    public double getBonificacionPreguntasValidas() {
        if (respuestasValidas >= 30 && respuestasValidas <= 50) {
            return 0.02;
        } else if (respuestasValidas >= 51 && respuestasValidas <= 80) {
            return 0.025;
        } else if (respuestasValidas >= 81 && respuestasValidas <= 100) {
            return 0.03;
        }
        return 0;
    }

    @Override
    public double getBonificacionTipo() {
        return 0.03;
    }
}