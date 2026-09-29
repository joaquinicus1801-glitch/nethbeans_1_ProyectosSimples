
package PruebasModel.model.SueldoProyect;


public abstract class SueldoModel {
    protected String tipo, nombres,mes; //atributos que seran heredados tiene que ser protected, la clase debe ser encapsulada
    //debemos volverlo solo lectura, proteje

    public SueldoModel(String TipoTrabajador, String nombres, String mes) {
        this.tipo = TipoTrabajador;
        this.nombres = nombres;
        this.mes = mes;
    }
    //metodos
    public String mostrarSueldo(){
        return "asd";
    }
}
