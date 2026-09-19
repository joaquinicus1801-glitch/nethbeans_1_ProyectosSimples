
package EjerciciosSueltos;

import java.util.Scanner;


public class mulriplode6 {

    public static void main(String[] args) {
        // cuenta y suma todos los multiplos de 6, determina el limite de numero
             Scanner registroNumerico = new Scanner(System.in);
             int contador = 0;
             int sumaMultiplos = 0;
             int numeroMaximo = registroNumerico.nextInt();
             
             while(numeroMaximo > 0){
                 if(numeroMaximo%6 == 0){
                     contador = contador + 1;
                     sumaMultiplos = sumaMultiplos + numeroMaximo;
                 }
                 numeroMaximo--;
                 
             }
             System.out.println("la cantidad de multiplos fueron: "+contador);
             System.out.println("La suma de los multiplo es: "+sumaMultiplos);
    }
    
}
