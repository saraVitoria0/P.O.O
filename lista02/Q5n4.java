import java.util.Scanner;

public class Q5n4 {
    public void run(Scanner sc){
        System.out.println("Digite um número para ver a tabuada: ");
        int numero = sc.nextInt();


        System.out.println("Tabuada do " + numero + ":");
        for (int i = 1; i <= 10; i++){
            System.out.println(numero + " x " + i + " = " + (numero * i));
        }

    }
    
}
