package Ejercicio13;

public class ParOImpar {
    public int numero;

    public void setNumero(int next){
        this.numero = next;
    }

    public String verificacion(){
        if ((numero % 2) == 0){
            return "El número " + numero + " es par";
        }else{
            return "El número " + numero + " es inpar";
        }
    }
}
