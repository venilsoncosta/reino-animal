package classes;

public abstract class Mamiferos extends ClasseAnimal{

    public Mamiferos(String nome) {
        super(nome);
    }

    @Override
    public abstract void comer();

    @Override
    public abstract void movimentar();

    @Override
    public abstract void fazerBarulho();
    
    
}
