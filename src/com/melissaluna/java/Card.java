package com.melissaluna.java;
import java.util.ArrayList;



public class Card {

    String valor;
    String palo;
    String color;


    public static final String[] Palos = {"Trebol", "Corazon", "Pica", "Diamante"};
    public  static  final int LimiteCarta = 13;

    public void carta() {
        this.valor = valor;
        this.palo = palo;
        this.color = color;
    }

    @Override
    public String toString() {
        return "valor= " +valor + ", palo" + palo + "color = " + color;
    }
}

/*/*ArrayList<Object> palo= new ArrayList<>();


        palo.add ("trebol");
        palo.add ("corazon");
        palo.add ("pica");
        palo.add ("diamante");


        ArrayList<Object> color= new ArrayList<>();

        color.add ("negro");
        color.add ("rojo");

        ArrayList<Object> valor= new ArrayList<>();
        valor.add ("A");
        valor.add ("2");
        valor.add ("3");
        valor.add ("4");
        valor.add ("5");
        valor.add ("6");
        valor.add ("7");
        valor.add ("8");
        valor.add ("9");
        valor.add ("10");
        valor.add ("K");
        valor.add ("Q");
        valor.add ("J");
*/




