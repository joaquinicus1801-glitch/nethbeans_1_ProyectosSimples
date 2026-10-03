package com.PA4.model;

public abstract class EvaluacionModel { // clase abstracta se hereda

 /*
 s5. FUNCIONIENTO   
  Creamos una clase padre con el que nuestros hijos heredaran sus atributos y metodos  
    
   cada atributo de la clase padre es protected, necesario para poder heredar
    
    El constructor donde los parametros enviados desde el controler en el objeto clase hija crean el objeto con dichos
    argumentos
 */   
    
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
    
    /*
    s6. FUNCIONAMIENTO
      luego se crea los metodos de la clase, vemos que en el padre ya se crean los metodos getter
      para la obtencion de datos de propiedades, no olvidemos que el EL  usa estos metodos cuando quieres mostrar
    un propieada de un objeto y metodos, 
    siempre usara el metodo get, aunque puede variar por versiones de java pero dejemoslo asi por ahor
    
    */

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
    
    
    /*
     s7 FUNCIONAMIENTO:
     Vemos ahora estos metodos, no tiene una estructura tipica de funcion y es porque son metodos abstractos
    ABSTRACTOS, significa que el metodo se declara pero no se implementa en esa clase
     ...
    */

    public abstract String getTipoEvaluacion();
    /*
      s7.1 FUNCIONAMIENTO
    por ejemplo el metodo abstracto de abajo
    Esto establece que debe existir un método llamado getPuntajePorTiempo(), 
    que no recibe parámetros y devuelve un double, pero no indica como calcular ese resultado.  
    las clases hijas como veremos implementan estos metodos, hacer override para calcular , cada uno 
    dependiendo los calculos que hagan dan su propia implementacion, todas las hijas estan obligadas
    a implementar TODOS LOS METODOS ABSTRACTOS QUE HEREDA (hacer Override?) si implementar es lo mismo que SOBRESCRIBIR
    
    no es lo mismo que una interfaz son metodos abstratos dela clase abstract se heredan con esxtends tienen
    metodos abstractos e implementados, atributos de instancia, una clase solo extiende una clase
    
    
    */
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