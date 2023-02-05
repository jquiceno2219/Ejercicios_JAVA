package Ejercicio1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Usuario usuario = new Usuario();
        Scanner read = new Scanner(System.in);

        System.out.println("Ingrese el usuario");
        usuario.usuarioIngresado = read.next();

        System.out.println("Ingrese la contraseña");
        usuario.claveIngresada = read.next();

        System.out.println(usuario.access());

    }
}