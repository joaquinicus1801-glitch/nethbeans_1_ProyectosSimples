
package PruebasModel.model;

import java.util.*;
import java.util.stream.Collectors;


public class juegoDeDadosModel {
   public List<Integer> Resultado = new ArrayList<Integer>();
   public Integer tiros;
   public Integer dado1; 
   public Integer dado2;
   
   public juegoDeDadosModel(Integer dado1, Integer dado2,Integer tiros){
       this.tiros = tiros;
       this.dado1 = dado1;
       this.dado2 = dado2;
   }

    public void setTiros(Integer tiros) {
        this.tiros = tiros;
    }

 

    public void setDado1(Integer dado1) {
        this.dado1 = dado1;
    }

    public void setDado2(Integer dado2) {
        this.dado2 = dado2;
    }

    public Integer getTiros() {
        return tiros;
    }

    public Integer getDado1() {
        return dado1;
    }

    public Integer getDado2() {
        return dado2;
    }
   
   
   
   public List<Integer> resultados(){
       Resultado.clear();
        Resultado.addAll(List.of(dado1,dado2));
        System.out.println("El arreglo es" + Resultado);
       return new ArrayList<Integer>(Resultado);
   }
   public Integer sumaResult(){
        System.out.println("ingreso a la funcion");
           /*List <Integer> i = new ArrayList<Integer>(resultados());
           Integer suma;
           Integer acu=0;
            System.out.println("porque:" + i);
            for(int indi = 0; indi < i.size(); indi++){
                acu = acu + i.get(indi);
            }
            suma = acu;*/
         Integer suma = resultados().stream().reduce(0,(acu,n) -> acu + n); //uso de reduce, */
       return suma;
   }
   
 
}
