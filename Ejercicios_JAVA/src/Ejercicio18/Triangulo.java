package Ejercicio18;

public class Triangulo {
        public int numero1;
        public int numero2;
        public int numero3;

        public int x;

        public int suma() {
            return x = numero1 + numero2 + numero3;
        }

        public boolean trianguloVerificacion() {
            if (x == 180) {
                return true;
            } else {
                return false;
            }
        }
}
