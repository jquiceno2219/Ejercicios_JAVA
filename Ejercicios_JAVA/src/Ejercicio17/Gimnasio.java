package Ejercicio17;

public class Gimnasio {
    public int tiempo;

    public void setTiempo(int next){
        this.tiempo = next;
    }

    public String mensaje(){
        switch (tiempo){
            case 15:
                return "15 días cuestan 18000.";
            case 30:
                return "30 días cuestan 35000.";
            case 3:
                return "3 meses cuestan 86000";
            default:
                return "Error.";
        }
    }

}
