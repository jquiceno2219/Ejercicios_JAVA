package Ejercicio8;

public class Envio {

    public int numeroGuia;
    private String fecha;
    private String tipoEmbalaje;
    public int cedulaCliente;
    private int peso;
    private String ciudadOrigen;
    private String ciudadDestino;
    private int costo;

    private String estadoEnvio;

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public String getTipoEmbalaje() {
        return tipoEmbalaje;
    }

    public void setTipoEmbalaje(String tipoEmbalaje) {
        this.tipoEmbalaje = tipoEmbalaje;
    }

    public int getPeso() {
        return peso;
    }

    public void setPeso(int peso) {
        this.peso = peso;
    }

    public String getCiudadOrigen() {
        return ciudadOrigen;
    }

    public void setCiudadOrigen(String ciudadOrigen) {
        this.ciudadOrigen = ciudadOrigen;
    }

    public String getCiudadDestino() {
        return ciudadDestino;
    }

    public void setCiudadDestino(String ciudadDestino) {
        this.ciudadDestino = ciudadDestino;
    }

    public int getCosto() {
        return costo;
    }

    public void setCosto(int costo) {
        this.costo = costo;
    }

    public String getEstadoEnvio() {
        return estadoEnvio;
    }

    public void setEstadoEnvio(String estadoEnvio) {
        this.estadoEnvio = estadoEnvio;
    }

    public int calcularCostoXKilo(){

        return peso*4000;

    }

    public String verificarEntrega(){

        if (estadoEnvio == ("Enviado")){
            return "El estado del envío es: " + estadoEnvio + " \nFue enviado a la ciudad: " + ciudadDestino + " por el cliente con cedula: " + cedulaCliente + "\n Numero de guía: " + numeroGuia;
        }else{
            return "El estado del envío es: " + estadoEnvio;
        }
    }
}
