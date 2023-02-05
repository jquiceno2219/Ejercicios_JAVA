package Ejercicio23;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        SandwichOrder sandwichOrder = new SandwichOrder();
        Scanner lector = new Scanner(System.in);

        System.out.println("¿Qué tamaño de sandwich desea?");
        sandwichOrder.setTamaño(lector.next());
        System.out.println("¿Desea añadir pavo?");
        sandwichOrder.setPavo(lector.next());
        System.out.println("¿Desea añadir Tocineta");
        sandwichOrder.setTocineta(lector.next());
        System.out.println("¿Desea queso?");
        sandwichOrder.setQueso(lector.next());
        System.out.println("¿Desea jalapeños?");
        sandwichOrder.setJalapeño(lector.next());

        sandwichOrder.prep();

        System.out.println(sandwichOrder.orderPrice());
    }
}
