package classes;

import java.util.HashSet;

public class Zoologico {

    protected HashSet<Animal> animais;
    protected Integer quantidadeAnimais = 0;

    public Zoologico() {
        this.animais = new HashSet<>();
    }
    
    public Zoologico(HashSet<Animal> animais) {
        this.animais = animais;
    }
    

    public boolean contains(Animal animal) {
        return this.animais.contains(animal);
    }

    public void adicionarAnimal(Animal animal) {
        if (!this.animais.contains(animal)) {
            this.animais.add(animal);
            atualizarQuantidadeAnimais();
        }
    }    

    public void removerAnimais(Animal animal) {
        this.animais.remove(animal);
        atualizarQuantidadeAnimais();
    }

    public void exibirAnimais(){
        for(Animal animal : this.animais){
            System.out.println("Nome: " + animal.getNome());
            System.out.println("Cor: " + animal.getCor());
            System.out.println("Especie: " + animal.getEspecie());
            System.out.println("--------------------------------------");
        }
    }

    public void atualizarQuantidadeAnimais(){
        this.quantidadeAnimais = this.animais.size();
    }

    public HashSet<Animal> getAnimais() {
        return animais;
    }

    public Integer getQuantidadeAnimais() {
        return quantidadeAnimais;
    }
    
}
