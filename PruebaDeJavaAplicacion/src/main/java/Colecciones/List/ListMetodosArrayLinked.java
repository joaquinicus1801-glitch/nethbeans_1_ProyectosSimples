package Colecciones.List;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ListMetodosArrayLinked {

    public static void main(String[] args) {
        List<Integer> arregloInt = new ArrayList<Integer>();
        List<String> arregloString = new ArrayList<String>();
        List<Double> arregloDouble = new ArrayList<Double>();
        
        //quiero agregar datos por posicion a mi arreglodinamico? metodo Add
           for(int i = 1; i <=10; i++){
            arregloString.add("alumno"+i); 
            
           //resultado:
           /*
             arregloString = [alumno0,alumno1,alumno2...] hasta 9 , 
           */
           
        }
        //quiero agregar una coleccion directamente a mi arreglo, concat no push es decir no esta en una posicion(analogiajs)
        //usa metodo addAll
           arregloInt.addAll(Arrays.asList(new Integer[]{1,2,4,6,7})); //se creo un arreglo estatico tipo Integer que fue combertido
           //a arreglo dinamico tipo  ArrayList asi que fue agregado
        //Hacemos lo mismo con List intefas implementado en una clase arraylist, (practica para webear juas juas)
        arregloDouble.addAll(Arrays.asList(new ArrayList<Double>(List.of(1.4,5.7,2.4)).toArray(Double[]::new)));
        //lo de arriba es un proceso super innecesario solo se prueba crear listas para volver estatico, volverlo list nue
        //vamente y luego insertar con all en 
    }

}
