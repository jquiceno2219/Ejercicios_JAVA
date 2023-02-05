package Ejercicio2;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        citaMedica citaMedica = new citaMedica();
        Scanner lector = new Scanner(System.in);

        citaMedica.nombrePaciente = "Juan";
        citaMedica.codCita = 1234;
        citaMedica.nombreMedico = "José Pepe";
        citaMedica.consultorio = 300;
        citaMedica.hora = "9:30 PM";
        citaMedica.fecha = "04/02/2023";
        citaMedica.setCentroMedico("Sanitas");

        int inicializadorHora;

        System.out.println("Su  cita ha sido asignada: " + citaMedica.crearCita());

        System.out.println("Los datos de la cita son: " + citaMedica.consultarCita());

        System.out.println("Digite 1 si desea cambiar la hora de la cita");
        inicializadorHora = lector.nextInt();

        if (inicializadorHora == 1) {
            System.out.println("Ingrese la nueva hora");
            citaMedica.hora = lector.next();
            System.out.println(citaMedica.cambiarHorario());
        } else {
            citaMedica.cambiarHorario();
        }


    }

}