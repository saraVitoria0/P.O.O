import java.util.Scanner;

public class Q4n5 {
    public void run(Scanner sc){

        String[] nomes = new String[20];
        int[] idades = new int[20];

        System.out.println("Digite o nome e a idade das cantidatas: ");
        
        for (int i = 0; i < 20; i++){
            System.out.println("Nome da candidatas " + (i + 1) + ": ");
            nomes[i] = sc.nextLine();

            System.out.println("Idade da candidata " + (i + 1) + ": ");
            idades[i] = sc.nextInt();
            sc.nextLine();

        }

        System.out.println("\nCandidatas aptas (idade entre 18 e 20 anos):");
        boolean encontrou = false;
        for (int i = 0; i < 20; i++){
            if (idades[i] >= 18 && idades[i] <= 20){
                System.out.println(nomes[i]);
                encontrou = true;
            }
        }

        if (!encontrou){
            System.out.println("Nenhum candidata está na faixa de idade exigida.");
        }
    }
}
