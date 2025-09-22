import java.util.Scanner;


public class Q4n6 {

    public boolean Equilatero(int a, int b, int c) {
        return (a == b && b == c);
    }

    
    public boolean Isosceles(int a, int b, int c) {
        return (a == b || a == c || b == c) && !Equilatero(a, b, c);
    }

    
    public boolean isEscaleno(int a, int b, int c) {
        return (a != b && a != c && b != c);
    }

    
    public void run(Scanner sc) {
        System.out.print("Digite o lado A: ");
        int a = sc.nextInt();
        System.out.print("Digite o lado B: ");
        int b = sc.nextInt();
        System.out.print("Digite o lado C: ");
        int c = sc.nextInt();

       
        if ((a + b > c) && (a + c > b) && (b + c > a)) {
            if (Equilatero(a, b, c)) {
                System.out.println("O triângulo é EQUILÁTERO.");
            } else if (Isosceles(a, b, c)) {
                System.out.println("O triângulo é ISÓSCELES.");
            } else if (isEscaleno(a, b, c)) {
                System.out.println("O triângulo é ESCALENO.");
            }
        } else {
            System.out.println("Os lados fornecidos não formam um triângulo válido.");
        }
    }
    
}
