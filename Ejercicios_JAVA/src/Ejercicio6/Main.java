package Ejercicio6;

public class Main {
    public static void main(String[] args) {
        PagoEmpleado pagoEmpleado = new PagoEmpleado();

        pagoEmpleado.codEmpleado = 1234;
        pagoEmpleado.setSalarioBasico(10000);
        pagoEmpleado.horasExtra = 3;
        pagoEmpleado.setNumeroHoras(12);
        pagoEmpleado.setDescuentoPrestamo(500);

        System.out.println("El valor de las horas extra es de: " + pagoEmpleado.calcularValorHE());
        System.out.println("El valor del devengado es de: " + pagoEmpleado.calcularDevengado());
        System.out.println("El valor del deducido es de: " + pagoEmpleado.calcularDeducido());
        System.out.println("El neto de su pago es de: " + pagoEmpleado.calcularNeto());


    }
}