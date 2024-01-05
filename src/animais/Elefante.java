package animais;

import classes.Animal;

public class Elefante extends Animal {
    public Elefante(String nome, String cor, String especie) {
        super(nome, cor, especie);
    }

    @Override
    public void comer() {
        System.out.println("Elefante comendo");
    }


}
