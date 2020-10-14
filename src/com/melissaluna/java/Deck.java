package com.melissaluna.java;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.ArrayList;

public class Deck {

    private HashMap<String,String> palos = new HashMap<String, String>();
    private ArrayList<Card> juegoDmazo = new ArrayList<Card>(); // se refiere al juego de mazo
    private String strFormat = "Quedan %s";

    public ArrayList<Card> getJuegoDmazo(){ //este metodo llama a la clase carta
        return juegoDmazo;
    }

    public void mazo(){ // se definen los cuatro pares atributos
        palos.put("Diamante", "Rojo");
        palos.put("Trebol", "Negro");
        palos.put("Pica", "Negro");
        palos.put("Corazon", "Rojo");
    }

    public void crearbaraja(){ //se crean las cartas en un ciclo
        mazo();
        for (Map.Entry<String,String> palo:palos.entrySet()){
             var paloCarta = palo.getKey();
             var color = palo.getValue();

             for (int i = 1; i<=13; i++){
                 Card card = new Card(paloCarta, color);
                 card.setValor(i);
                 juegoDmazo.add(card);
             }
        }
    }

    public void shuffle(){ // se revuelven las cartas
        Collections.shuffle(juegoDmazo);
        System.out.println("Se mezclo el Deck");
    }

    public void head(){ //mostrar la primera carta del deck
        var card = juegoDmazo.get(juegoDmazo.size()-1);
        juegoDmazo.remove(card);
        System.out.println(card.toString());
        System.out.println(String.format(strFormat,juegoDmazo.size()));
    }

    private Card randomCard(){ // aleatoriamente
        var rd = (int)Math.floor(Math.random()*(1-juegoDmazo.size()+1)+juegoDmazo.size());
        return juegoDmazo.get(rd);
    }

    public void pick(){ //sacar una carta random del mazo
        var card = randomCard();
        juegoDmazo.remove(card);
        System.out.println(card.toString());
        System.out.println(String.format(strFormat, juegoDmazo.size()));
    }

    private void printHand(ArrayList<Card> cards){
        for (var card: cards) System.out.println(card.toString());
    }

    public void hand(){ //sacar 5 cartas
        if (juegoDmazo.size()  <= 5){
            for (var card: juegoDmazo){
                printHand(juegoDmazo);
            }
        }else {
            var cards = new ArrayList<Card>();
            Card card;
            for (int i = 1; i<=5; i++){
                card = randomCard();
                juegoDmazo.remove(card);
                cards.add(card);
            }
            printHand(cards);
            System.out.println(String.format(strFormat, juegoDmazo.size()));
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






