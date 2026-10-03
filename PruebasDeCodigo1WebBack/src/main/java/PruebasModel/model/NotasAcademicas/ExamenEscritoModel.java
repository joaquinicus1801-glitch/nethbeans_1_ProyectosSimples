
package PruebasModel.model.NotasAcademicas;




public class ExamenEscritoModel extends SistemaDeNotasAcademicasModel{
    public static double bonificacion = 0.03;
    
    public ExamenEscritoModel(String Curso, String tipo, int CantidadPreguntas, int validas, int tiempoRespuesta) {
        super(Curso, tipo, CantidadPreguntas, validas, tiempoRespuesta);
    }
    
    @Override
    public double getPuntajeXtiempo() {
        double puntaje = 0;
        if (tiempoRespuesta < 30) {
            puntaje = validas * 1.25;
        } else {
            if (tiempoRespuesta >= 30 && tiempoRespuesta <= 45) {
                puntaje = validas * 1.25;
            } else {
                if (tiempoRespuesta > 45) {
                    puntaje = validas * 1.2;
                }
            }
        }
        return puntaje;
    }

    @Override
    public double getBonificacionXValidas() {
        double nBonificacion = getPuntajeXtiempo();

        if (validas >= 30 && validas <= 50) {
            nBonificacion = nBonificacion * 0.01;
        } else {
            if (validas >= 51 && validas <= 80) {
                nBonificacion = nBonificacion * 0.015;
            } else {

                if (validas >= 81 && validas <= 100) {
                    nBonificacion = nBonificacion * 0.02;
                }
                else{
                    nBonificacion = 0;
                }
            }
        }
        return nBonificacion;
    }

    @Override
    public double getSumaFinal() {
         System.out.println(bonificacion);
        return (getPuntajeXtiempo() + getBonificacionXValidas()) * (1 + bonificacion)  ;
    }

    public  double getBonificacion() {
      
        return bonificacion * 100;
    }

    public String getCurso() {
        return curso;
    }

    public String getTipo() {
        return tipo;
    }

    public int getCantidadPreguntas() {
        return cantidadPreguntas;
    }

    public int getValidas() {
        return validas;
    }

    public int getTiempoRespuesta() {
        return tiempoRespuesta;
    }
    @Override
    public String toString(){
        return "Tipo: "+getTipo()+
                " Curso: "+ getCurso()+
                " Preguntas: "+getCantidadPreguntas()+
                " Respuestas: "+getTiempoRespuesta()+
                " validas "+getValidas()+
                " puntajeXtiempo: "+getPuntajeXtiempo()+
                " bonificacion*valida: "+getBonificacionXValidas()+
                " bonificacion tipo examen: "+getBonificacion()+
                        " total: "+getSumaFinal();
    }
}
