package com.jara.repasoModel;
public abstract class SueldoModel { //clase padre o superclase, necesitan ser protected porque estan protegidos y ser visible para la clase que lo hereda
    //para evitar irrupciones le pongo como solo lectura por eso el abstract, encapsula la clase la protege
    
    // atributos de instancia
    protected String tipoTrabajador, nombres, mes; //para heredar los atrributos deben ser tipo protected
    
    // constructor
    public SueldoModel(String TipoTrabajador, String Nombres, String Mes) {
        this.tipoTrabajador = TipoTrabajador;
        this.nombres = Nombres;
        this.mes = Mes;
    }
    // metodos
    public String mostrarSueldo(){
       return "uwuwn"; //este texto al heredar tambine muestra lo que es su contenido en la subclases
    }
}
