
package com.pa3.model;

import java.util.ArrayList;
import java.util.Collections;


public class AbecedarioModel {
     private String frase;

    public AbecedarioModel(String frase) {
        this.frase = frase;
    }

    public ArrayList<String> obtenerAbecedario() {

        ArrayList<String> abecedario = new ArrayList<>();

        String[] letras = {
            "A","B","C","D","E","F","G","H","I","J","K","L","M",
            "N","Ñ","O","P","Q","R","S","T","U","V","W","X","Y","Z",
            "a","b","c","d","e","f","g","h","i","j","k","l","m",
            "n","ñ","o","p","q","r","s","t","u","v","w","x","y","z"
        };

        for (String letra : letras) {
            abecedario.add(letra);
        }

        return abecedario;
    }

    public ArrayList<Integer> obtenerPosiciones() {

        ArrayList<String> abecedario = obtenerAbecedario();
        ArrayList<Integer> posiciones = new ArrayList<>();

        if (frase == null || frase.trim().isEmpty()) {
            return posiciones;
        }

        for (int i = 0; i < frase.length(); i++) {

            String letra = String.valueOf(frase.charAt(i));

            if (!letra.equals(" ")) {

                int posicion = abecedario.indexOf(letra);

                if (posicion != -1) {
                    posiciones.add(posicion);
                }
            }
        }

        return posiciones;
    }

    public ArrayList<Integer> obtenerPosicionesDesc() {

        ArrayList<Integer> posiciones = obtenerPosiciones();

        Collections.sort(posiciones, Collections.reverseOrder());

        return posiciones;
    }
}
