
package PruebasDeJavaAplicacion;

import java.util.ArrayList; //libreria de arreglos
import java.util.*;


public class ColeccionesEstaticoYdinamico {
       public static void main(String[] args) { /*el static significa que es un metodo de clase*/
   /*     System.out.println("Hello World!");
        ArrayList<Double> palabras = new ArrayList<Double>(); //ARREGLO DINAMICO 
        String[] estatico = new String[0]; // arreglo estatico, con tamaño definido
         palabras.add(23.54);
        System.out.println(estatico.length); // metodo para ver el tamaño de un arreglo estatico en java
        System.out.println(palabras.size()); //metodo para ver el tamaño de un arreglo dinamico en jav
      //   Double nada = Double.parseDouble(palabras);
      String ssd = palabras.toString();
        double prueba = 5;
        System.out.println(prueba+hola());
        */
        
        /*comprobacion de tamaño y posciciones en colecciones dinamicas
        Collection <String> alumnos1 = new ArrayList<String>(2);
       // Collection <String> alumnos2 = ["sda","ada"];  esto esta mal ilegal "ilegal start of expreso"
      // String[] estatico = new String["ads","da"]; tambien esta mal
        //initial capacity le dices a java que reserve 2 espacios en la mememoria para 2 elementos, aun asi si size es 0
        //pero si agrego inserto un dato en el arreglo que pasa? sera posicion 0 o 3 , tendra tamaño 3 ?
        System.out.println("Tamaño de arreglo alumnos1 con 2 esapcios inicializados sin datos: "+alumnos1.size());
        alumnos1.add("joaquin");
        System.out.println("Tamaño de arreglo alumnos1 con adicion de un nombro: "+alumnos1.size());// comprobe que es 1
        System.out.println("muestra del arreglo completo: "+alumnos1); //el arreglo solo muestra joaquin
        */
        //verificar que pasa si agrego una variable o arreglo a una arraylist desde la creacion
        String nombre = "kisame";
        int ju = 3;
        String[] arregloNombres = new String[2];
        arregloNombres[0] = "julian";
        arregloNombres[1] = "lucia";
        Collection <String> alumnos3 = new ArrayList <String>();
        alumnos3.add("toriko");
        alumnos3.add("sukuna");
        //Collection <String> alumnos2 = new ArrayList<String>(ju); //errores parece que solo van variables numericos
        //System.out.println("coleccion " + new ArrayList<String>(arregloNombres)); no puede estaticos
        Collection <String> alumnos2 = new ArrayList<String>(alumnos3); //si es estatico si se agrega? no como numero?
        System.out.println("muestra del arreglo completo: "+alumnos3); //al agregar un arreglo, copia ese arreglo, no es posicion 0 sino el arreglo es un espejo
        System.out.println("muestra el tamaño del arreglo completo: "+alumnos3.size()); //por eso su tamaño es 3 porque es igual al arreglo
      
    }
       public static double hola(){ /*puedo crer otro metodo es como las clases que creo en el model solo que aqui esta el main*/
         double  resp = 0.0;
         resp = 3.4+1.4;
        return resp;
       }
}
