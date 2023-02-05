package Ejercicio10;

public class SalarioSemanal {
    public String nombre;
    public int numeroHoras;
    public int pagoHoras;


    public void setNombre(String next){
        this.nombre = next;
    }
    public void setHoras(int next){
        this.numeroHoras = next;
    }
    public void ValorHoras(){
        if (numeroHoras < 10){
            pagoHoras = 30000;
        }else {
            pagoHoras = 33000;
        }
    }

    public int salarioTotal(){
        return (pagoHoras * numeroHoras);
    }
}
