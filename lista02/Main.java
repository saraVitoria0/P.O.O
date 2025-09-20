import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {

            Q1n1 q1n1 = new Q1n1();
            q1n1.run(sc);

            Q2n1 q2n1 = new Q2n1();
            q2n1.run(sc);

            Q3n1 q3n1 = new Q3n1();
            q3n1.run(sc);
        } 
       
    }
}
