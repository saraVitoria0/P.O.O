import java.util.Scanner;

public class Q9n4 {
    public void run(Scanner sc){
        int numero;
        int menor = Integer.MAX_VALUE;
        int maior = Integer.MIN_VALUE;


        System.out.println("Digite números positivos (ou um número negativo para encerrar): ");

        while (true) {
            numero = sc.nextInt();
            
            if (numero < 0){
                break;
            }

            if (numero < menor){
                menor = numero;
            }

            if (numero > maior){
                maior = numero;
            }
            
        }

        if (maior == Integer.MIN_VALUE){
            System.out.println("Nenhum número válido foi informado.");

        }else{
            System.out.println("n/Menor número: " + menor);
            System.out.println("Maior número: " + maior);
        }
    }
    
}
