package Ejercicio8;

public class Main {

    public static void main(String[] args) {
        Envio envio = new Envio();

        envio.numeroGuia = 0450;
        envio.setFecha("04/02/23");
        envio.setTipoEmbalaje("Caja");
        envio.cedulaCliente = 112722;
        envio.setPeso(8);
        envio.setCiudadOrigen("Armenia");
        envio.setCiudadDestino("Pereira");
        envio.setCosto(40000);
        envio.setEstadoEnvio("Enviado");

        System.out.println("El costo por kilo de su envio es de: " + envio.calcularCostoXKilo());
        System.out.println("Su paquete tiene un peso de: " + envio.getPeso() + "kg");

        System.out.println(envio.verificarEntrega());


    }
}
