package classes;

public abstract class Mamiferos extends Animal{
    public Mamiferos(String nome, String cor){
        super(nome, cor);
    }

    @Override
    public abstract void movimentar();

    @Override
    public abstract void fazerSom();
    
}
