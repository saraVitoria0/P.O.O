import java.util.Scanner;


public class Q7n4 {

    public void run(Scanner sc){
        System.out.println("Digite um número entre 1 e 9: ");
        int numero = sc.nextInt();


        if (numero <= 0 || numero >= 10){
            System.out.println("Número inválido! Deve ser maior que 0 e menor que 10.");
            return;

        }

        int contador = 0;
        int atual = numero;
        int soma = 0;

        while (contador < 20) {
            if (atual % 2 != 0){
                soma += atual * atual;
                contador++;

            } 
            atual ++;
            
        }
        System.out.println("A soma dos quadrados dos 20 primeiros números ímoares a partir de " + numero + " é: " + soma);

    }
    
}
