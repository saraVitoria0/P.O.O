public class cursoOnline extends curso {
    private String plataforma;

    public cursoOnline(String nome, int cargaHoraria, double preco, String nivel, String plataforma) {
        super(nome, cargaHoraria, preco, nivel);
        this.plataforma = plataforma;
    }

    @Override
    public double calcularDesconto() {
        return preco * 0.15;
    }
}

