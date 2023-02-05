package Ejercicio14;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Notas notas = new Notas();
        Scanner reader = new Scanner(System.in);

        System.out.println("Ingrese su nota de Fisica");
        notas.setfisica(reader.nextDouble());

        System.out.println("Ingrese su nota de Quimica");
        notas.setQuimica(reader.nextDouble());

        System.out.println("Ingrese su nota de Biologia");
        notas.setBiologia(reader.nextDouble());

        System.out.println("Ingrese su nota de Matematicas");
        notas.setMate(reader.nextDouble());

        System.out.println("Ingrese su nota de Informatica");
        notas.setInformatica(reader.nextDouble());

        System.out.println("Su promedio es de: " + notas.notaFinal());
        System.out.println(notas.mensaje());


    }
}