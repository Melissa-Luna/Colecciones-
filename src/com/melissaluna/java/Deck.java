package com.melissaluna.java;

import java.util.*;
import java.util.Collections;

public class Deck {

    private Card cartas[];
    private int SiguienteCarta;

    public void mazo() {

        int Numero_Cartas = 52;
        this.cartas = new Card[Numero_Cartas];
        this.SiguienteCarta = 0;
    }

    private void CrearBaraja(){

        String[] palos = Card.Palos;

        for (int i=0; i< palos.length; i++){

            for (int j=0; j<Card.LimiteCarta; j++){

                cartas[(i*(( Card.LimiteCarta))+j)] = new Card();
            }
        }

    }

}




        /*ArrayList<Object> mazo = new ArrayList<>();

        for (int c = 1; c <= 52; c++){
            mazo.add(c);
        }
        //System.out.println("Cartas" +mazo);

        List<Object> shuffleMe = new ArrayList<Object>(mazo);
        Collections.shuffle(shuffleMe);
        Set<Object> shuffledSet = new LinkedHashSet<Object>();
        shuffledSet.addAll(shuffleMe);
        System.out.println("\nSe mezcló el Deck " + shuffledSet);

    }
}*/
