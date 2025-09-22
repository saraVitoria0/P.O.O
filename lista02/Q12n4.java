import java.util.Scanner;



public class Q12n4{
    public void run(Scanner sc){

        while (true) {
            System.out.println("Digite o índice de poluição (0.0 para encerrar): ");
            double indice = sc.nextDouble();
            
            
            if (indice == 0.0){
                System.out.println("Encerrando programa...");
                break;
            }

            if (indice >= 0.05 && indice <= 0.25){
                System.out.println("Índice aceitável. Nenhuma indústria precisa parar.");

            }else if (indice >= 0.3 && indice < 0.4) {
                System.out.println("Atenção! Industrias do 1° grupo devem suspender as atividades.");
                
            }else if (indice >= 0.4 && indice < 0.5){
                System.out.println("Atenção! Indúdtrias do 1° e 2° grupos devem suspender as atividades. ");

            }else if (indice >= 0.5){
                System.out.println("Crítico! Todos os grupos devem suspenter as ativiades!");
                
            }else{
                System.out.println("Valor inválido! Digite um índice positivo.");
            }

            System.out.println("Deseja encerrar o programa? (S/N): ");
            char resposta = sc.next().toUpperCase().charAt(0);

            if (resposta == 'S'){
                System.out.println("Encerrando programa...");
                break;
            }
            
        }
    }


}