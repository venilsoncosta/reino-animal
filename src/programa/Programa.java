package programa;


import classes.Animal;

import java.util.ArrayList;
import java.util.Scanner;

import static funcoes.ExibirMenu.exibirMenu;

public class Programa {
    public static void main(String[] args) {
        private static ArrayList<Animal> animais = new ArrayList<>();
        private static Scanner scanner = new Scanner(System.in);

            int opcao;

            do {
                exibirMenu();
                opcao = scanner.nextInt();

                switch (opcao) {
                    case 1:
                        adicionarCachorro();
                        break;
                    case 2:
                        removerAnimal();
                        break;
                    case 3:
                        listarAnimais();
                        break;
                    case 4:
                        System.out.println("Saindo do programa. Até mais!");
                        break;
                    default:
                        System.out.println("Opção inválida. Tente novamente.");
                }

            } while (opcao != 4);

            scanner.close();
    }
}

