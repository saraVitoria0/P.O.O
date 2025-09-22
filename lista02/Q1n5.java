import java.util.Scanner;

public class Q1n5 {
    public void run(Scanner sc){

        System.out.println("Digite a quantidade de números que deseja armazenar: ");
        int n = sc.nextInt();

        int[] numeros = new int [n];

        for (int i = 0; i < n; i++){
            System.out.println("Digite o número " + (i + 1) + ": ");
            numeros[i] = sc.nextInt();
        }


        System.out.println("/nNúmeros em ordem inversa: ");
        for (int i = n - 1; i >= 0; i--){
            System.out.println(numeros[i]);
        }
        
    }
    
}
