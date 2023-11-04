package programa;

import subclasses.Cachorro;

public class Principal {
    public static void main(String[] args) {
        Cachorro cachorro = new Cachorro("Zeus");
        cachorro.comer();
        cachorro.fazerBarulho();
        cachorro.movimentar();
        Cachorro segundo = new Cachorro("Baby");
        segundo.comer();
        segundo.fazerBarulho();
        segundo.movimentar();
    }
}
