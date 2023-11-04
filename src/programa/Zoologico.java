package programa;

import classes.Animal;
import subclasses.Cachorro;
import subclasses.Gato;

public class Zoologico {
    public static void main(String[] args) {
        Animal[] zoologico = new Animal[100];
        zoologico[0] = new Cachorro("Zeus");
        zoologico[1] = new Cachorro("Baby");
        zoologico[2] = new Gato("Rosinha");

        for(Animal animal: zoologico){
            System.out.println("Nome: " + animal.getNome());
            animal.comer();
            animal.fazerBarulho();
            animal.movimentar();
            System.out.println("--------------------------------");
        }

    }
}
