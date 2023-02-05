package Ejercicio4;

public class Semaforo {
    public String colorBombilla;
    public String encendidoApagado;


    public String estadoSemaforo() {
        if (encendidoApagado == "No") {
            return "Apagado";
        } else {
            return "Encendido";
        }
    }


    public String mostrarMensajeAlVehiculo(){
        if (colorBombilla == ("Verde")){
            return "Adelante";
        } else if (colorBombilla == ("Rojo")) {
            return "Detengase";
        }else {
            return "Prepárese";
        }
    }
}