
package PruebasDeJavaAplicacion;

import java.util.InputMismatchException;


public class tryCatch {

    public static void main(String[] args) {
         //error de transformacion de string a double o int
                try {

                   /* base = Math.abs(Double.parseDouble(baseTexto));
                    System.out.println("base ahora se transformo en double");*/
                } catch (NumberFormatException e) {
                   /* base = 0;
                    System.out.println("Error en la transformacion, por dato invalido");*/
                }
                
          //captura de error de insercion de datos que no corresponden al tipo de dato del arreglo      
            try{
               // Coleccionuwu.add(registro.nextInt());
            }
            catch(InputMismatchException e){
              /*   System.out.println("Estas seguro de ya no ingresar numeros? Coloca 1 para continuar, 0 para terminar");
                 seguir = registro.next().equals("1"); //esto es una condicional rapida da un booleano dependiendo
                 //el registro coincide con el valor de 1 si es asi es true por lo que el boolean seguir tiene el valor de 
                 //true sino es false
                  seguir = registro.next().equals("1");
                 System.out.println("Eadsadsa"); */
            }
    }
    
}
