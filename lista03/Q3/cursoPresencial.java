public class cursoPresencial extends curso {
    private String local;

    public cursoPresencial(String nome, int cargaHoraria, double preco, String nivel, String local) {
        super(nome, cargaHoraria, preco, nivel);
        this.local = local;
    }

    @Override
    public double calcularDesconto() {
        return preco * 0.05;
    }
}
