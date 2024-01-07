package programa;

import animais.Elefante;
import interfaces.Animal;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Zoologico {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        List<Animal> zoo = new ArrayList<>();
        //Elefante elefante001 = new Elefante("Dumbo", "marrom", "africano", "mato");

        for(int i = 0; i < 3; i++){
            System.out.println("Digite o nome do animal: ");
            String nome = entrada.nextLine();
            System.out.println("Digite a cor do animal: ");
            String cor = entrada.nextLine();
            System.out.println("Digite a espécie do animal: ");
            String especie = entrada.nextLine();
            System.out.println("Digite a comida que esse animal come: ");
            String comida = entrada.nextLine();
            zoo.add(new Elefante(nome, cor, especie, comida));
        }
//        zoo.add(elefante001);
        zoo.forEach(System.out::println);
    }
}
