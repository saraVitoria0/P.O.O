package POO;

import java.util.Scanner;

public class nivel1 {

    //! QUESTÃO 1

    public static void questao1(Scanner scanner){

        System.out.println("Questão 1: Calcular o estoque médio de uma peça");
        System.out.print("Digite a quantidade mínima: ");
        double quantidadeMinima = scanner.nextDouble();

        System.out.print("Digite a quantidade máxima: ");
        double quantidadeMaxima = scanner.nextDouble();

        double estoqueMedio = (quantidadeMinima + quantidadeMaxima) / 2;
        System.out.println("O estoque médio é: " + estoqueMedio);
    }


    //! QUESTÃO 2

    public static void questao2(Scanner scanner){


{   
    System.out.println("Questão 2: Conversão de Dólar para Real");

    
    System.out.print("Digite a cotação do dólar (R$): ");
    double cotacao = scanner.nextDouble();

    
    System.out.print("Digite o valor em dólares: ");
    double valorDolar = scanner.nextDouble();

  
    double valorReal = valorDolar * cotacao;

    
    System.out.printf("O valor de %.2f dólares é equivalente a R$ %.2f%n", valorDolar, valorReal);
}

    }

    //! QUESTÃO 3

    
    public static void questao3(Scanner scanner) {
    System.out.println("Questão 3: Pagamento de comissão de vendedores");

    System.out.print("Digite a identificação do vendedor: ");
    String idVendedor = scanner.next();

    System.out.print("Digite o código da peça: ");
    String codigoPeca = scanner.next();

    System.out.print("Digite o preço unitário da peça: ");
    double precoUnitario = scanner.nextDouble();

    System.out.print("Digite a quantidade vendida: ");
    int quantidadeVendida = scanner.nextInt();

    
    double totalVenda = precoUnitario * quantidadeVendida;

   
    double comissao = totalVenda * 0.05;

   
    System.out.println("\n--- Resumo da Venda ---");
    System.out.println("Vendedor: " + idVendedor);
    System.out.println("Código da peça: " + codigoPeca);
    System.out.println("Quantidade vendida: " + quantidadeVendida);
    System.out.printf("Total da venda: R$ %.2f%n", totalVenda);
    System.out.printf("Comissão (5%%): R$ %.2f%n", comissao);

}

    //! QUESTÃO 4

    public static void questao4(Scanner scanner) {

    System.out.println("Questão 4: Operações dois a dois usando propriedade distributiva");

   
    System.out.print("Digite o valor de A: ");
    int A = scanner.nextInt();

    System.out.print("Digite o valor de B: ");
    int B = scanner.nextInt();

    System.out.print("Digite o valor de C: ");
    int C = scanner.nextInt();

    System.out.print("Digite o valor de D: ");
    int D = scanner.nextInt();

   
    System.out.println("\n--- Somas dois a dois ---");
    System.out.println("A + B = " + (A + B));
    System.out.println("A + C = " + (A + C));
    System.out.println("A + D = " + (A + D));
    System.out.println("B + C = " + (B + C));
    System.out.println("B + D = " + (B + D));
    System.out.println("C + D = " + (C + D));

   
    System.out.println("\n--- Multiplicações dois a dois ---");
    System.out.println("A * B = " + (A * B));
    System.out.println("A * C = " + (A * C));
    System.out.println("A * D = " + (A * D));
    System.out.println("B * C = " + (B * C));
    System.out.println("B * D = " + (B * D));
    System.out.println("C * D = " + (C * D));
}

    //! QUESTÃO 5

    public static void questao5(Scanner scanner) {
    System.out.println("Questão 5: Cálculo de litros de combustível usados em viagem");

    System.out.print("Digite o tempo gasto na viagem (em horas): ");
    double tempo = scanner.nextDouble();


    System.out.print("Digite a velocidade média (Km/h): ");
    double velocidade = scanner.nextDouble();

    
    double distancia = tempo * velocidade;

    
    double litrosUsados = distancia / 12.0;

   
    System.out.println("\n--- Resultado da Viagem ---");
    System.out.printf("Velocidade média: %.2f km/h%n", velocidade);
    System.out.printf("Tempo gasto: %.2f horas%n", tempo);
    System.out.printf("Distância percorrida: %.2f km%n", distancia);
    System.out.printf("Quantidade de litros utilizados: %.2f litros%n", litrosUsados);
}


