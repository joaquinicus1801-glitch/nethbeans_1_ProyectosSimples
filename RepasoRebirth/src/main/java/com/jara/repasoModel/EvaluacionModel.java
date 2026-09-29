
package com.jara.repasoModel;


public abstract class EvaluacionModel {
    protected String curso;
    protected int cantPreguntas, respValidas, tiempoResp;
    
    public EvaluacionModel(String Curso, int CantPreguntas, int respValidas, int tiempoResp){
    this.curso = Curso;
    this.cantPreguntas = CantPreguntas;
    this.cantPreguntas = respValidas;
    this.tiempoResp = tiempoResp;
}
    public String mostrarNota(){
        
        return "";
    }
    
}
