package com.melissaluna.java;


import java.util.Scanner;

public class Main {

    int opcion;

    public void showMenu(){

        Deck deck = new Deck();
        deck.crearbaraja();

        Scanner  scanner = new Scanner(System.in);

        System.out.println("Bienvenido a Poker!");
        System.out.println("Selecciona una opción:" + "\n1 Mezclar deck" + "\n2 Sacar una carta" + "\n3 Carta al azar"
        + "\n4 Generar una mano de 5 cartas" + "\n0 Salir" + "\nIngrese la opción elegida:");
        opcion = scanner.nextInt();


        switch (opcion){
            case 1:
                deck.shuffle();
                break;

            case 2:
                deck.head();
                break;

            case 3:
                deck.pick();
                break;

            case 4:
                deck.hand();
                break;

            case 0:
                System.out.println("Usted salio del juego");
                break;

            default:
                System.out.println("Opción no valida");
                showMenu();

        }
    }

    public static void main(String[] args) {

        Main menuDopciones = new Main();
        menuDopciones.showMenu();

    }
}