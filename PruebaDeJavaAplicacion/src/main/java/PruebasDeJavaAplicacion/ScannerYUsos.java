
package PruebasDeJavaAplicacion;

import java.util.Scanner;


public class ScannerYUsos {
     public static void main(String[] args) {
    Scanner escanerUWU = new Scanner(System.in);
     //Registro con uso de scanner
     int enteroPrimitivo = escanerUWU.nextInt(); //es para ingresar datos de tipo int
     System.out.println(" tu dato int es: " + enteroPrimitivo);
     Integer enteroObjeto = escanerUWU.nextInt(); //al parecer tambine funciona con dato ...
        System.out.println(" tu dato integer es: " + enteroObjeto);
     double realPrimitivo = escanerUWU.nextDouble(); //al parecer tambine funciona con dato ...
        System.out.println(" tu dato double es: " + realPrimitivo);
     Double realObjeto = escanerUWU.nextDouble();
        System.out.println(" tu dato Double es: " + realObjeto);
     String palabra = escanerUWU.next(); //regsitra datos tipo string
        System.out.println(" tu dato palabra es: " + palabra);
     String oracion = escanerUWU.nextLine(); //aqui registramos una oracion completa, una linea, ya que en 
     //el anterior no registra al encontrar espacios
      String oracion1 = escanerUWU.nextLine();
        System.out.println(" tu dato string oracion es: " + oracion1);
     
     }
}
