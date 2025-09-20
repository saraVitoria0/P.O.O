import java.util.Scanner;

public class Q3n1 {

    public void run(Scanner sc){

        System.out.println("------PESO IDEAL------");
        System.out.println("1 - Calcular peso ideal");
        System.out.println("2 - Sair");
        System.out.println("Escolha uma opção: ");
        int opcao = sc.nextInt();


if (opcao == 2) {
            System.out.println("Saindo...");
            return;
        }

        if (opcao == 1) {
            double altura, pesoIdeal;
            char sexo;

            System.out.print("Digite a altura (em metros): ");
            altura = sc.nextDouble();

            System.out.print("Digite o sexo (M para homem / F para mulher): ");
            sexo = sc.next().toUpperCase().charAt(0);

            switch (sexo) {
                case 'M' -> {
                    pesoIdeal = (72.7 * altura) - 58;
                    System.out.printf("O peso ideal para homem é: %.2f kg%n", pesoIdeal);
                }
                case 'F' -> {
                    pesoIdeal = (62.1 * altura) - 44;
                    System.out.printf("O peso ideal para mulher é: %.2f kg%n", pesoIdeal);
                }
                default -> System.out.println("Sexo inválido!");
            }
        
        }
    }

}









       