package Ejercicio12;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        AlquilerLavadoras alquilerLavadoras = new AlquilerLavadoras();
        Scanner lector = new Scanner(System.in);

        System.out.println("Ingrese 1 para lavadora grande, ó 2 para lavadora pequeña");
        alquilerLavadoras.setTipo(lector.nextInt());
        System.out.println("Ingrese la cantidad de lavadoras que desea alquilar");
        alquilerLavadoras.setCantidad(lector.nextInt());
        System.out.println("¿Cuántas horas desea alquilarlas?");
        alquilerLavadoras.setHoras(lector.nextInt());

        alquilerLavadoras.valor();

        System.out.println("el valor total es de: " + alquilerLavadoras.total());






    }
}
