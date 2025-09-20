import java.util.Scanner;


public class Q2n1 {
    public void run(Scanner sc){
        System.out.println("Digite o primeiro número inteiro: ");
        int n1 = sc.nextInt();

        System.out.println("Digite o segundo número inteiro: ");
        int n2 = sc.nextInt();

        System.out.println("------OPÇÕES------");
        System.out.println("1 - Verificar se um número é múltiplo do outro");
        System.out.println("2 - Verificar se os dois números são pares");
        System.out.println("3 - Verificar se a média dos números é maior ou igual a 7");
        System.out.println("4 - Sair");

        System.out.println("Escolha uma opção: ");
        int opcao = sc.nextInt();

        switch (opcao) {
            case 1 ->{
                if (n1 % n2 == 0 || n2 % n1 == 0){
                    System.out.println("Um é múltiplo do outro.");
                }else{
                    System.out.println("Nenhum número é múltiplo do outro.");
                }

            }
            case 2 ->{
                if (n1 % 2 == 0 && n2 % 2 == 0){
                    System.out.println("Os dois números são pares.");
                }else{
                    System.out.println("Pelo menos um número é par.");
                }
            }
            case 3 ->{
                double media = (n1 + n2) / 2.0;
                if (media >= 7){
                    System.out.println("A média é " + media + "(maior ou igual a 7).");
                }else{
                    System.out.println("A média é " + media + "(menor que 7)");

                }
            }
            case 4 -> System.out.println("Saindo...");
            default -> System.out.println("Opção inválida");

            }
        }
            }
        

