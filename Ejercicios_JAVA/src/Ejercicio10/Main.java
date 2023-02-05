package Ejercicio10;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        SalarioSemanal salarioSemanal = new SalarioSemanal();
        Scanner lector = new Scanner(System.in);

        System.out.println("Ingrese su nombre");
        salarioSemanal.setNombre(lector.next());

        System.out.println("Ingrese el numero de horas trabajadas");
        salarioSemanal.setHoras(lector.nextInt());

        salarioSemanal.ValorHoras();

        System.out.println("Señor " + salarioSemanal.nombre + " \nEl numero de horas trabajadas es de " + salarioSemanal.numeroHoras + " y su salario total es de " + salarioSemanal.salarioTotal());
    }
}