import java.util.Scanner;


public class Q11n4 {
    public void run(Scanner sc){
         {
            int maior = Integer.MIN_VALUE;
            int menor = Integer.MAX_VALUE;
            int soma = 0;
            
            System.out.println("Digite 10 valores inteiros e positivos: ");
            
            for (int i = 1; i <= 10; i++){
                int valor = sc.nextInt();
                
                if (valor > maior){
                    maior = valor;
                }
                
                if (valor < menor){
                    menor = valor;
                }
                soma += valor;
            }
            
            double media = soma / 10.0;
            
            System.out.println("Maior valor: " + maior);
            System.out.println("Menor valor: " + menor);
            System.out.println("Média: " + media);
        }

    }
    
}
