
package com.PA1.model;


public class PA1_FigurasGeometricasModel {
       String opciones;
    double lados;
    double base;
    double altura;
    double apotema;
    double radio;
    
    public PA1_FigurasGeometricasModel(String Opciones, double Lados, double Base, double Altura, double Apotema, double Radio){
    this.opciones = Opciones;
    this.lados = Lados;
    this.base = Base;
    this.altura = Altura;
    this.apotema = Apotema;
    this.radio = Radio;
    }
    public double CalcularPerimetro(){
      double Perimetro = 0;
      switch(opciones){
          case "1":
             if(radio != 0){
                 Perimetro = 2 * 3.1416 * radio;
           } 
          break;
          case "2":
              if(lados != 0 && base != 0){
                  if(lados == base ){
                     Perimetro = (lados*3);
                  }
                  else {
                  Perimetro = lados*2+base;
                  }
               }
          break;
          case "3":
              if(base != 0 && altura != 0){
                  Perimetro = 2*(base+altura);
              }
          break;
          case "4":
              if(lados != 0){
                  Perimetro = lados*4;
              }
          break;
          case "5":
               if(lados != 0){
                  Perimetro = lados*5;
              }
          break;
          default:
          break;
      }
     return Perimetro;
    }
    public double CalcularArea(){
       double Area = 0;
          switch(opciones){
          case "1":
              if(radio != 0){
                 Area = 3.1416 * Math.pow(radio,2);
              }
          break;
          case "2":
              if(base != 0 && altura != 0){
             Area = base*altura/2;
            }  
          break;
          case "3":
              if(base != 0 && altura != 0){
                  Area = base*altura;
              }
          break;
          case "4":
              if(lados != 0){
                  Area = Math.pow(lados, 2);
              }
          break;
          case "5":
             if(lados != 0 && apotema != 0){
                 Area = (CalcularPerimetro()*apotema)/2;
             }
          break;
          default:
          break;
    }
          return Area;
    }
}
