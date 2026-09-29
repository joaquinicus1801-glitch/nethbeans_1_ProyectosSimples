package com.PA1.model;

public class claseStringModel {

    //atributos
    String input1, opcion, textArea;

    //constructor
    public claseStringModel(String TextArea, String Input1, String Opcion) {
        this.input1 = Input1;
        this.textArea = TextArea;
        this.opcion = Opcion;
    }
    //metodo

    public String Resultado() {
        String longitud ="";
        switch (opcion){
            case "1":
               longitud = "La longitud es "+(textArea.trim().length()); //eliminamos los vacios y recein contamos los caracteres, .tr //eliminamos los vacios y recein contamos los caracteres, .tr
             break; //el break solo lo puedes usar en caso no uses return derntro de las evaluaciones del switch
            case "2":
                return textArea.trim().toUpperCase(); //convierte en mayuscula el textArea con vacios laterales quitados
            case "3":
                longitud = "Existe? "+ (textArea.trim().contains(input1)); //el contains es una funcion donde evalua si contiene o no el valor evaluado, devuelve un booleano
            break;  
            case "4":
                if(textArea.trim().contains(input1)){ //si el text area con valores eliminados contiene el valor de input1 
                    longitud = "Posicion "+textArea.trim().indexOf(input1); //esto aqui indica que si encuentra una posicion esta el valor de index en el textarea con vacios quitados
                }   //le da el texto el texto de input1 y te devuleve la posicion donde se encuentra dicho texto en el text area, aclaro que muestra la posicion del inicio del primer caracter
                else{ 
                    longitud = "no encuentra"; //si no encuentra muestra nbo encuentra
                }
            case "5":
                 longitud = "comparar "+ (textArea.trim().compareTo(input1));  //comprara el texto del valor ingresado con el text con espacios elminados
                //compara el contenido de text area con el texto input 1, la respuesta que te da es un numero, es porque usa la tabla asci, resta el valor asci de textArea e input
        }    
        return longitud;

    }
}
