import java.util.Scanner;

public class Q2n6 {

    public static String VERIFICA(int n){
        if (n % 2 == 0){
            return "PAR";
        }else{
            return "ÍMPAR";
        }
    }

    public void run(Scanner sc){
        System.out.println("Digite um número inteiro: ");
        int numero = sc.nextInt();

        String resultado = VERIFICA(numero);

        System.out.println("O número " + numero + "é: " + resultado);
    }
    
}
