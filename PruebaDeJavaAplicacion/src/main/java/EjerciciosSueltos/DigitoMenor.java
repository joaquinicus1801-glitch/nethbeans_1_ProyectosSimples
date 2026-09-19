
package EjerciciosSueltos;

import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.Scanner;
import java.util.stream.Collectors;


public class DigitoMenor {


    public static void main(String[] args) {
       //Obtener el digito mas pequeño de un numero dado
       int num = 0;
       int digitomenor = 10, digito = 0;
       Scanner escanerUWU = new Scanner(System.in);
       System.out.println("Escribe un numero porfavor");
       try{
           num = escanerUWU.nextInt();
       }catch(InputMismatchException e){
           System.out.println("Escribe un numero valido porfavor");
           return;
       }   
       while(num != 0){
           digito = num%10;
           if(digito < digitomenor){
               digitomenor = digito;
           }
           num = num/10;
           
       }
       System.out.println("El digito menor es: "+digitomenor);
       
       
       //version 2: no eficiente la verdad solo practicando metodos
         try{
           num = escanerUWU.nextInt();
       }catch(InputMismatchException e){
           System.out.println("Escribe un numero valido porfavor");
           return;
       }
       digitomenor = Integer.parseInt(Arrays.asList(String.valueOf(num).split("")).stream().sorted().collect(Collectors.toList()).get(0)); //se convirtio en String el dato num
       System.out.println("el digitomenor es: "+digitomenor);
    }
    
}
