package mamiferos;

import classes.Mamiferos;

public class Leao extends Mamiferos{

    public Leao(String nome, String cor) {
        super(nome, cor);
    }

    public void comer(Zebra zebra){
        System.out.println(this.getNome() + " está comendo " + zebra.getNome());
    }

    @Override
    public void movimentar() {
        System.out.println(this.getNome() + " está se movimentando.");
    }

    @Override
    public void fazerSom() {
        System.out.println(this.getNome() + " está rugindo");
    }
    
}
