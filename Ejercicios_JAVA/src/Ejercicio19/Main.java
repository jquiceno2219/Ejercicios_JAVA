package Ejercicio19;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Fotocopia fotocopia = new Fotocopia();
        Scanner lector = new Scanner(System.in);

        System.out.println("¿Cuántas copias desea imprimir?");
        fotocopia.setCantidad(lector.nextInt());

        fotocopia.precioOperacion();
        fotocopia.precioTotal();

        System.out.println(fotocopia.result());


    }
}
