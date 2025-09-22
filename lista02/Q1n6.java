import java.util.Scanner;

public class Q1n6 {

    public static double REAJUSTE(double salario, double indice){
        return salario + (salario * indice / 100);
    }

    public void run(Scanner sc){
        System.out.println("Digite o salário atual: ");
        double salario = sc.nextDouble();

        System.out.println("Digite o índice de reajuste (%): ");
        double indice = sc.nextDouble();

        double novoSalario = REAJUSTE(salario, indice);

        System.out.printf("O salário atualizado é: R$ %.2f%n", novoSalario);
    }
    
}
