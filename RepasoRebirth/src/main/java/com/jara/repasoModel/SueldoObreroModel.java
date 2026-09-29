package com.jara.repasoModel;

public class SueldoObreroModel extends SueldoModel {

    public static double sueldo = 2500;
    public static double gratificacion = 1.00;
    public static double bono = 0.1;
    public static double bonificacion = sueldo * gratificacion + sueldo * bono;
    public static double renta = 0.12;
    public static double essalud = 0.1;
    public static double descuento = sueldo * renta + sueldo * essalud;
    public static double neto = sueldo + bonificacion - descuento;

    public SueldoObreroModel(String TipoTrabajador, String Nombres, String Mes) {
        super(TipoTrabajador, Nombres, Mes);
    }

    @Override
   /* public String mostrarSueldo() {
        return super.mostrarSueldo()
                + "tipo: " + tipoTrabajador
                + " nombres " + nombres
                + " sueldo " + sueldo
                + " bonificacion " + bonificacion
                + " descuento " + descuento
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

    public  double getSueldo() { //debemos usar metodos de objetos no de static de clase porque estamos llamando a aributpos de la clase como tal
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
