import java.util.Scanner;


public class Q3n5 {
    public void run(Scanner sc){

        int[] numeros = new int[10];

        System.out.println("Digite 10 números inteiros positivos maiores que zero: ");
        for (int i = 0; i < 10; i++){
            System.out.println("Número " + (i + 1) + ": ");
            numeros[i] = sc.nextInt();
            while (numeros[i] <= 0){
                System.out.println("Valor inválido! Digite um número positivo: ");
                numeros [i] = sc.nextInt();

            }
        }

        System.out.println("\nDigite um número X (positivo e maior que zero): ");
        int x = sc.nextInt();
        while (x <= 0){
            System.out.println("Valor inválido! Digite um número positivo: ");
            x = sc.nextInt();
        }


        int maiores = 0, menores = 0, iguais = 0;

        for (int i = 0; i < 10; i++){
            if (numeros[i] > x){
                maiores++;
            }else if (numeros[i] < x) {
                menores++;
            }else{
                iguais++;
            }
        }

        System.out.println("/nQuantidade de números maiores que X: " + maiores);
        System.out.println("Quantidade de números menores que X: " + menores);
        System.out.println("Quantidade de números iguais a X: " + iguais);


     }


}
    


