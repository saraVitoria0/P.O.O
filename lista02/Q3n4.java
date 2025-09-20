import java.util.Scanner;

public class Q3n4 {
    public void run(Scanner sc){
        System.out.println("Números ímpares entre 100 e 200:");


        for (int i = 100; i <= 200; i++){
            if (i % 2 != 0) {
                System.out.println(i);
            }
        }
    }
    
}
