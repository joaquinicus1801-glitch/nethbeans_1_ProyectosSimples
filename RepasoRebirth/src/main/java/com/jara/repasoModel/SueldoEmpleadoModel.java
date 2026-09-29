package com.jara.repasoModel;

public class SueldoEmpleadoModel extends SueldoModel { //aqui crea la clase pero la extiende a sueldoModel porque para que actue como esa clase
    //es una extencion e la superclase
    //simulamos el envio de base de datos, creamos atributos de clase

    public static double sueldo = 3500;
    public static double gratificacion = 1.00;
    public static double bono = 0.1;
    public static double bonificacion = sueldo*gratificacion + sueldo*bono;
    public static double renta = 0.12;
    public static double essalud = 0.1;
    public static double descuento = sueldo*renta+sueldo*essalud;
    public static double neto = sueldo+bonificacion-descuento;

    // constructor heredado, loq uqe esppecifica lo que es un constructor heredado
    public SueldoEmpleadoModel(String TipoTrabajador, String Nombres, String Mes) {
        super(TipoTrabajador, Nombres, Mes); //este super significa que heredo de una superclase, estos parametros herdados de una superclase

    }

    // metodo heredado
    @Override //sobrescribe
   /* public String mostrarSueldo() { //con una funcion string llamda mostrar sueldo a diferncia del toString si se necesita llamar
        return super.mostrarSueldo() 
                + "tipo: "+tipoTrabajador+
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
  //hacemos un getter recuerda que tambine desplegamos funciones para los atrributos de la superclase
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
