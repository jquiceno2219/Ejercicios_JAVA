package Ejercicio12;

public class AlquilerLavadoras {

    public int tipoLavadora;
    public int cantidad;
    public int horas;
    public int precio;

    public void setTipo(int next) {
        this.tipoLavadora = next;
    }

    public void setCantidad(int next) {
        this.cantidad = next;
    }

    public void setHoras(int next) {
        this.horas = next;
    }

    public void valor() {
        if (tipoLavadora == 1) {
            precio = 4000;
        } else {
            precio = 3000;
        }
    }


    public int total(){
        if (cantidad >= 3){
            return (int) ((precio * horas)-(((precio * horas) * 0.03)));
        }else{
            return precio * horas;
        }
    }





}
