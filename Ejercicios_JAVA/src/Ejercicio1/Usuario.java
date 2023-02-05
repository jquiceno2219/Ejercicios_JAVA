package Ejercicio1;

    public class Usuario {
        public String usuarioBase;
        public String usuarioIngresado;
        public String claveBase;
        public String claveIngresada;
        public String estadoSistema;

        public String statusValidation(String claveIngresada) {

        return this.claveIngresada = claveIngresada;
        }

    public String access() {

        if (claveIngresada.equals("password")) {
            return "Bienvenido";
        } else {
            return "Acceso denegado.";
        }
    }
    }
