
package com.pa3.model;

import java.util.ArrayList;

public class AsciiModel {
     private ArrayList<Character> listaA;
    private ArrayList<Integer> listaB;

    public AsciiModel() {
        listaA = new ArrayList<>();
        listaB = new ArrayList<>();
    }

    public void procesarTexto(String texto) {

        listaA.clear();
        listaB.clear();

        texto = texto.toUpperCase();

        for (int i = 0; i < texto.length(); i++) {

            char caracter = texto.charAt(i);
            int ascii = (int) caracter;

            if (ascii >= 32 && ascii <= 90) {

                listaA.add(caracter);
                listaB.add(ascii);

            }
        }
    }

    public ArrayList<Character> getListaA() {
        return listaA;
    }

    public ArrayList<Integer> getListaB() {
        return listaB;
    }
}
