import java.util.Scanner;

public class Q1n3 {
    public void run(Scanner sc) {  
        System.out.println("------CALCULADORA------");
        System.out.println("1 - Adição");
        System.out.println("2 - Subtração");
        System.out.println("3 - Multiplicação");
        System.out.println("4 - Divisão");
        System.out.println("5 - Sair");

        System.out.print("Escolha uma opção: ");
        int opcao = sc.nextInt();

        if(opcao == 5){
            System.out.println("Saindo...");
            return;

        }

        System.out.print("Digite o primeiro número: ");
        double n1 = sc.nextDouble();

        System.out.print("Digite o segundo número: ");
        double n2 = sc.nextDouble();

        double resultado;

        switch (opcao) {
            case 1 -> resultado = n1 + n2;
            case 2 -> resultado = n1 - n2;
            case 3 -> resultado = n1 * n2;
            case 4 -> {
                if (n2 != 0) {
                    resultado = n1 / n2;
                } else {
                    System.out.println("Erro: divisão por zero!");
                    return; // sai do método
                }
            }
            default -> {
                System.out.println("Opção inválida!");
                return;
            }
        }

        System.out.println("Resultado: " + resultado);
    }
}
