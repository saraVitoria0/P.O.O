import java.util.Scanner;

public class Q3n6 {

    private int[] vetor;
    private int n;


     public void carregarVetor(Scanner sc) {
        System.out.print("Digite o tamanho do vetor: ");
        n = sc.nextInt();
        vetor = new int[n];

        for (int i = 0; i < n; i++) {
            System.out.print("Digite o elemento " + (i + 1) + ": ");
            vetor[i] = sc.nextInt();
        }
        System.out.println("Vetor carregado com sucesso!");
    }

    
    public void listarVetor() {
        if (vetor == null) {
            System.out.println("Vetor ainda não foi carregado!");
            return;
        }
        System.out.print("Vetor: ");
        for (int v : vetor) {
            System.out.print(v + " ");
        }
        System.out.println();
    }

    
    public void exibirPares() {
        if (vetor == null) {
            System.out.println("Vetor ainda não foi carregado!");
            return;
        }
        System.out.print("Números pares: ");
        for (int v : vetor) {
            if (v % 2 == 0) {
                System.out.print(v + " ");
            }
        }
        System.out.println();
    }

  
    public void exibirImpares() {
        if (vetor == null) {
            System.out.println("⚠ Vetor ainda não foi carregado!");
            return;
        }
        System.out.print("Números ímpares: ");
        for (int v : vetor) {
            if (v % 2 != 0) {
                System.out.print(v + " ");
            }
        }
        System.out.println();
    }

    
    public void paresEmPosicoesImpares() {
        if (vetor == null) {
            System.out.println("⚠ Vetor ainda não foi carregado!");
            return;
        }
        int count = 0;
        for (int i = 1; i < n; i += 2) { 
            if (vetor[i] % 2 == 0) {
                count++;
            }
        }
        System.out.println("Quantidade de pares nas posições ímpares: " + count);
    }


    public void imparesEmPosicoesPares() {
        if (vetor == null) {
            System.out.println("⚠ Vetor ainda não foi carregado!");
            return;
        }
        int count = 0;
        for (int i = 0; i < n; i += 2) { 
            if (vetor[i] % 2 != 0) {
                count++;
            }
        }
        System.out.println("Quantidade de ímpares nas posições pares: " + count);
    }

   
    public void run(Scanner sc) {
        int opcao;
        do {
            System.out.println("\n=== MENU ===");
            System.out.println("1 - Carregar Vetor");
            System.out.println("2 - Listar Vetor");
            System.out.println("3 - Exibir Pares");
            System.out.println("4 - Exibir Ímpares");
            System.out.println("5 - Pares em posições ímpares");
            System.out.println("6 - Ímpares em posições pares");
            System.out.println("0 - Sair");
            System.out.print("Escolha uma opção: ");
            opcao = sc.nextInt();

            switch (opcao) {
                case 1 -> carregarVetor(sc);
                case 2 -> listarVetor();
                case 3 -> exibirPares();
                case 4 -> exibirImpares();
                case 5 -> paresEmPosicoesImpares();
                case 6 -> imparesEmPosicoesPares();
                case 0 -> System.out.println("Saindo do programa...");
                default -> System.out.println("Opção inválida!");
            }
        } while (opcao != 0);
    }


    
}
