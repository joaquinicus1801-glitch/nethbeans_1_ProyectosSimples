
package PruebasModel.model;

import java.util.*;
import java.util.stream.Collectors;

public class AbecedarioModel {
    public String frase;
   public static List<Character> Abecedario = new ArrayList<Character>(List.of(
    'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 
    'n','ñ', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z'
));
   
   public AbecedarioModel(String frase){
       this.frase = frase;
   }
   
   public String posicionAbecedario(){
       List<String>ListaPosiciones = new ArrayList<String>(List.of(String.join("",frase.toLowerCase().trim().split(" ")).split(""))); 
       List <Integer> Posiciones = new ArrayList<Integer>();
       
       for(int indi1 = 0; indi1 < ListaPosiciones.size(); indi1++){
           for(int indi2 = 0; indi2 < Abecedario.size(); indi2++){
               if(ListaPosiciones.get(indi1).equals(String.valueOf(Abecedario.get(indi2)))){
                    Posiciones.add(indi2);
               }
               
           }
       }
       
       return String.join(",",Posiciones.stream().map(n -> String.valueOf(n)).collect(Collectors.toList()));
      
       
   }
   
   public List<Integer> CaracterDecendente(){
       List <String> invertido1 = new ArrayList<String>(List.of(posicionAbecedario().split(",")));
       List <Integer> invertido2= new ArrayList<Integer>();
       invertido2.addAll(invertido1.stream().map(n -> Integer.parseInt(n)).sorted(Comparator.reverseOrder()).collect(Collectors.toList()));
        
       return new ArrayList<Integer>(invertido2);
   }

}
    