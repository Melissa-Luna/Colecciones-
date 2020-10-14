package com.melissaluna.java;


public class Main {

    public static void main(String[] args) {


        Deck deck = new Deck();
        deck.crearbaraja();

        deck.shuffle();
        deck.head();
        deck.pick();
        deck.hand();




    }
}
