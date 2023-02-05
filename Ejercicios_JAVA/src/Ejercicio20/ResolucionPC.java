package Ejercicio20;

public class ResolucionPC {
    public boolean pitido;
    public boolean disc;
    public boolean unidad;

    public String revisarEstado(){
        if (pitido == true && disc == true){
            return "Está averiado";
        } else if (pitido == true && unidad == true ) {
            return "Póngase en contacto con el técnico apoyo.";
        } else if (pitido == true && unidad == false) {
            return "Verificar contactos de la unidad.";
        } else if (pitido == false && disc == false){
            return "Traiga la computadora para repararla en la central.";
        } else if (pitido == false && disc == true) {
            return "Compruebe las conexiones de altavoces";
        }
        return null;
    }
}
