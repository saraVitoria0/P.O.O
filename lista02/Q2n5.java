import java.util.Scanner;

public class Q2n5 {
    public void run(Scanner sc){

        System.out.println("Digite a quantidade de elementos dos vetores: ");
        int n = sc.nextInt();

        int[] x = new int[n];
        int[] y = new int[n];

        System.out.println("/nDigite os elementos do vetor X: ");
        for (int i = 0; i < n; i++){
            System.out.println("X[" + i + "]: ");
            x[i] = sc.nextInt();
        }

        System.out.println("/nDigite os elementos do vetor Y: ");
        for (int i = 0; i < n; i++) {
            System.out.println("Y[" + i + "]: ");
            y[i] = sc.nextInt();
        }

        int produto = 0;
        for (int i = 0; i < n; i++){
            produto += x[i] * y[i];
        }

        System.out.println("/nO produto escalar dos vetores é: " + produto);


    }
    
}
