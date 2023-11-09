package mamiferos;

import java.util.Scanner;

import classes.Animal;

public class Zebra extends Animal{

    private Double peso = 300.0;

    public Zebra(String nome, String cor, String especie) {
        super(nome, cor, especie);
    }

    public void comer() {
        System.out.println("Quanto de grama a zebra comeu?");
        Scanner entrada = new Scanner(System.in);
        double grama = entrada.nextDouble();
        
        while (grama <= 0) {
            System.out.println("Entre com um peso válido:");
            grama = entrada.nextDouble();
        }
        
        this.peso += grama; // Atualiza o peso dentro do loop
        System.out.println(this.getNome() + " comeu " + grama + " de grama e engordou");
    }
    

    @Override
    public void movimentar() {
        System.out.println(this.getNome() + " está se movimentando");
    }

    @Override
    public void fazerSom() {
        System.out.println(this.getNome() + " está emitindo som");
    }

    public Double getPeso() {
        return peso;
    }

    public void setPeso(Double peso) {
        this.peso = peso;
    }
    
}
