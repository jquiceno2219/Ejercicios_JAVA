package Ejercicio17;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Gimnasio gimnasio = new Gimnasio();
        Scanner lector = new Scanner(System.in);

        System.out.println("¿Cuanto tiempo desea adquirir su mensualidad? (15 días, 30 días u 3 meses)");
        gimnasio.setTiempo(lector.nextInt());

        System.out.println(gimnasio.mensaje());
    }
}
