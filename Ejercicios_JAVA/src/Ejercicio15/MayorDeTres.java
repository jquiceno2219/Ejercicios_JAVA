package Ejercicio15;

public class MayorDeTres {

    public int numero1;
    public int numero2;
    public int numero3;

    public void setNumero1(int next){
        this.numero1 = next;
    }
    public void setNumero2(int next){
        this.numero2 = next;
    }
    public void setNumero3(int next){
        this.numero3 = next;
    }

    public String verificacion(){
        if (numero1 > numero3 && numero1 > numero2){
            return numero1 + " es el mayor.";
        }else if (numero2 > numero1 && numero2 > numero3){
            return numero2 + " es el mayor.";
        }else if (numero3 > numero2 && numero3 > numero1) {
            return numero3 + " es el mayor.";
        }else{
            return null;
        }
    }

}
