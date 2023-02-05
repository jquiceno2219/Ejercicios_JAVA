package Ejercicio16;

public class Alcaldia {

    public String genero;
    public int edad;

    public void setGenero(String next){
        this.genero = next;
    }
    public void setEdad(int next){
        this.edad = next;
    }

    public String valorTotal(){
        if (genero.equals("mujer") && edad > 50){
            return "El apoyo es de 120000";
        } else if (genero.equals("mujer") && edad > 30 && edad < 50) {
            return "El apoyo es de 100000";
        } else if (genero.equals("hombre")) {
            return "El apoyo es de 40000";
        }else {
            return null;
        }
    }

}
