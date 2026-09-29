package com.jara.repasoModel;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class ColeccionesModel {

    //1.atributos de la clase
    public static String alumno1 = "Lucero"; //static significa eso que pertenece a la clase no al objeto
    public static String alumno2 = "Joaquin";
    public static String alumno3 = "Diana";
    public static String alumno4 = "David";
    public static String alumno5 = "Susana";
    public static String alumno6 = "Pancho";
    public static String alumno7 = "Luis";
    public static String alumno8 = "Carlos";
    public static String alumno9 = "Samanta";
    //colecciones
    public static Collection<String> Alumnos = new ArrayList<String>(); //creacion de una coleccion alumnos que es un arreglo, dinamoco por cierto
    public static Collection<String> NuevosAlumnos = new ArrayList<String>();
    public static List<String> listaAlumnos = new ArrayList<String>();
    public static Set<String> listaSet = new HashSet<String>(); // el set puede variar en el tipo no necesariamente areglo , en este caso usamos el hashSet
    public static Map<Integer, String> listaMap = new HashMap<Integer, String>(); //el map tiene una llave y elementos, tiene 2 tipos de datos?
    public String Texto, Opcion;
    //su llave vale un entero pero cada elemento es string
    //creacion de contructor porque enviamos parametros y crearemos un objto
    public ColeccionesModel(String Texto, String Opcion){
        this.Texto = Texto;
        this.Opcion = Opcion;
    }
    //no hay contructor porque no enviamos parametros, usamos los metodos directos de la clase
    //Metodo (de clase porque los datos son de la propia clase  no enviados por nosostros?)
    
    //Modififcada para el metodo do post
    public static ArrayList<String> mostrarColeccion() {
        Alumnos.add(alumno1);
        Alumnos.add(alumno2);
        Alumnos.add(alumno3);
        Alumnos.add(alumno4);
        Alumnos.add(alumno5);

        //segunda coleccion
        NuevosAlumnos.add(alumno6);
        NuevosAlumnos.add(alumno7);
        NuevosAlumnos.add(alumno8);
        NuevosAlumnos.add(alumno9);

        //unimos colecciones
        Alumnos.addAll(NuevosAlumnos); //agrega los nuevos alumnos a al arreglo alumnos, es como un concat no un push ya que
        //no agrega el arreglo en una posicion sino que cada posicion del arreglo agregado es una posicion del arreglo alumno 

        return new ArrayList<String>(Alumnos);//se usa este return dedibdo que por ejemplo alumnos es tipo coleccion pero promete un array
        //osea si tienen que ver porque array es un tipo de coleccion, pero java piensa al ver collection<string> "No sé si realmente es un ArrayList, podría ser otra implementación."
        //el return espera que sea un arraylist ese return, entonces al usar new estamos creando un array nuevo:
        /*
        ArrayList<String> copia =
        new ArrayList<>(Alumnos);

         return copia;
         crea un array que alverga el arreglo alumnos, copia todos sus elementos, se hace una copia para coincidir con el tipo de retorno asi que devulve un arraylist
        */
    }

    public static ArrayList<String> mostrarLista() {
        List<String> listaAlumnos = new ArrayList<String>(); //cada vez que se eejcuta este metodo de clase se reseta en como un clar(9 debido a que declara nuevamente el arreglo  
        listaAlumnos.add(alumno1); //la lista yr permite valores duplicados
        listaAlumnos.add(alumno2);
        listaAlumnos.add(alumno1);
        listaAlumnos.add(alumno3);
        listaAlumnos.add(alumno4);
        listaAlumnos.add(alumno5);
        listaAlumnos.add(alumno6);

        return new ArrayList<String>(listaAlumnos);
    }
    //Creacion para el metodo do post
    public ArrayList<String> mostrarLista2() { //como este es atributo de instancia no se usa static porque es metodo de instancia
        List<String> Data = new ArrayList<String>(); 
         //la lista yr permite valores duplicados
        //  Data.addAll(mostrarLista()); //esto es que agregue toda lo que esta en el rotorno de mostrar lista osea la lista del metodo mostrarcLista()
        //practiamente el addAll sirve para agregar toda una coleccion en este caso del llamado a la funcion mostraLista
        switch(Opcion){
            case "1":
                Data.addAll(mostrarLista());    
             break;
            case "2":
                Data.addAll(mostrarLista());
                Data.add(Texto); //se agrega el valor de texto
                //esto especifica en que posicion desea agregar , en este daso en el 0 Data.add(0,Texto);
             break;
            case "3":
                  Data.addAll(mostrarLista()); //mostrar
                  boolean ValorBuscar = Data.contains(Texto); //cree un  var booleano que albeerga el valor bolean de contais
                  if(ValorBuscar){ //si es verdad entones
                      int posicion = Data.indexOf(Texto); //variable int que tiene el retorno de la posicion del texto, donde 
                      //inicia la posicion del texto
                      Data.set(posicion,"alexander"); //esto inserta en la posicion, pone el nombre de alexander
                  }
                  else{
                      Data.add(Texto); //sino encuentra el texto que lo agregue
                  }
                  
             break;
            case "4":
                   Data.addAll(mostrarLista()); //mostrar
                   Data.remove(Texto); //eliminara el valor de texto de la lista
             break;
        }
        //Collections.sort(Data); //con esto ordeno de forma ascendente, es de forma lafabetica, 
        //Collections.reverse(Data); //esto lo hace de manera descendente
        Collections.shuffle(Data); //muestra aleatoriamente las posiciones
        return new ArrayList<String>(Data);
    }
        public ArrayList<Integer> mostrarSerie() {
        List<Integer> DataEnteros = new ArrayList<Integer>(); //cada vez que se eejcuta este metodo de clase se reseta en como un clar(9 debido a que declara nuevamente el arreglo  
         //la lista yr permite valores duplicados
        int inicial = 23;
        int fin = 42;
        for(int j = inicial; j <= fin; j++){
            DataEnteros.add(j);
        }
        /* numeros random
        for(j = 0; j <= 5; i++){
          int random =  Integer.parseInt(Math.random()*(termino-inicial+1) +  inicial); //la logica es que multiplica 
          int random =  (int)Math.random()*(termino-inicial+1) +  inicial; //conviere el mathrandom en entero 
        if(data.contains(random)){
        i--;
        else{
        DataEnteros.add(random);
        }
        }
        
        */
           Collections.shuffle(DataEnteros); //muestra aleatoriamente las posiciones
        return new ArrayList<Integer>(DataEnteros);
        }   

    public static HashSet<String> mostrarSet() {

        listaSet.add(alumno1);   //no permite valores repetidos por lo que supongo que ese valor no se inserta o quizas 
        // si ocupa una posicion pero esta invisible, demas noto que esata invertido?
        listaSet.add(alumno1);
        listaSet.add(alumno2);
        listaSet.add(alumno2);
        listaSet.add(alumno3);
        return new HashSet<String>(listaSet);
    }
    public static HashMap<Integer, String>mostrarMap(){
        listaMap.put(100, alumno1); //si ide de alumno 1 es 100 es como si al as posiciones le pusieramos nuestro propio numero identficador de posicion
        listaMap.put(200, alumno2);
        listaMap.put(300, alumno3);
        listaMap.put(400, alumno4);
    return new HashMap<Integer, String>(listaMap);
   }
} 
 
