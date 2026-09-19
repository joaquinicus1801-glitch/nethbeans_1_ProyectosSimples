
package ClasesNativasString;

public class String_metodos {

    public static void main(String[] args) {
        //un String tambien es definido como un array de caracteres, loe metodos de la clase string permiten lo que es la modificacion
        //o realizar operaciones de dichos caracteres
        String palabra = "hola mi kion";
        String palabra2 = "como estas";
        
        System.out.println(palabra.concat(palabra2)); //no es lo mismo que el +, tiene restricciones importante
        //como 
        int comparar = palabra.compareTo(palabra2); //con este metodo string compara lexicograficamente ambas partes, da un resultado
        //int un numero pues calcula una resta de ambos con su valor lexicografico, si son iguales da 0 sino da un numero positivo
        //o negativo
        System.out.println(palabra.compareToIgnoreCase(palabra2)); //igual solo que aunque uses mayusculas o minisculas si la palabra o letra es igual
        //da 0
        System.out.println(palabra.lastIndexOf("mi")); //Retorna la posición de la última ocurrencia de caracter dentro de la cadena actual.
        
        System.out.println(palabra.charAt(3)); //en su parametro usa int, devuelve un char,
        //Retorna el caracter ubicado en la posición especificada por índice. 

         System.out.println(palabra.contains("ki")); //en su parametro se pone un string, devuevle un boolean
         //en caso de que ese string si esta contenido en la variblae palabra da truem sini false
         char[] g = palabra.toCharArray(); //es como el split digamos pero en ves de crear un string crea un chr arreglo, donde cada caracter es un poscicion
         System.out.println( g );
         
    }
    
}
