package Ejercicio22;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        CeluMovil celuMovil = new CeluMovil();
        Scanner lector = new Scanner(System.in);

        System.out.println("Escriba su operador");
        celuMovil.setOperador(lector.next());

        System.out.println("Escriba los minutos totales consumidos");
        celuMovil.setMinutosConsumidos(lector.nextInt());

        celuMovil.operadorPrecios();

        System.out.println("El precio de su plan es de:" + celuMovil.precioTotal());
    }
}
