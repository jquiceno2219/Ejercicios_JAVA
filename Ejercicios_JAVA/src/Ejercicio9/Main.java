package Ejercicio9;

public class Main {
    public static void main(String[] args) {
        Reclamo reclamo = new Reclamo();

        reclamo.numeroReclamo = 5432;
        reclamo.setNombrePersona("Jaime");
        reclamo.setAsunto("Demora en el envío");
        reclamo.descripcionReclamos = "'Se envió hace 7 dias y no ha llegado'";
        reclamo.setEstadoReclamo("en revision");

        System.out.println(reclamo.validarEstadoReclamo());
        System.out.println(reclamo.mensajeRecepcionReclamo());
    }
}