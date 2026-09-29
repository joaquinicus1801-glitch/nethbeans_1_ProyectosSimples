package PruebasModel.model.SueldoProyect;

public class SueldoEmpleadoModel extends SueldoModel {

    public static double sueldo = 3500;
    public static double gratificacion = 1.00;
    public static double bono = 0.1;
    public static double bonificacion = sueldo*gratificacion+sueldo*bono;
    public static double renta = 0.12;
    public static double essalud = 0.1;
    public static double descuento = sueldo*renta +sueldo*essalud;
    public static double neto = sueldo + bonificacion - descuento;

    public SueldoEmpleadoModel(String TipoTrabajador, String nombres, String mes) {
        super(TipoTrabajador, nombres, mes); //indica que todo fue heredados de una superclase

    }

    //metodo heredado
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
                "neto :"+neto + "aplico override?"
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

    public  double getNeto() {
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
