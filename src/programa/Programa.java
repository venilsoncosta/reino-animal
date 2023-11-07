package programa;

import mamiferos.Leao;
import mamiferos.Zebra;

public class Programa {
    public static void main(String[] args) {
        Zebra zebra1 = new Zebra("zebrinha", "preta e branca");
        zebra1.comer();
        System.out.println(zebra1.getPeso());

        Leao zeus = new Leao("zeus", "laranja");
        zeus.comer(zebra1);
        System.out.println(zeus.getPeso());
    }
}
