import java.util.Random;
import java.util.Scanner;
public class Q6n5 {
    public void run(Scanner sc){
        
        Random random = new Random();

        int numeroSorteado = random.nextInt(101);
        int tentativa;
        int tentativas = 0;


        System.out.println("Tente adivinhar o número sorteado entre 0 e 100!");

        do { 
            System.out.println("Digite sua tentativa: ");
            tentativa = sc.nextInt();
            tentativa++;

            if (tentativa < numeroSorteado){
                System.out.println("Onúmero sorteado é MAIOR que " + tentativa);            
            }else if (tentativa > numeroSorteado) {
                System.out.println("O número sorteado é MENOR que: " + tentativa);
            }else{
                System.out.println("/nParabéns! Você acertou!");
                System.out.println("Número sorteado: " + numeroSorteado);
                System.out.println("Total de tentativas: " + tentativas);
            }
        } while (tentativa != numeroSorteado);
        

    }
    
}
