
package PruebasModel.model;

import java.util.*;
import java.util.concurrent.ThreadLocalRandom;
import java.util.stream.Collectors;


public class TablaASCIIModel {
    public static List<Integer> ListaAleatoria = new ArrayList<Integer>();
    public int NumeroInicio, NumeroFinal;
    private List<Integer> ListaObjeto = new ArrayList<Integer>();
    
    public TablaASCIIModel(int NumeroInicio, int NumeroFinal, ArrayList<Integer> lista){
        this.NumeroInicio = NumeroInicio;
        this.NumeroFinal = NumeroFinal;
        this.ListaObjeto = lista;
    }
    
    public static ArrayList<Integer> MostrarListaAleatoria(){
        ListaAleatoria.clear(); System.out.println("se limpia la lista"); //limpiando el arreglo cada vez que se ejecute para evitar que se acumulen datos cada vez que de llama a la funcion
        int numeroAleatorio = 0, indi = 0; System.out.println("se crean las 2 variables ");
        System.out.println("entrada al bucle ");
        while(indi < 15){
          numeroAleatorio = ThreadLocalRandom.current().nextInt(60, 91); //alamamecena un numero aleatorio entre 
          //65 y 90 
          System.out.println("se creo el numero aleatorio: "+numeroAleatorio);
          switch(indi){
              case 0: 
                  System.out.println("como indi 0 entonces se inserta el numero: "+numeroAleatorio);
                  ListaAleatoria.add(numeroAleatorio);
                   indi++;
              break;
              default:
                  System.out.println("como indi es diferente de 0 entonces ingresa aqui");
                  if(ListaAleatoria.contains(numeroAleatorio) == false){
                      System.out.println("no contiene la lista dicho valor por lo que agrega");
                      ListaAleatoria.add(numeroAleatorio);
                      System.out.println("suma +1 el indi");
                     indi++;
                  }
              break;     
        }
          
   }
         return new ArrayList<Integer>(ListaAleatoria);
   }
   
    public List<Integer> ListaNuevaDeObjeto(){
        List<Integer> ListaNueva = new ArrayList<Integer>();
        System.out.println("El arreglo es: "+ListaNueva); //cuando usas el  Sys.. el objeto pasa por el metodo toString() por lo qu/e
        //da como resultado [], al estar inicializado no da null, da null cuand/te si no la instancias con new y le asignas explícitamente el valor nulo:
        //ArrayList<String> ColeccionAsci = null;  System.out.println(ColeccionAsci); // Esto sí imprime: null
        //ListaNueva.addAll((ArrayList<Integer>)ListaObjeto.stream().filter(n -> n >= NumeroInicio && n <= NumeroFinal ));
        //mala practica un stream no es una instancia de array, el casting solo promete que es arraylist, posible error al ejecutar
        //el codigo, casting como tal no convierte (investigar mejor) es mejor usar un metodo que garantize la transformacion y que ya lo guardes
        ListaNueva.addAll(ListaObjeto.stream().filter(n -> n >= NumeroInicio && n <= NumeroFinal ).sorted().collect(Collectors.toList())); 
        //usamos collectors ppara transformar a list
        //el sorted ordena ya de manera por valor, exsten varios metodos sort, de firentes clases, algunos usan la funcion
        //de comparacion para variar el orden, como de manera descendente
        if( ListaNueva.size() == 0){ //tambien puedes usar isEmpty, no es necesario usar null , porque ucando inicializas
            //el arreglo entonces al ser new Array... ya no es null, simplemnente su tamaño es 0, ya que hay una referncia valida
            // es supongo parecido a String num = 1; 1 es la referencia al objeto ? no se xd
            ListaNueva.add(100);
        }
        return new ArrayList<Integer>(ListaNueva);
    }
    
    public List<Character> ListaAsciNueva(){ //version con clase Character
         List<Character>ColeccionAsci = new ArrayList<Character>();
        if(ListaNuevaDeObjeto().contains(100)){
            return new ArrayList<Character>(List.of('1')); //chracter se escirbe con una comilla 
        }
        ColeccionAsci.addAll(ListaNuevaDeObjeto().stream().map(n ->(char)(int)n).collect(Collectors.toList()));
        return new ArrayList<Character>(ColeccionAsci);
    }
      /*
         Version String tipico juas 
        public List<String> ListaAsciNueva(){
         List<String>ColeccionAsci = new ArrayList<String>();
        if(ListaNuevaDeObjeto().contains(100)){
            return new ArrayList<String>(List.of("100"));
        }
        ColeccionAsci.addAll(ListaNuevaDeObjeto().stream().map(n -> String.valueOf((char)(int)n)).collect(Collectors.toList()));
        return new ArrayList<String>(ColeccionAsci);
    }*/
    
}

