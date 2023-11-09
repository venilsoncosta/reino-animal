package mamiferos;

import classes.Animal;

public class Leao extends Animal{

    private boolean comFome = true;
    private double peso = 300.0;

    public Leao(String nome, String cor, String especie) {
        super(nome, cor, especie);
    }

    public void comer(Zebra zebra){
        if(this.comFome){
            System.out.println(this.getNome() + " está comendo " + zebra.getNome());
            this.peso += (zebra.getPeso() / 10);
            this.comFome = false;
        }else{
            System.out.println(this.getNome() + " não está com fome");
        }
    }

    @Override
    public void movimentar() {
        System.out.println(this.getNome() + " está se movimentando.");
    }

    @Override
    public void fazerSom() {
        System.out.println(this.getNome() + " está rugindo");
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }
    
    
}
