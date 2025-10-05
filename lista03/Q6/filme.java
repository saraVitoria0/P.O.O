public class filme extends midia {
    private String diretor;
    private String genero;

    public filme(String titulo, int anoLancamento, int duracao, double preco, String diretor, String genero) {
        super(titulo, anoLancamento, duracao, preco);
        this.diretor = diretor;
        this.genero = genero;
    }

    @Override
    public double calcularPrecoAluguel() {
        return preco * 0.15;
    }

    @Override
    public void exibirInfo() {
        super.exibirInfo();
        System.out.println("Diretor: " + diretor);
        System.out.println("Gênero: " + genero);
        System.out.println("-------------------------------");
    }
}

