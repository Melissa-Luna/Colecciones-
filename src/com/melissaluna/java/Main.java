package com.melissaluna.java;


import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {

    int opcion;
    boolean salir = false;

    public void showMenu() {

        Deck deck = new Deck();
        deck.crearbaraja();

        Scanner scanner = new Scanner(System.in);
        System.out.println("Bienvenido a Poker!");

        while (!salir) {

            System.out.println("Selecciona una opción:" + "\n1 Mezclar deck" + "\n2 Sacar una carta" + "\n3 Carta al azar"
                    + "\n4 Generar una mano de 5 cartas" + "\n0 Salir");


            try {
                System.out.println("Ingrese la opción elegida");
                opcion = scanner.nextInt();

                switch (opcion) {
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
                        salir = true;
                        System.out.println("Usted salio del juego");
                        break;

                    default:
                        throw new IllegalStateException("Opción no valida");

                }
            }catch (InputMismatchException e){
                System.out.println("Opción no valida");
                scanner.next();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    public static void main(String[] args) {

        Main menu = new Main();
        menu.showMenu();

    }
}