package Ejercicio7;

public class Main {
        public static void main(String[] args) {
    AreaRectangulo areaRectangulo = new AreaRectangulo();

    areaRectangulo.altura = 12;
    areaRectangulo.base = 20;
    System.out.println(areaRectangulo.validarDatos());
    System.out.println("El area del rectángulo es de: " + areaRectangulo.calcularArea() + "cm");
    }
}
