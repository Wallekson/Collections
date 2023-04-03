package one.digitalinnovation;

import java.util.LinkedList;

public class ExercicioLinkedList {

    public static void main(String[] args) {

        System.out.println("Exiba uma lista e adicione 7 notas:");

        LinkedList<Double> notas = new LinkedList<>();
        notas.add(7.0);
        notas.add(8.5);
        notas.add(9.3);
        notas.add(5.0);
        notas.add(7.0);
        notas.add(0.0);
        notas.add(3.6);
        System.out.println(notas);

        System.out.println(notas.get(0));
        System.out.println(notas);

        System.out.println(notas.remove(0));
        System.out.println(notas);

    }
}
