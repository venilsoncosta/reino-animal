package animais;

import interfaces.Animal;

public class Elefante implements Animal {
    private String nome;
    private String cor;
    private String especie;
    private String comida;

    public Elefante() {
    }

    public Elefante(String nome, String cor, String especie, String comida) {
        this.nome = nome;
        this.cor = cor;
        this.especie = especie;
        this.comida = comida;
    }

    @Override
    public void comer() {
        System.out.println("Elefante comendo " + getComida());
    }

    @Override
    public void fazerSom() {
        System.out.println("Som de elefante");
    }

    @Override
    public String toString() {
        return "Elefante: " + " Nome: " + getNome() + "| Espécie: " + getEspecie();
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public String getEspecie() {
        return especie;
    }

    public void setEspecie(String especie) {
        this.especie = especie;
    }

    public String getComida() {
        return comida;
    }

    public void setComida(String comida) {
        this.comida = comida;
    }
}
