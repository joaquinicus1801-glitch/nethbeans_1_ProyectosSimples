
package PruebasModel.model;
   
    

public class ClaseStringModel {
    String contenido, texto, opcion;
    
    public ClaseStringModel(String Contenido, String texto, String opcion){
        this.contenido = Contenido;
        this.texto = texto;
        this.opcion = opcion;
        
    }
    
    public String metodos(){
           String Respuesta = "";
         switch(opcion){
             case "1":
                 Respuesta = contenido.trim();
                 return "La longitud del texto es: "+ Respuesta.length();
             case "2":
                 return contenido.trim().toUpperCase();
             case "3":
                 return "Existe?: "+contenido.trim().contains(texto.trim()); //contains te devuelve un boolean, ya que 
                 //afirma o desmiente que ese contenido este en contenido
             case "4":
                 if(contenido.trim().contains(texto.trim())){
                     return "Posicion: "+contenido.trim().indexOf(texto); //le da el texto el texto de input1 y te devuleve
                     //la posicion donde se encuentra dicho texto en el text area, aclaro que muestra la posicion del inicio del primer caracter
                 }
                 return "No existe coincidencias";
             case "5":   
                return "Comparar: "+contenido.trim().compareTo(texto);
                //comprara el texto del valor ingresado con el text con espacios elminados
                //compara el contenido de text area con el texto input 1, la respuesta que te da es un numero, es porque usa la tabla asci, resta el valor asci de textArea e input
             
                
                
         }
         
        
        
        
       return "No accede a ningun metodo";
    }
    
    
}
