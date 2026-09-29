package com.PA1.model;

public abstract class EvaluacionModel {

    protected String codigo;
    protected String curso;
    protected int cantidadPreguntas;
    protected int respuestasValidas;
    protected int tiempoRespuesta;

    public EvaluacionModel(String codigo, String curso, int cantidadPreguntas,
                           int respuestasValidas, int tiempoRespuesta) {
        this.codigo = codigo;
        this.curso = curso;
        this.cantidadPreguntas = cantidadPreguntas;
        this.respuestasValidas = respuestasValidas;
        this.tiempoRespuesta = tiempoRespuesta;
    }

    public String getCodigo() {
        return codigo;
    }

    public String getCurso() {
        return curso;
    }

    public int getCantidadPreguntas() {
        return cantidadPreguntas;
    }

    public int getRespuestasValidas() {
        return respuestasValidas;
    }

    public int getTiempoRespuesta() {
        return tiempoRespuesta;
    }

    public abstract String getTipoEvaluacion();

    public abstract double getPuntajePorTiempo();

    public abstract double getBonificacionPreguntasValidas();

    public abstract double getBonificacionTipo();

    public double getNotaFinal() {
        double nota = respuestasValidas * getPuntajePorTiempo();

        nota += nota * getBonificacionPreguntasValidas();
        nota += nota * getBonificacionTipo();

        return Math.min(nota, 20);
    }
}