package classes;

public abstract class Animal {
    protected String nome;
    protected String cor;
    protected String especie;
    
    public Animal() {
    }

    public Animal(String nome, String cor, String especie) {
        this.nome = nome;
        this.cor = cor;
        this.especie = especie;
    }

    public abstract void movimentar();

    public abstract void fazerSom();

//abaixo disso aqui estão os getters e setters
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

    
    
}
