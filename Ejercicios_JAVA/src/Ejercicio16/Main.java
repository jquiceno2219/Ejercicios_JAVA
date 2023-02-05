package Ejercicio16;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Alcaldia alcaldia = new Alcaldia();
        Scanner lector = new Scanner(System.in);

        System.out.println("Ingrese su género");
        alcaldia.setGenero(lector.next());

        System.out.println("Ingrese su edad ");
        alcaldia.setEdad(lector.nextInt());

        System.out.println(alcaldia.valorTotal());

    }
}
