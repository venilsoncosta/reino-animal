package interfaces;

public abstract class ClasseAnimal {
    protected String nome;
    protected String especie;
    protected String cor;
    protected String comida;

    public ClasseAnimal() {
    }

    public ClasseAnimal(String nome, String especie, String cor, String comida) {
        this.nome = nome;
        this.especie = especie;
        this.cor = cor;
        this.comida = comida;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEspecie() {
        return especie;
    }

    public void setEspecie(String especie) {
        this.especie = especie;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public String getComida() {
        return comida;
    }

    public void setComida(String comida) {
        this.comida = comida;
    }
}
