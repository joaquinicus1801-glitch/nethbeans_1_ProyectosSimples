
package EjerciciosSueltos;

import java.util.*;
import java.util.Scanner;

public class AreaDeUnTrianguloDadoSusCatetos {
       public static void main(String[] args) { /*el static significa que es un metodo de clase*/
        /*usamos el sacnner que es como el leer de pseint*/
          Scanner teclado = new Scanner(System.in); /*crea una variable de clase scanner que tnega
          un scanner que permita ingresar datos al sistema, teclado es el nombre de nuestro scanner*/
        
          //calcular el area y perimetro de un triangulo rectangulo dados los catetos
          System.out.println("Ingresa el cateto opuesto");
          double catetoOpuesto = teclado.nextDouble(); /*para usar el scanner debemos especificar que el tipo 
          de dato que ingreasremos */
          double catetoAdyacente = teclado.nextDouble(); /*para usar el scanner debemos especificar que el tipo 
          de dato que ingreasremos */
          double Hipotenusa = Math.sqrt(Math.pow(catetoOpuesto,2)+Math.pow(catetoOpuesto,2));
          double area = (catetoOpuesto+catetoAdyacente)/2;
          double perimetro = Hipotenusa + catetoOpuesto + catetoAdyacente;
          System.out.println("El area de este triangulo es: "+area+" y el perimetro es "+perimetro);
          
          Collection <String> re = new HashSet<String>();
          
       
            
          /*Recopilacion previa
          Math.sqrt();  raiz cuadrada deun numero o expresion
          Math.pow(expresion o numero, potenciador); eleva el numero por el numero que pongas en el potenciador
          
          
          
          */
        
    }
}
