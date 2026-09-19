
package PruebasModel.model;

import java.util.*;

public class ListaDeObjetoModel {
    public String nombre,dni,curso;
    public double precio;
    
    public ListaDeObjetoModel(String nombre, String dni, String curso, Double precio){
        this.nombre = nombre;
        this.dni = dni;
        this.curso = curso;
        this.precio = precio;
    }
     
  /*  public String mostrarLista(){ //simplemente un metodo que muestra los atributos del objeto, nada especial
        
        return "Documento: "+Dni+
                "Nombre: "+nombre+
                "Curso: "+curso+
                "precio: "+precio;
                
    }*/
  
    //getter, funciones que devuleven un atributo puedes modificarlo
    public String getNombre() {
        return nombre;
    }

    public String getDni() { //usar minusculas para propiedades es mejor evita errores ?
        return dni;
    }

    public String getCurso() {
        return curso;
    }

    public double getPrecio() {
        return precio;
    }
    
    @Override //es necsario sobrescribir, sin override java usa el toString pro defecto de la clase Object
    //en el jsp al mostrar con EL necesita ser texto por lo que usa el to String pero como el objeto tiene toString personalizado
    //entonces se aplica esta sobrescitua, ojo solo al objeto de esta clase, 
    // da una Es una representación basada en la clase y una identificación del objeto.
    //"Cuando este objeto tenga que convertirse a texto, quiero que se represente de esta manera."
    public String toString(){
     
        
        return "Documento: "+getDni()+
                " Nombre: "+getNombre()+
                " Curso: "+getCurso()+
                " precio: "+getPrecio();
        /* return normal 
        return "Documento: "+Dni+
                "Nombre: "+nombre+
                "Curso: "+curso+
                "precio: "+precio; */
    }
     //nota para mostrar cada posicion con su objeto en el jsp es necesrio sobrescribir override osea mostrar la coleccion,        
    //en conjunto de los objetos
    //en caso de que uses el jstl para for each para propiedades de un objeto ne le recorrido necesitas los metodos
    //getter, sino dara error al llamar unicamente a las propiedades, no es necesario aplicar override
    //siempre usa minusculas en tus propiedades o que empiezen con minuscula
    
   
    
    
}
