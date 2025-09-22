import java.util.Scanner;

public class Q5n5 {
    public void run(Scanner sc){

        System.out.println("Digite o tamanho dos vetores (máximo 50): ");
        int n = sc.nextInt();

        if (n <= 0 || n > 50){
            System.out.println("Tamanho inválido! Use um valor entre 1 e 50.");
            return;
        }

        int[] v1 = new int[n];
        int[] v2 = new int[n];

        System.out.println("Digite os elementos do vetor V1:");
        for (int i = 0; i < n; i++) {
            System.out.print("V1[" + i + "]: ");
            v1[i] = sc.nextInt();

        }

        System.out.println("Digite os elementos do vetor V2:");
        for (int i = 0; i < n; i++) {
            System.out.print("V2[" + i + "]: ");
            v2[i] = sc.nextInt();
            
        }

        int iguais = 0;
        for (int i = 0; i < n; i++){
            if (v1[i] == v2[i]){
                iguais++;
            }
        }

        System.out.println("/nQuantidade de valores idênticos nas mesmas posições: " + iguais);

    }
    
    }
