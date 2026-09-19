
package EjerciciosSueltos;

import java.util.Scanner;

public class InvertirCadena {
    
    public static void main(String[] args) {
        Scanner escanerUWU = new Scanner(System.in);
        String cadena = escanerUWU.next();
        System.out.println(InvertirCadena.invertir(cadena));
    }
    
    public static String invertir(String Cadena){
        String CadenaInvertida = "";
        for(int indi = Cadena.length()-1 ; indi >= 0; indi--){
            CadenaInvertida = CadenaInvertida + Cadena.charAt(indi);
        }
      return CadenaInvertida;  
    }
    
}
