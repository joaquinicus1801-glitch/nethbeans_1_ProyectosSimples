
package EjerciciosSueltos;

import java.util.*;
import java.util.Scanner;
import java.util.stream.Collectors;


public class sumNumeros {

    public static void main(String[] args) {
        //suma todos los numeros comprendidos entre los 2 numeros enteros que indique el usuario sin incluirlos
        System.out.println("ingresa 2 numeros, se sumaran los numero que HAY ENTRE ELLOS PERO NO SE INCLUIRAN");
        Scanner escanerUWU = new Scanner(System.in);
        int num1 = 0; int num2 = 0; int contnum = 0;
        try{
             num1 = Integer.parseInt(escanerUWU.next());
             num2 = Integer.parseInt(escanerUWU.next());
        }
        catch(NumberFormatException e){
            System.out.println("ingresa numeros porfis, comenzaras de nuevo");
            return;
        }
        if(Math.abs(num1-num2) == 0 || Math.abs(num1-num2) == 1){
            System.out.println("no hay nada de numeros que esten entre los 2");
        }
        else{
            Integer nummenor = List.of(num1,num2).stream().sorted().collect(Collectors.toList()).get(0);
            Integer nummayor = List.of(num1,num2).stream().sorted().collect(Collectors.toList()).get(1);
            while(nummenor + 1 < nummayor){
                contnum = contnum + nummenor + 1;
                nummenor++;
            }
            System.out.println("La suma de los numeros es: "+contnum);
        }
        
    }
    
}
