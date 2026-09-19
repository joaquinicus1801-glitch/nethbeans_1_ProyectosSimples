
package EjerciciosSueltos;

import static java.lang.Math.abs;
import java.util.Scanner;


public class CalcularMedia {

    public static void main(String[] args) {
       //Pide al usuario que introduzca 10 numeros enteros. Despues calcula y muestra su media (para probar el programa puedes hacerlo con menos numeros, pero el programa debe ser valido para hacerlo con 100 numeros...
	//...con un solo cambio en el programa
        System.out.println("Ingresa la cantidad de numeros a ingresar (no decimal ni negativo porfa xd)");
         Scanner registro = new Scanner(System.in);
         double promedio = 0;
         int numeros[] = new int[Math.abs(registro.nextInt())];
          System.out.println("el tmaaño del arreglo es: "+numeros.length);
          for(int indi = 0; indi < numeros.length; indi++){
              numeros[indi] = abs(registro.nextInt()); //puedo usar el metodo abs sin mencionar la clase porque exporte la clase mathabs
              promedio = promedio + numeros[indi];
          }
          promedio = promedio/numeros.length;
          System.out.println("el promedio de los numeros es: "+promedio);
        
    }
    
}
