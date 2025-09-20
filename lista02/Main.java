import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {

            Q1n3 q1n3 = new Q1n3();
            q1n3.run(sc);

            Q2n3 q2n3 = new Q2n3();
            q2n3.run(sc);

            Q3n3 q3n3 = new Q3n3();
            q3n3.run(sc);

            Q1n4 q1n4 = new Q1n4();
            q1n4.run();

            Q2n4 q2n4 = new Q2n4();
            q2n4.run(sc);

            Q3n4 q3n4 = new Q3n4();
            q3n4.run(sc);

            Q4n4 q4n4 = new Q4n4();
            q4n4.run(sc);

            Q5n4 q5n4 = new Q5n4();
            q5n4.run(sc);
        } 
       
    }
}
