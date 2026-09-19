
package EjerciciosSueltos;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

public class LetraVocal {
      public static Character[] vocal = new Character[5];
 
    public static void main(String[] args) {
        //determina si una letra es vocal o no (en minuscula y sin tildes)
        Scanner escanerUWU = new Scanner(System.in);
        Character letra = (escanerUWU.next().charAt(0)); //convierte en caso el string sea solo un caracter
         
         boolean EsVocal = Arrays.asList(LetraVocal.RellenarVocal()).contains(letra);
        
         if(EsVocal){
             System.out.println("si es vocal");
         }
         else{
             System.out.println("no es vocal");
         }
        
    }
    
    public static Character[] RellenarVocal(){
       int a = vocal.length;
        vocal[0] = 'a';       
        vocal[1] = 'e';    
        vocal[2] = 'i';    
        vocal[3] = 'o';
        vocal[4] = 'u';    
        
        return vocal;
    }
    
    
}
