
import java.util.Arrays;
import java.util.Scanner;


public class nivel2 {

    //! QUESTÃO 1

    public static void questao1(Scanner scanner) {

        System.out.println("Questão 1: Troca de valores entre duas variáveis");

        System.out.print("Digite o valor de A: ");
        int A = scanner.nextInt();

        System.out.print("Digite o valor de B: ");
        int B = scanner.nextInt();

        System.out.println("\nValores antes da troca:");
        System.out.println("A = " + A);
        System.out.println("B = " + B);

        int var = A;
        A = B;
        B = var;

        System.out.println("\nValores após a troca:");
        System.out.println("A = " + A);
        System.out.println("B = " + B);
    }


    //! QUESTÃO 2

    public static void questao2(Scanner scanner) {

        System.out.println("Questão 2: Cálculo do módulo de um número");

        System.out.print("Digite um número inteiro: ");
        int x = scanner.nextInt();

        int modulo = (x >= 0) ? x : x * -1;

        System.out.println("O módulo do número " + x + " é: " + modulo);
    }



    //! QUESTÃO 3

    public static void questao3(Scanner scanner) {

        System.out.println("Questão 3: Ordenação crescente e decrescente");

        int[] numeros = new int[5];
        for (int i = 0; i < 5; i++) {
            System.out.print("Digite o " + (i + 1) + "º número inteiro: ");
            numeros[i] = scanner.nextInt();
        }

        Arrays.sort(numeros);

        System.out.println("\nNúmeros em ordem crescente:");
        for (int num : numeros) {
            System.out.print(num + " ");
        }

        System.out.println("\nNúmeros em ordem decrescente:");
        for (int i = numeros.length - 1; i >= 0; i--) {
            System.out.print(numeros[i] + " ");
        }
        System.out.println();
    }

    //! QUESTÕES 4 

   
        public static void questao4(Scanner scanner) {

        System.out.println("Questão 4: Diferença do maior para o menor");

        System.out.print("Digite o primeiro número: ");
        int num1 = scanner.nextInt();

        System.out.print("Digite o segundo número: ");
        int num2 = scanner.nextInt();

        int diferenca;
        if (num1 > num2) {
        diferenca = num1 - num2;
        } else {
        diferenca = num2 - num1;
    }

        System.out.println("A diferença do maior para o menor é: " + diferenca);
}

    //! QUESTÃO 5

        
        public static void questao5(Scanner scanner) {

        System.out.println("Questão 5: Média com recuperação");

        double soma = 0;
    for (int i = 1; i <= 4; i++) {

        System.out.print("Digite a " + i + "ª nota: ");
        soma += scanner.nextDouble();
    }

        double media = soma / 4.0;
        System.out.println("Média inicial: " + media);

    if (media >= 7.0) {
        System.out.println("Aluno aprovado!");
    } else {
        System.out.print("Digite a nota de recuperação: ");
        double notaRec = scanner.nextDouble();

        double novaMedia = (media + notaRec) / 2.0;
        System.out.println("Nova média: " + novaMedia);

    if (novaMedia >= 7.0) {
            System.out.println("Aluno aprovado na recuperação!");
    } else {
            System.out.println("Aluno reprovado!");
        }
    }
}

    //! QUESTÃO 6

   public static void questao6(Scanner scanner) {

    System.out.println("Questão 9: Maior e menor número");

    System.out.print("Digite o primeiro número: ");
    int num1 = scanner.nextInt();

    System.out.print("Digite o segundo número: ");
    int num2 = scanner.nextInt();

    if (num1 > num2) {
        System.out.println("Maior número: " + num1);
        System.out.println("Menor número: " + num2);
    } else if (num2 > num1) {
        System.out.println("Maior número: " + num2);
        System.out.println("Menor número: " + num1);
    } else {
        System.out.println("Os dois números são iguais: " + num1);
    }
}

    //! QUESTÃO 7

    public static void questao7(Scanner scanner) {

    System.out.println("Questão 7: Verificação de valor entre 0 e 9");

    try {

        System.out.print("Digite um número inteiro: ");
        int numero = scanner.nextInt();

        if (numero >= 0 && numero <= 9) {
            System.out.println("Valor válido");
        } else {
            System.out.println("Valor inválido");
        }
    } catch (Exception e) {
        System.out.println("Erro: entrada inválida");
        scanner.nextLine(); 
}

} 

    //! QUESTÃO 8

    public static void questao8(Scanner scanner) {
        
    System.out.println("Questão 8: Código por extenso");

    System.out.print("Digite um código (1, 2 ou 3): ");
    int codigo = scanner.nextInt();

    switch (codigo) {

        case 1 -> System.out.println("Um");
        case 2 -> System.out.println("Dois");
        case 3 -> System.out.println("Três");
        default -> System.out.println("Código inválido");
    }
}



    //! QUESTÃO 9

    public static void questao9(Scanner scanner) {

    System.out.println("Questão 9: Tipo de triângulo");

    System.out.print("Digite o lado A: ");
    double A = scanner.nextDouble();

    System.out.print("Digite o lado B: ");
    double B = scanner.nextDouble();

    System.out.print("Digite o lado C: ");
    double C = scanner.nextDouble();

    // Verifica se é triângulo
    if (A < B + C && B < A + C && C < A + B) {
        if (A == B && B == C) {
            System.out.println("Triângulo equilátero");
        } else if (A == B || A == C || B == C) {
            System.out.println("Triângulo isósceles");
        } else {
            System.out.println("Triângulo escaleno");
        }
    } else {
        System.out.println("Não forma um triângulo");
    }
}
 
    //!QUESTÃO 10

    public static void questao10(Scanner scanner) {
    System.out.println("Questão 10: Operações com maior e menor valor");

    int[] numeros = new int[3];

    for (int i = 0; i < 3; i++) {
        do {
            System.out.print("Digite um número inteiro maior que zero para a variável " + (i+1) + ": ");
            numeros[i] = scanner.nextInt();
            if (numeros[i] <= 0) {
                System.out.println("Valor inválido! Tente novamente.");
            }
        } while (numeros[i] <= 0);
    }

    int menor = Math.min(numeros[0], Math.min(numeros[1], numeros[2]));
    int maior = Math.max(numeros[0], Math.max(numeros[1], numeros[2]));

    System.out.println("Menor * Maior = " + (menor * maior));
    System.out.println("Maior / Menor = " + ((double)maior / menor));
}


    //! QUESTÃO 11

    public static void questao11(Scanner scanner) {

    System.out.println("Questão 11: Número positivo ou negativo");

    System.out.print("Digite um número inteiro: ");
    int numero = scanner.nextInt();

    if (numero > 0) {
        System.out.println("O número é positivo.");
    } else if (numero < 0) {
        System.out.println("O número é negativo.");
    } else {
        System.out.println("O número é zero.");
    }
}


    //! QUESTÃO 12

    public static void questao12(Scanner scanner) {
    System.out.println("Questão 12: Armazenar positivo em A e negativo em B");

    int A = 0;
    int B = 0;

    System.out.print("Digite um número inteiro: ");
    int numero = scanner.nextInt();

    if (numero > 0) {
        A = numero;
    } else if (numero < 0) {
        B = numero;
    }

    System.out.println("A = " + A + ", B = " + B);
}

    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.println("Escolha a questão para executar (De 1 a 12):");
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
                case 11 -> questao11(scanner);
                case 12 -> questao12(scanner);
                default -> System.out.println("Opção inválida!");
            }
        }
    }
}
