public class Main {
    public static void main(String[] args) {
        LivroDidatico ld = new LivroDidatico("Matemática Básica", "João Silva", 2018, 100, "Matemática");
        ld.exibirFichaCatalografica();
        System.out.println("Multa (3 dias atraso): R$ " + ld.calcularMultaAtraso(3));

        LivroRaro lr = new LivroRaro("Edição Antiga", "Autor X", 1900, 500, true);
        lr.exibirFichaCatalografica();
        System.out.println("Multa (3 dias atraso): R$ " + lr.calcularMultaAtraso(3));
    }
}

