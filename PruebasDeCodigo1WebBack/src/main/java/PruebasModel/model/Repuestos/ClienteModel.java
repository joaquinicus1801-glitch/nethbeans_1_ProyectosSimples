
package PruebasModel.model.Repuestos;


public class ClienteModel {
     public Integer codigo;
     public String nombre;
     public String direccion;
     public int edad;
     public String telefono;

    public ClienteModel(Integer codigo, String nombre, String direccion, int edad, String telefono) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.direccion = direccion;
        this.edad = edad;
        this.telefono = telefono;
    }

    public Integer getCodigo() {
        return codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public String getDireccion() {
        return direccion;
    }

    public int getEdad() {
        return edad;
    }

    public String getTelefono() {
        return telefono;
    }
    
     
}
