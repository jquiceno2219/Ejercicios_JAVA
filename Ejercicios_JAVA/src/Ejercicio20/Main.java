package Ejercicio20;

import java.util.Random;

public class Main {
    public static void main(String[] args) {
        ResolucionPC resolucionPC = new ResolucionPC();
        Random rd = new Random();
        resolucionPC.pitido = rd.nextBoolean();
        resolucionPC.disc = rd.nextBoolean();
        resolucionPC.unidad = rd.nextBoolean();

        System.out.println(resolucionPC.revisarEstado());
    }
}
