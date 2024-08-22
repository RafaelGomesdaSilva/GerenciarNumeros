
package br.ulbra.gerarnumero;

import java.util.ArrayList;
import java.util.Scanner;



public class GerenciadorNumeros {
    public static void main(String[] args) {
        ArrayList<Integer> numeros = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("\nMenu de Opções:");
            System.out.println("1. Adicionar Número");
            System.out.println("2. Listar Números");
            System.out.println("3. Listar Pares");
            System.out.println("4. Listar Ímpares");
            

            System.out.print("Escolha uma opção (ou 0 para sair): ");
            int opcao = scanner.nextInt();

            switch (opcao) {
                case 1:
                    System.out.print("Digite um número inteiro: ");
                    int novoNumero = scanner.nextInt();
                    numeros.add(novoNumero);
                    break;
                case 2:
                    System.out.println("Números na lista: " + numeros);
                    break;
                case 3:
                    
                    break;
                case 4:
                    
                    break;
                    
                case 0:
                    System.out.println("Encerrando o programa.");
                    System.exit(0);
                default:
                    System.out.println("Opção inválida. Tente novamente.");
            }
        }
    }
}



