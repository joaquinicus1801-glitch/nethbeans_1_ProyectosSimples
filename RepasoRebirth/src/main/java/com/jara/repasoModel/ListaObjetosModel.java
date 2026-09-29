
package com.jara.repasoModel;

public class ListaObjetosModel {
    public int documento;
    public String nombre,opcion;
    public double precio;
    
public ListaObjetosModel(int Documento, String Nombre, String Opcion, double Precio){
   
     this.documento = Documento;
     this.nombre = Nombre;
     this.opcion = Opcion;
     this.precio = Precio;
    
}
/*@Override //sobreescribe fase1
public String mostrarLista(){
    return "Documento: "+Documento+
            "Nombres: "+Nombre+
            "Curso: "+opcion+
            "Precio: "+Precio;
}   

 
/*@Override //sobreescribe  el objeto con el metodo string, es decir que lo hace cadena, el retorno es lo que se ve y es lo que se envia finalmente al servlet
public String toString(){ fase 2  toString es una funcion especial que aplica a los objetos, reemplaza el propio toString por defecto
    return "Documento: "+Documento+
            "Nombres: "+Nombre+
            "Curso: "+opcion+
            "Precio: "+Precio;
}   
    */
/*uso de getter para que se cree un metodo por cada uno de los atributos*/
 //fase final
//un getter es un metodo cuya funcion  es devolver el valor de un atributo, es como llamar al a tributo basicamente util en proyectos grandes 
    public int getDocumento() {
        return documento;
    }

    public String getNombre() {
        return nombre;
    }

    public String getOpcion() {
        return opcion;
        //usamos el swicth para que cada opcion de un resultado
    }

    public double getPrecio() {
        return precio;
    }
    
    /*
    sin lo de abajo java automatiucamente usa el toString de la clase en el jsp para mostrar sus resultados
    ya que se neceita volver texto el objeto para poder mostrarse, pero muestra datos raros, esto ocurre porque los obj heredan la clase objet
    y esta clase ya tiene su toStrign que ya menciones se ejecuta aurtomaticamente a l impprimir el objeto ya que con eso se muestra
    poruqe digo que hereda la clase objecto porque al crear una clase, como el de arriba esta tiene extend object de manera automatica
    */
    
    @Override //sobreescribe , con los getter ya no es necesario porque el item llama directamtne a los metodos aunque tu no ponasitem.getDocumento, el jsp lo hace asi cuando llamas
    //a un atributo de manera automatica llama al metodo
    public String toString(){
    return "Documento: "+getDocumento()+
            "Nombres: "+getNombre()+
            "Curso: "+getOpcion()+
            "Precio: "+getPrecio();
}  
}
