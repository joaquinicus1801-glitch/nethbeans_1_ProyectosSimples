
package com.pa3.model;

import java.util.ArrayList;

public class FigurasModel {
       
    // ATRIBUTOS
    private ArrayList<String> listaFiguras;
    private int numeroAleatorio;
    private String figuraSeleccionada;
    private String area;
    private String perimetro;
    
    // CONSTRUCTOR
    public FigurasModel() {
        
        listaFiguras = new ArrayList<>();
        
        listaFiguras.add("Cuadrado");
        listaFiguras.add("Rectangulo");
        listaFiguras.add("Triangulo");
        listaFiguras.add("Rombo");
        listaFiguras.add("Romboide");
        listaFiguras.add("Trapecio");
        listaFiguras.add("Circulo");
        listaFiguras.add("Poligono");
        
        numeroAleatorio = (int)(Math.random() * 7);
        
        figuraSeleccionada = listaFiguras.get(numeroAleatorio);
        
        asignarFormulas();
    }
    
    // MÉTODO PARA ASIGNAR FÓRMULAS
    public void asignarFormulas() {
        
        switch(figuraSeleccionada) {
            case "Cuadrado":
                area = "A = L x L";
                perimetro = "P = L+L+L+L";
                break;
            case "Rectangulo":
                area = "A = b x h";
                perimetro = "P = b+b+h+h";
                break;
            case "Triangulo":
                area = "A = (b x h) / 2";
                perimetro = "P = L+L+L";
                break;
            case "Rombo":
                area = "A = D x d";
                perimetro = "P = L+L+L+L";
                break;
            case "Romboide":
                area = "A = b x h";
                perimetro = "P = b+b+h+h";
                break;
            case "Trapecio":
                area = "A = h(B+b) / 2";
                perimetro = "P = B+b+L+L";
                break;
            case "Circulo":
                area = "A = π x r²";
                perimetro = "C = π x d";
                break;
            case "Poligono":
                area = "A = (p x a) / 2";
                perimetro = "P = L x #lados";
                break;
        }
    }
    
    // GETS
    public ArrayList<String> getListaFiguras() {
        return listaFiguras;
    }
    
    public int getNumeroAleatorio() {
        return numeroAleatorio;
    }
    
    public String getFiguraSeleccionada() {
        return figuraSeleccionada;
    }
    
    public String getArea() {
        return area;
    }
    
    public String getPerimetro() {
        return perimetro;
    }
    
}
