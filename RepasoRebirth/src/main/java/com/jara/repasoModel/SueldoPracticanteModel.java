package com.jara.repasoModel;

public class SueldoPracticanteModel extends SueldoModel {

    public static double sueldo = 2000;
    public static double gratificacion = 1.00;
    public static double bono = 0.1;
    public static double bonificacion = sueldo * gratificacion + sueldo * bono;
    public static double renta = 0.12;
    public static double essalud = 0.1;
    public static double descuento = sueldo * renta + sueldo * essalud;
    public static double neto = sueldo + bonificacion - descuento;

    public SueldoPracticanteModel(String TipoTrabajador, String Nombres, String Mes) {
        super(TipoTrabajador, Nombres, Mes);
    }

    @Override
    /*public String mostrarSueldo() {
        return super.mostrarSueldo()   + "tipo: "+tipoTrabajador+ //revisar bien esta parte  porque tengo que poner mostrarsueldo del padre si no hay
                " nombres "+nombres
               +" sueldo "+sueldo
               + " bonificacion "+bonificacion 
                + " descuento "+descuento
                + " neto " + neto;
    }*/
       public String toString() { //nescitamos sobrescribir el objeto a texto para mostrase, con el toString de nosotros y no de la clase object
        return super.mostrarSueldo() 
                + "tipo: "+tipoTrabajador+
                " nombres "+nombres
               +" sueldo "+sueldo
               + " bonificacion "+bonificacion 
                + " descuento "+descuento
                + " neto " + neto;
}

    public double getSueldo() {
        return sueldo;
    }

    public  double getBonificacion() {
        return bonificacion;
    }

    public double getDescuento() {
        return descuento;
    }

    public  double getNeto() {
        return neto;
    }

    public String getTipoTrabajador() {
        return tipoTrabajador;
    }

    public String getNombres() {
        return nombres;
    }

    public String getMes() {
        return mes;
    }

}
