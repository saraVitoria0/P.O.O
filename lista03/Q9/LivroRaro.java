package lista03.q9;

public class LivroRaro extends Livro {
    private boolean edicaoLimitada;

    public LivroRaro(String titulo, String autor, int anoPublicacao, double preco, boolean edicaoLimitada) {
        super(titulo, autor, anoPublicacao, preco);
        this.edicaoLimitada = edicaoLimitada;
    }

    @Override
    public double calcularMultaAtraso(int dias) {
        return dias * 5.0;
    }

    @Override
    public void exibirFichaCatalografica() {
        super.exibirFichaCatalografica();
        System.out.println("Edição Limitada: " + (edicaoLimitada ? "Sim" : "Não"));
    }
}
