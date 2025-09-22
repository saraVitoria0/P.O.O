import java.util.Scanner;


public class Q7n5 {
    public void run(Scanner sc){

        System.out.println("Digite o 1° caractere (A-Z): ");
        char c1 = sc.next().toLowerCase().charAt(0);

        System.out.println("Digite o 2° caractere (A-Z): ");
        char c2 = sc.next().toLowerCase().charAt(0);


        if (c1 < 'a' || c1 > 'z' || c2 < 'a' || c2 > 'z'){
            System.out.println("Erro: os caracteres devem estar entre A e Z.");
            return;

        }

        if (c1 >= c2){
            System.out.println("Erro: os caracteres não estão em ordem alfabética.");
            return;
        }

        int quantidade = (c2 - c1) - 1;

        System.out.println("Resultado: " + c1 + " " + c2 + " | O número de caracteres entre eles é: " + quantidade);
    }
    
}
