import java.util.Scanner;


public class Q8n4 {
    public void run(Scanner sc){
        int matricula;
        double nota;
        double somaNotas = 0;
        int quantAluno = 0;

        System.out.println("Digite a matrícula do aluno (número negativo para encerrar): ");

        while (true) { 
            matricula = sc.nextInt();

            if (matricula < 0){
                break;

            }

            System.out.println("Digite a nota do aluno " + matricula + ": ");
            nota = sc.nextDouble();


            somaNotas += nota;
            quantAluno++;
            
        }

        if ( quantAluno > 0){
            double media = somaNotas / quantAluno;
            System.out.println("/nQuantidade de alunos: " + quantAluno);
            System.out.println("Média da turma: " + media);
        }else{
            System.out.println("Nenhum aluno informado.");
        }
    }



    
}
