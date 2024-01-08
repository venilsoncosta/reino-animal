package animais;

import interfaces.ClasseAnimal;
import interfaces.InterfaceAnimal;

public class Zebra extends ClasseAnimal implements InterfaceAnimal {
    @Override
    public void comer() {
        System.out.println("A zebra está comendo");
    }

    @Override
    public void fazerSom() {
        System.out.println("Zebra fazendo barulho");
    }
}
