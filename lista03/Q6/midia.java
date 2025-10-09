package lista03.q6;

public class Midia {
    protected String titulo;
    protected int anoLancamento;
    protected int duracao;
    protected double preco;

    public Midia(String titulo, int anoLancamento, int duracao, double preco) {
        this.titulo = titulo;
        this.anoLancamento = anoLancamento;
        this.duracao = duracao;
        this.preco = preco;
    }

    public double calcularPrecoAluguel() {
        return preco * 0.10;
    }

    public void exibirInfo() {
        System.out.println("Título: " + titulo);
        System.out.println("Ano: " + anoLancamento);
        System.out.println("Duração: " + duracao + " min");
        System.out.println("Preço: R$ " + preco);
        System.out.println("Aluguel: R$ " + calcularPrecoAluguel());
    }
}
