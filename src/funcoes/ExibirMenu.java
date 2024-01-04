package funcoes;

public class ExibirMenu {
    public static void exibirMenu() {
        System.out.println("\nMenu:");
        System.out.println("1 - Adicionar um animal");
        System.out.println("2 - Remover um animal");
        System.out.println("3 - Listar animais cadastrados");
        System.out.println("4 - Sair");
        System.out.print("Escolha uma opção: ");
    }
}

//private static void adicionarCachorro() {
//    System.out.print("Digite o nome do Cachorro: ");
//    String nome = scanner.next();
//    System.out.print("Digite a cor do Cachorro: ");
//    String cor = scanner.next();
//    System.out.print("Digite a raça do Cachorro: ");
//    String raca = scanner.next();
//
//    Cachorro cachorro = new Cachorro(nome, cor, raca);
//    animais.add(cachorro);
//    System.out.println(nome + " foi adicionado à lista de animais.");
//}
//
//private static void removerAnimal() {
//    System.out.print("Digite o nome do animal que deseja remover: ");
//    String nome = scanner.next();
//    for (Animal animal : animais) {
//        if (animal.getNome().equalsIgnoreCase(nome)) {
//            animais.remove(animal);
//            System.out.println(nome + " foi removido da lista de animais.");
//            return;
//        }
//    }
//    System.out.println(nome + " não foi encontrado na lista.");
//}
//
//private static void listarAnimais() {
//    if (animais.isEmpty()) {
//        System.out.println("Nenhum animal cadastrado.");
//    } else {
//        System.out.println("Animais cadastrados:");
//        for (Animal animal : animais) {
//            System.out.println(animal.getNome() + " - " + animal.getEspecie());
//        }
//    }