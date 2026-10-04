
package PruebasModel.model.SueldoProyect;




public class SueldoObreroModel extends SueldoModel implements SueldoInterface{
    public static double sueldo = 2500;
    public static double gratificacion = 0.50;
    public static double bono = 0.1;
    public static double bonificacion = sueldo*gratificacion+sueldo*bono;
    public static double renta = 0.10;
    public static double essalud = 0.9;
    public static double descuento = sueldo*renta +sueldo*essalud;
    public static double neto = sueldo + bonificacion - descuento;
    public SueldoObreroModel(String TipoTrabajador, String nombres, String mes) {
        super(TipoTrabajador, nombres, mes);
    }
    /*un motod puede ser sobrescurot como quiereas y mostrar lo que desees
       @Override
    public String mostrarSueldo() {
        return "tipo: "+TipoTrabajador+
                "nombre: "+nombres+
                "mes "+mes+
                "sueldo "+sueldo+
                "bonificacion: "+bonificacion+
                "descuento :"+descuento+
                "neto :"+neto
                ;
    }*/
    @Override
    public String toString(){
        return "tipo: "+tipo+
                "nombre: "+nombres+
                "mes "+mes+
                "sueldo "+sueldo+
                "bonificacion: "+bonificacion+
                "descuento :"+descuento+
                "neto :"+neto
                ;
    }
      public  double getSueldo() {
        return sueldo;
    }

    public  double getBonificacion() {
        return bonificacion;
    }

    public  double getDescuento() {
        return descuento;
    }

    public double getNeto() {
        return neto;
    }

     public String getTipo() {
         String tipo1 = "";
         switch(tipo){
             case "1": tipo1 = "empleado";
              break;
             case "2": tipo1 = "obrero";
                 break;
             case "3": tipo1 = "practicante";
                 break;
         }
        return tipo1;
    }

    public String getNombres() {
        return nombres;
    }

    public String getMes() {
        return mes;
    }
    
    private double calcularDuplicar(){ //es un metodo private nadie sabe que hizo apra duplicar, eso es encapsulamiento
        //private es un metodo local?
        return neto *2;
    }

    @Override
    public double duplicar() { //solo muestra los el resultado no el como asi que puede ser public
       return calcularDuplicar();
    }

    
}
