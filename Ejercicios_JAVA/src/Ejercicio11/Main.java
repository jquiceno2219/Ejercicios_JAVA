package Ejercicio11;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        PosONeg posONeg = new PosONeg();
        Scanner lector = new Scanner(System.in);

        System.out.println("Ingrese el numero que desea evaluar.");
        posONeg.setNumero(lector.nextInt());

        System.out.println(posONeg.resultado());
    }
}
