package Ejercicio24;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        GameOf21 gameOf21 = new GameOf21();
        Scanner x = new Scanner(System.in);

        gameOf21.carta1Uno =    (int)(Math. random()*10+1);
        gameOf21.carta2Uno =    (int)(Math. random()*10+1);
        gameOf21.carta3Uno =    (int)(Math. random()*10+1);
        gameOf21.carta1Dos =    (int)(Math. random()*10+1);
        gameOf21.carta2Dos =    (int)(Math. random()*10+1);
        gameOf21.carta3Dos =    (int)(Math. random()*10+1);

        System.out.println("Jugador 1 \n carta 1 :"+ gameOf21.carta1Uno + " carta 2: "+ gameOf21.carta2Uno);
        System.out.println("Jugador 2 \n carta 1: "+ gameOf21.carta1Dos + " carta 2: "+ gameOf21.carta2Dos);
        System.out.println("Ingrese alguna tecla para los resultados...");

        System.out.println("Jugador 1 \n carta: 1 "+ gameOf21.carta3Uno);
        System.out.println("Jugador 2 \n carta: 1 "+ gameOf21.carta3Dos);
        gameOf21.jugar();
    }
}
