package Colecciones.List;

import java.util.*;

public class ArrayListTema {

    public static void main(String[] args) {
        Collection<Integer> arreglo1 = new ArrayList<Integer>();
        /*
       Nivel de abstracción: El más alto (interfaz Collection).
       Qué métodos puedes usar? Únicamente los métodos generales definidos en la interfaz Collection (como add(), remove(), size(), isEmpty(), contains()).
Limitación: No puedes acceder a elementos por su índice (ej. arreglo1.get(0) no funcionará), porque el concepto de posición 
           o índice existe en las listas (List), pero no en todas las colecciones (por ejemplo, los conjuntos o Set no tienen orden por índice).
Uso recomendado: Cuando solo necesitas iterar o realizar operaciones genéricas sin importar el orden ni 
                 el acceso por índice.
         */
        List<Integer> arreglo2 = new ArrayList<Integer>();
        /*
        Nivel de abstracción: Intermedio (interfaz List).

¿Qué métodos puedes usar? Todos los métodos de Collection más los específicos de secuencias ordenadas (como get(index), 
        set(index, element), indexOf(), etc.).

Ventaja clave (Polimorfismo): Desacoplas el código de la implementación. Si en el futuro decides cambiar ArrayList
        por LinkedList, solo cambias el lado derecho (new LinkedList<Integer>()) y todo el resto de tu código seguirá funcionando intacto.

Uso recomendado: Es la buena práctica estándar en programación orientada a objetos (programar hacia una interfaz,
        no hacia una implementación).
        */
        ArrayList<Integer> arreglo3 = new ArrayList<Integer>();
        /*
        Nivel de abstracción: El más bajo (clase concreta ArrayList).

¿Qué métodos puedes usar? Todos los de List más los métodos específicos que solo existen dentro de ArrayList (como trimToSize() o ensureCapacity()).

Desventaja: Acoplas tu variable a la implementación concreta. Si más adelante quieres cambiar a otro tipo de lista, tendrás que modificar las declaraciones y métodos que usen arreglo3.

Uso recomendado: Solo cuando necesites explícitamente métodos exclusivos de la clase ArrayList.
        */
     
        // METODOS DE COLLECTION, LIST Y ARRAYLIST
        
        
    }

}
