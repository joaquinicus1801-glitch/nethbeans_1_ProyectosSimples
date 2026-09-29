//recibe las respuesta? hace el calculo final? recibe los parametros del controlador 
package com.jara.model;
public class CalculadoraModel { //al crear el nombre de la este javaclass, que es nuestro model se crea una clase publica con el musmo 
    //1.- Atributos (son variables como en js, tipo boolean, int, string, etc)
      //de instancia y de clase (de clase son los que  conosco su valor y los de instacia no); cuando se habla de clase es inherente a ella, es decir que ese valor estar en todos los objetos o oinstancias creadas, mientras que si es de instancia en particular de cada una
    // cuando recibe los valores del constructor y luego los pasa al metodo
      public double valor1;  
      public double valor2;
      public String opcion;
    //2.- Constructores, enlace de la clase con el controlador, reciber los datos del controlador, lo pasa a los atributos 
      public CalculadoraModel(double Valor1, double Valor2, String Option){ //es como una funcion, con sus parametro?
          this.valor1 = Valor1; //el constructor trae los parametros del controlador, si no hay no necesitas un constructor
          this.valor2 = Valor2;  //el constructor siemore tiene el mismo nombre de la calse
          this.opcion = Option; //el thisvalor asigna el valor de los parametros a los atributos de clase para el objeto
      }
    //3.- Metodos //funcion que en este caso sirve para resolver, se encarga de la logica asi como unaa funcione js xd
      //a diferencia de funcion usa atributos creados de la clase, es metodo porque esta dentro de una clase
    //tambien hay 2 metodos de instancias y de clases, de ins: usa atributos de clase he instancia, clas: solo usa atribu de clase
//mbc metodo que devuelve valor, indicar que tipo de valor no cual valor
       public double CalcularOperacion(){//clase publico?, indicamoes que el valor devuelto sera doble, 
           double resultado;
        switch(opcion){
            case "1":
               resultado = valor1+ valor2;
            break;
              
            case "2":
                resultado = valor1 - valor2;
            break;
            
            case "3":
                resultado = valor1*valor2;
            
            case "4":
                if(valor2 == 0){
                    return Double.NaN;
                }
                resultado = valor1/valor2;
            break;
            default:
                resultado = 0;
            break;
        }
         return resultado; //esto es lo que retorna, siempre se pone sino da error, ya lo cambias dependiendo lo que necesitas
       //esl return es el respones obviamdetne
       }
}