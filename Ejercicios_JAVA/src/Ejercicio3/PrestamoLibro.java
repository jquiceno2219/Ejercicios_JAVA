package Ejercicio3;

public class PrestamoLibro {
    public int codPrestamo;
    public String fechaPrestamo;
    public String nombreLibro;
    public int codigoUsuario;
    public int diasDePrestamo;
    public boolean estadoPrestamo = true;

    public String consultarEstadoPrestamo(){
        if(estadoPrestamo){
            return "Préstamo activo";
        }else {
            return  "Inactivo";
        }
    }


    public String consultarDatosPrestamo(){
        return "Código: " + codPrestamo + " Nombre del Libro: "+ nombreLibro + " Fecha: " + fechaPrestamo + " Código del Usuario: " + codigoUsuario + " Días de préstamo: " + diasDePrestamo;
    }

}