    //! QUESTÃO 6

    public static void questao6(Scanner scanner) {
    System.out.println("Questão 6: Conversão de Celsius para Fahrenheit");

    
    System.out.print("Digite a temperatura em graus Celsius: ");
    double celsius = scanner.nextDouble();

    
    double fahrenheit = (9 * celsius + 160) / 5;

   
    System.out.printf("%.2f °C correspondem a %.2f °F%n", celsius, fahrenheit);
}


    //! QUESTÃO 7


    public static void questao7(Scanner scanner) {
    System.out.println("Etapa 1 - Questão 7: Conversão de Fahrenheit para Celsius");

  
    System.out.print("Digite a temperatura em graus Fahrenheit: ");
    double fahrenheit = scanner.nextDouble();

  
    double celsius = (fahrenheit - 32) * 5 / 9;

   
    System.out.printf("%.2f °F correspondem a %.2f °C%n", fahrenheit, celsius);
}


    //! QUESTÃO 8

    public static void questao8(Scanner scanner) {
    System.out.println("Questão 8: Cálculo do volume de uma lata de óleo");

    
    System.out.print("Digite o raio da lata (R): ");
    double raio = scanner.nextDouble();

    System.out.print("Digite a altura da lata (A): ");
    double altura = scanner.nextDouble();

    
    double volume = 3.14159 * raio * raio * altura;

    
    System.out.printf("O volume da lata é: %.2f unidades cúbicas%n", volume);
}


    //! QUESTÃO 9

    public static void questao9(Scanner scanner) {
    System.out.println("Questão 9: Conversão de idade para dias");

    
    System.out.print("Digite a idade em anos: ");
    int anos = scanner.nextInt();

    System.out.print("Digite a idade em meses: ");
    int meses = scanner.nextInt();

    System.out.print("Digite a idade em dias: ");
    int dias = scanner.nextInt();

   
    int idadeEmDias = anos * 365 + meses * 30 + dias;

   
    System.out.println("A idade total em dias é: " + idadeEmDias + " dias");
}


    //! QUESTÃO 10


    public static void questao10(Scanner scanner) {
    System.out.println("Questão 10: Relacionamentos de ordem entre dois números");

    
    System.out.print("Digite o primeiro número: ");
    int num1 = scanner.nextInt();

    System.out.print("Digite o segundo número: ");
    int num2 = scanner.nextInt();


    if (num1 == num2) {
        System.out.println("Os números são iguais.");
    } else {
        System.out.println("Os números não são iguais.");
    }

    if (num1 > num2) {
        System.out.println(num1 + " é maior que " + num2);
    }
    if (num1 < num2) {
        System.out.println(num1 + " é menor que " + num2);
    }
    if (num1 >= num2) {
        System.out.println(num1 + " é maior ou igual a " + num2);
    }
    if (num1 <= num2) {
        System.out.println(num1 + " é menor ou igual a " + num2);
    }
}



    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {

            System.out.println("Escolha a questão para executar ( De 1 a 10):");
           

            System.out.print("Opção: ");
            
            int opcao = scanner.nextInt();

            switch (opcao) {
                case 1 -> questao1(scanner);
                case 2 -> questao2(scanner);
                case 3 -> questao3(scanner);
                case 4 -> questao4(scanner);
                case 5 -> questao5(scanner);
                case 6 -> questao6(scanner);
                case 7 -> questao7(scanner);
                case 8 -> questao8(scanner);
                case 9 -> questao9(scanner);
                case 10 -> questao10(scanner);

                default -> System.out.println("Opção inválida!");
        }
    }
    }
}