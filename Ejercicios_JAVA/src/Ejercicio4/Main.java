package Ejercicio4;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Semaforo semaforo = new Semaforo();

        semaforo.colorBombilla = "Verde";
        semaforo.encendidoApagado = "ok";

        System.out.println(semaforo.mostrarMensajeAlVehiculo());

    }
    }
