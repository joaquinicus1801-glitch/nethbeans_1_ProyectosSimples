
package com.trust.Model;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.concurrent.ThreadLocalRandom;


public class TablaAsciModel {
    public static Collection<Integer> ColeccionAleatoria = new ArrayList<Integer>(); //creacion de coleccion Arreglo de tipo integer
    public int numero1;
    public int numero2;
    public ArrayList<Integer> ColeccionDeObjeto = new ArrayList<Integer>();
    
     public TablaAsciModel(int num1,int num2, ArrayList<Integer> lista){
        this.numero1 = num1;
        this.numero2 = num2;
        this.ColeccionDeObjeto = lista;
    }
      public static ArrayList<Integer> mostrarColeccion() { //metodo con el cual generamos el arreglo aleatorio
        ColeccionAleatoria.clear(); //limpiando el arreglo cada vez que se ejecute para evitar que se acumulen datos cada vez que de llama a la funcion
        int numAleatorio, indi = 0; //creo 2 variables de tipo entero
        while (indi < 15) { //bucle  mientras que indi sea menor a 15 se seguira repitiendo
            numAleatorio = ThreadLocalRandom.current().nextInt(65, 91); //la variable adquiere unvalor aleatorio entre 65 y 90
            switch (indi) { //condicional sobre la varaible indi
                case 0: //en caso este tenga un valor de 0
                    ColeccionAleatoria.add(numAleatorio); //el numero se agrega directamente en en la coleccion
                      indi++; //se le suma uno al indi
                break; //termina el codigo de arriba, el bucle se evalua denuevo
                default: // en caso el indi sea diferente de 0 
                    //recomnedado usar metodos de arreglos
                   if(ColeccionAleatoria.contains(numAleatorio) == false){ //aplica una condicional deonde se usa un metodo de arreglo si
                       //el arreglo  NO contiene el numero aleatorio generado ENTONCES se agrega ala coleccion y se suma mas uno el indi
                        ColeccionAleatoria.add(numAleatorio);
                       indi++;
                   }
                   //si no, el indi se queda ahi , se repite el bucle
                 break;
             }
        }
        //System.out.println(ColeccionAleatoria);
     return new ArrayList<Integer>(ColeccionAleatoria); //una vez el bucle termina devuelve un arreglo, mas especifico una "copia",
     //es asi para que el return coincida con el tipo de dato que esta creado el metodo
    }
    public  ArrayList<Integer> nuevaColeccion(){
        ArrayList<Integer> ColeccionNueva = new ArrayList<Integer>(); //no usar public en una variable local da error xd;
        for( int indi = 0; indi < ColeccionDeObjeto.size(); indi++){
            if(ColeccionDeObjeto.get(indi) >= numero1 && ColeccionDeObjeto.get(indi) <= numero2){
                ColeccionNueva.add(ColeccionDeObjeto.get(indi));
            }
        }
        if(ColeccionNueva != null && !ColeccionNueva.isEmpty()){
         ColeccionNueva.sort((num1,num2) -> Integer.compare(num1,num2)); // asi se usa el sort en java, le das la funcnion de comparacion de
        //esa manera, para string es diferente, este es en orden , //el sort no funciona en hashst o en  sets en general preguntar luego porque, lo que se esque no tiene metodo sort   
        }
        else{
            
        }
    return ColeccionNueva;
    }
    public ArrayList<String> nuevaColeccionAsci(){
        ArrayList<Integer> Coleccion = new ArrayList<Integer>(nuevaColeccion());
        //o tambien creo que e podia usar Coleccion.addAll(nuevaColeccion());
        //ArrayList<String> ColeccionAsci = new ArrayList<String>();
        char[] ColeccionAsciPre = new char[Coleccion.size()]; //creamos un arreglo normal tipor char para almacenar los valores
        ArrayList<String> ColeccionAsci = new ArrayList<String>();
        for(int indi = 0; indi < Coleccion.size(); indi++){
            //transformando los valores en carater asci
            ColeccionAsciPre[indi] =(char)(int)Coleccion.get(indi); //es necesario pasar el dato a int y luego char para esto
            //el integer no puede ser char directamente. 
        }
        for(char letra : ColeccionAsciPre){
            System.out.print(letra + " ");
           }
           System.out.println();
         for( int indi = 0; indi < ColeccionAsciPre.length; indi++){
             ColeccionAsci.add(String.valueOf(ColeccionAsciPre[indi])); //uso el String.valueOf para volver char a string y asi agregarlo al arreglo string
         }
        
     return ColeccionAsci;
    }
    
     
     
     
}
