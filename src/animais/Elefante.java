package animais;

import interfaces.InterfaceAnimal;
import interfaces.ClasseAnimal;

public class Elefante extends ClasseAnimal implements InterfaceAnimal {
    public Elefante(String nome, String especie, String cor, String comida) {
        super(nome, especie, cor, comida);
    }

    @Override
    public void comer() {
        System.out.println("Elefante comendo " + getComida());
    }

    @Override
    public void fazerSom() {
        System.out.println("Som de elefante");
    }

    @Override
    public String toString() {
        return "Elefante: " + " Nome: " + getNome() + "| Espécie: " + getEspecie();
    }


}
