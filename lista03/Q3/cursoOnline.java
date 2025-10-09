package lista03.q3;

public class CursoOnline extends Curso {
    private String plataforma;

    public CursoOnline(String nome, int cargaHoraria, double preco, String nivel, String plataforma) {
        super(nome, cargaHoraria, preco, nivel);
        this.plataforma = plataforma;
    }

    @Override
    public double calcularDesconto() {
        return preco * 0.15;
    }

    @Override
    public void exibirInformacoes() {
        super.exibirInformacoes();
        System.out.println("Plataforma: " + plataforma);
    }
}
