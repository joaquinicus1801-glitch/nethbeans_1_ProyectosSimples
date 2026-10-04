
package PruebasModel.model.SueldoProyect;



public class SueldoPracticanteModel extends SueldoModel {

    public static double sueldo = 1500;
    public static double gratificacion = 0;
    public static double bono = 0.1;
    public static double bonificacion = sueldo*gratificacion+sueldo*bono;
    public static double renta = 0;
    public static double essalud = 0.1;
    public static double descuento = sueldo*renta +sueldo*essalud;
    public static double neto = sueldo + bonificacion - descuento;
    public SueldoPracticanteModel(String TipoTrabajador, String nombres, String mes) {
        super(TipoTrabajador, nombres, mes);
    }
    
       @Override
    public String mostrarSueldo() {
        return "tipo: "+tipo+
                "nombre: "+nombres+
                "mes "+mes+
                "sueldo "+sueldo+
                "bonificacion: "+bonificacion+
                "descuento :"+descuento+
                "neto :"+neto
                ;
    }
      public static double getSueldo() {
        return sueldo;
        
    }

    public static double getBonificacion() {
        return bonificacion;
    }

    public static double getDescuento() {
        return descuento;
    }

    public static double getNeto() {
        return neto;
    }

   public String getTipo() {
        return tipo;
    }

    public String getNombres() {
        return nombres;
    }

    public String getMes() {
        return mes;
    }

   
  
}
