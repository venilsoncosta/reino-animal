package programa;

import animais.Elefante;
import classes.Animal;

import java.util.ArrayList;
import java.util.List;

public class Zoologico {
    public static void main(String[] args) {
        List<Animal> zoo = new ArrayList<>();
        Elefante elefante001 = new Elefante("Dumbo", "marrom", "africano");
        zoo.add(elefante001);
        zoo.forEach(System.out::println);
    }
}
