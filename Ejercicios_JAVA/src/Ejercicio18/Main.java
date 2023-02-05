package Ejercicio18;

import java.util.Scanner;

public class Main {
    public static void main(String args[]) {
        Triangulo triangulo = new Triangulo();

        Scanner lector = new Scanner(System.in);

        System.out.println("Ingrese el número 1");
        triangulo.numero1 = lector.nextInt();

        System.out.println("Ingrese el número 2");
        triangulo.numero2 = lector.nextInt();

        System.out.println("Ingrese el número 3");
        triangulo.numero3 = lector.nextInt();

        triangulo.suma();

        System.out.println("Es un triángulo? " + triangulo.trianguloVerificacion());}
}
