package Ejercicio11;

public class PosONeg {

    public int numero;

    public void setNumero(int next){
        this.numero = next;
    }

    public String resultado(){
        if (numero < 0){
            return "El numero " + numero + " es negativo";
        }else {
            return "El numero " + numero + " es positivo";
        }
    }


}
