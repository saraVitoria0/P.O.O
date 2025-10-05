public class main {
    public static void main(String[] args) {
        cursoPresencial cp = new cursoPresencial("Java", 40, 800, "Intermediário", "Sala 101");
        cp.exibirInformacoes();

        cursoOnline co = new cursoOnline("Python", 60, 600, "Básico", "Udemy");
        co.exibirInformacoes();
    }
}

