package Ejercicio13;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ParOImpar parOImpar = new ParOImpar();
        Scanner lector = new Scanner(System.in);

        System.out.println("Ingrese un numero para determinar si es par o impar.");
        parOImpar.setNumero(lector.nextInt());

        System.out.println(parOImpar.verificacion());
    }
}
