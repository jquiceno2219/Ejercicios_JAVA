package Ejercicio3;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        PrestamoLibro prestamoLibro = new PrestamoLibro();
        prestamoLibro.codPrestamo = 01;
        prestamoLibro.fechaPrestamo = "4/02";
        prestamoLibro.nombreLibro = "";
        prestamoLibro.codigoUsuario = 1127204;
        prestamoLibro.diasDePrestamo = 8;
        Scanner lector = new Scanner(System.in);

        boolean fin = false;
        int caso;

        while (!fin) {
            System.out.println("¿Que operación desea realizar?");
            System.out.println("1. Revisar estado");
            System.out.println("2. Revisar datos del préstamo");
            System.out.println("3. Finalizar el programa");

            caso = lector.nextInt();

            switch (caso) {
                case 1:
                    System.out.println(prestamoLibro.consultarEstadoPrestamo());
                    break;
                case 2:
                    System.out.println(prestamoLibro.consultarDatosPrestamo());
                    break;
                case 3:
                    fin = true;
                    System.out.println("Programa finalizado.");
                    break;
                default:
                    System.out.println("No existe prestamo");
            }


        }
    }
}
