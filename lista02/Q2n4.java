
import java.util.Scanner;


public class Q2n4 {

    public void run(Scanner sc){
        System.out.println("Digite a quantidade de números que deverá processar: ");
        int quant = sc.nextInt();

        for (int i = 1; i <= quant; i++){
            System.out.println("Digite o número " + i + ": ");
            int n = sc.nextInt();


            long fatorial = 1;
            for (int j = 1; j <= n; j++){
                fatorial *= j;
            }

            System.out.println(n + "! = " + fatorial);
        }



    }
    
}
