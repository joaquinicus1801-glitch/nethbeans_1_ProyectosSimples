package PruebasModel.model.NotasAcademicas;

public abstract class SistemaDeNotasAcademicasModel {

    protected String Curso, tipo;
            int CantidadPreguntas, validas, tiempoRespuesta;

    public SistemaDeNotasAcademicasModel(String Curso, String tipo, int CantidadPreguntas, int validas, int tiempoRespuesta) {
        this.Curso = Curso;
        this.tipo = tipo;
        this.CantidadPreguntas = CantidadPreguntas;
        this.validas = validas;
        this.tiempoRespuesta = tiempoRespuesta;
    }

   
    /*
   public int puntajeTiempo(){
       if(tiempoRespuesta < 30){
           
       }else(tiempoRespuesta )
       return 1; asi lo haria si fuera solo uno uwu
   }    
    
    */
    public double getPuntajeXtiempo(){
     
    return 0;
    }
    
    public double getBonificacionXValidas(){
        return 0;
    }
    
    public double getSumaFinal(){
        
        return 0;
    }
    
    
    public static int TransformacionDeDatos(String Dato) {
        Integer Dato2 = null;
        if (Dato != null && !Dato.trim().isEmpty()) {
            try {
                Dato2 = Integer.parseInt(Dato);
            } catch (NumberFormatException e) {
                
            }

        }
        return Dato2;
    }
}
