package programa;

import classes.Zoologico;
import mamiferos.Leao;
import mamiferos.Zebra;

public class Programa {
    public static void main(String[] args) {
        Zebra zebra1 = new Zebra("zebrinha", "preta e branca", "Zebra");
        //zebra1.comer();
        System.out.println(zebra1.getPeso());

        Leao zeus = new Leao("zeus", "laranja", "Leão");
        //zeus.comer(zebra1);
        System.out.println(zeus.getPeso());
        System.out.println(zeus.getEspecie());

        Zoologico zoo = new Zoologico();
        zoo.adicionarAnimal(zeus);
        zoo.adicionarAnimal(zebra1);
        zoo.adicionarAnimal(zeus);
        zoo.adicionarAnimal(zeus);
        zoo.adicionarAnimal(zeus);
        zoo.adicionarAnimal(zeus);
        zoo.adicionarAnimal(zeus);

        zoo.exibirAnimais();
        System.out.println(zoo.getQuantidadeAnimais());


    }
}
