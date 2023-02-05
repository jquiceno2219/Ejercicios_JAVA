package Ejercicio19;

public class Fotocopia {
    public int cantidadCopias;
    public int precio;
    public int precioFinal;

    public void setCantidad(int next){
        this.cantidadCopias = next;
    }

    public void precioOperacion(){
        if(cantidadCopias <= 499){
            precio = 120;
        } else if ((cantidadCopias >= 500) && (cantidadCopias <= 749)) {
            precio = 100;
        } else if ((cantidadCopias >= 750)&&(cantidadCopias <= 999)){
            precio = 80;
        }else{
            precio = 50;
        }
    }

    public void precioTotal(){
        precioFinal = precio * cantidadCopias;
    }
    public String result(){
        return "El precio por copia es de: " + precio + "\nEl precio total por las impresiones es de: " + precioFinal;
    }
}
