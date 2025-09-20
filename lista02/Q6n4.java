import java.util.Scanner;

public class Q6n4 {
    public void run(Scanner sc){
        int numero;
        int somaPares = 0;
        int somaImpares = 0;

        System.out.println("Digite números positivos (um negativo para encerrar):");

        while (true) {
            numero = sc.nextInt();
            
            if (numero < 0){
                break;
            }

            if (numero % 2 == 0){
                System.out.println(numero + "é PAR");
                somaPares += numero;
            }else{
                System.out.println(numero + "é ÍMPAR");
                somaImpares += numero;
            }
            
        }

        System.out.println("/nSoma dos pares: " + somaPares);
        System.out.println("Soma dos ímpares: " + somaImpares);
    }
    
}
