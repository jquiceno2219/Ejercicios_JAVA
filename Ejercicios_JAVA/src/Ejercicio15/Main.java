package Ejercicio15;

import java.util.Scanner;

public class Main {
    public static void main(String args[]) {
        MayorDeTres mayorDeTres = new MayorDeTres();
        Scanner reader = new Scanner(System.in);

        System.out.println("Ingrese el número 1");
        mayorDeTres.setNumero1(reader.nextInt());

        System.out.println("Ingrese el número 2");
        mayorDeTres.setNumero2(reader.nextInt());

        System.out.println("Ingrese el número 3");
        mayorDeTres.setNumero3(reader.nextInt());

        System.out.println(mayorDeTres.verificacion());


    }
}
