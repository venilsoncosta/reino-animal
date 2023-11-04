package classes;

public class Cachorro extends Mamiferos{

    public Cachorro(String nome) {
        super(nome);
    }

    @Override
    public void comer() {
        System.out.println(this.getNome() + " está comendo");
    }

    @Override
    public void movimentar(){
        System.out.println(this.getNome() + " está se movimentando");
    }

    @Override
    public void fazerBarulho() {
        System.out.println("AU! AU! AU!");
    }

    
}
