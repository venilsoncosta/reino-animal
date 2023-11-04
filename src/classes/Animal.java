package classes;

import interfaces.InterfaceAnimal;

public abstract class Animal implements InterfaceAnimal{

    protected String nome;

    public Animal(String nome) {
        this.nome = nome;
    }

    @Override
    public abstract void comer();

    @Override
    public abstract void movimentar();

    @Override
    public abstract void fazerBarulho();

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
    
}
