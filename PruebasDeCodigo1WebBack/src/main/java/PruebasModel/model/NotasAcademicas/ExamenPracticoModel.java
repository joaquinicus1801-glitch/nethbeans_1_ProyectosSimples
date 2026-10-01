
package PruebasModel.model.NotasAcademicas;

public class ExamenPracticoModel extends SistemaDeNotasAcademicasModel  {
    public static double Bonificacion = 0.02;
     public ExamenPracticoModel(String Curso, String tipo, int CantidadPreguntas, int validas, int tiempoRespuesta){
        super(Curso,tipo,CantidadPreguntas,validas,tiempoRespuesta);
    }
      @Override
    public double getPuntajeXtiempo() {
        double puntaje = 0;
        if (tiempoRespuesta < 30) {
            puntaje = validas * 1.6;
        } else {
            if (tiempoRespuesta >= 30 && tiempoRespuesta <= 45) {
                puntaje = validas * 1.5;
            } else {
                if (tiempoRespuesta > 45) {
                    puntaje = validas * 1.4;
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
            }
        }
        return nBonificacion;
    }

    @Override
    public double getSumaFinal() {
         
        return (getPuntajeXtiempo() + getBonificacionXValidas()) * (1 +Bonificacion)  ;
    }

    public  double getBonificacion() {
        Bonificacion = Bonificacion * 100;
        return Bonificacion;
    }

    public String getCurso() {
        return Curso;
    }

    public String getTipo() {
        return tipo;
    }

    public int getCantidadPreguntas() {
        return CantidadPreguntas;
    }

    public int getValidas() {
        return validas;
    }

    public int getTiempoRespuesta() {
        return tiempoRespuesta;
    }
}
