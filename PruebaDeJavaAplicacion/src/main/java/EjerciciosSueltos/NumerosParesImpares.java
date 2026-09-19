
package EjerciciosSueltos;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;


public class NumerosParesImpares {

   
    public static void main(String[] args) {
        // cuenta de numeros pares e impares
        boolean seguir = true;
        
       
         Scanner registro = new Scanner(System.in);
        ArrayList<Integer> Coleccionuwu = new ArrayList<Integer>();
        System.out.println("el tamano de la coleccionuwu es: "+Coleccionuwu.size());
        System.out.println("Ingresa numeros, si ya no quieres ingresar escribe cualquier cosa que no sea numero xd ");
        do{
            try{
                Coleccionuwu.add(registro.nextInt());
            }
            catch(InputMismatchException e){ //error cuando ingresas un dato que no sea numero 
                 System.out.println("Estas seguro de ya no ingresar numeros? Coloca 1 para continuar, 0 para terminar");
                 seguir = registro.next().equals("1"); //esto es una condicional rapida da un booleano dependiendo
                 //el registro coincide con el valor de 1 si es asi es true por lo que el boolean seguir tiene el valor de 
                 //true sino es false
                  seguir = registro.next().equals("1");
                 System.out.println("Eadsadsa");
                  Integer[] paress = new Integer[]{2,3};
            }
        }while(seguir);
        switch(Coleccionuwu.size()){
            case 0: 
                 System.out.println("No hyanada que calcular");
            break;     
            default:
               Integer[] pares = Coleccionuwu.stream().filter(n -> n%2 == 0).toArray(Integer[]::new); //crea un arreglo nuevo?
               Integer[] impares = Coleccionuwu.stream().filter(n -> n%2 != 0).toArray(Integer[]::new);
                 System.out.println("los numeros de pares son: "+pares.length);
                   System.out.println("los numeros de impares son: "+impares.length);
        }
     
       
    }
    
}
