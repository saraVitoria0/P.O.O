package lista03.q3;

public class Main {
    public static void main(String[] args) {
        CursoPresencial cp = new CursoPresencial("Java", 40, 800, "Intermediário", "Sala 101");
        cp.exibirInformacoes();

        System.out.println();

        CursoOnline co = new CursoOnline("Python", 60, 600, "Básico", "Udemy");
        co.exibirInformacoes();
    }
}
