package subclasses;

import classes.Mamiferos;

public class Gato extends Mamiferos{

    public Gato(String nome) {
        super(nome);
        
    }

    @Override
    public void comer() {
        System.out.println(this.getNome() + " está comendo");
    }

    @Override
    public void movimentar() {
        System.out.println(this.getNome() + " está andando");
    }

    @Override
    public void fazerBarulho() {
        System.out.println("MIAU! MIAU! MIAU!");
    }
    
}
