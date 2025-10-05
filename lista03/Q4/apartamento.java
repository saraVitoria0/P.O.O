public class apartamento extends imovel {
    private final int andar;
    private final double valorCondominio;

    public apartamento(String endereco, double area, int numeroQuartos, double preco, int andar, double valorCondominio) {
        super(endereco, area, numeroQuartos, preco);
        this.andar = andar;
        this.valorCondominio = valorCondominio;
    }

    @Override
    public double calcularTaxaAdministracao() {
        return preco * 0.06;
    }

    @Override
    public void exibirCaracteristicas() {
        super.exibirCaracteristicas();
        System.out.println("Andar: " + andar);
        System.out.println("Condomínio: R$ " + valorCondominio);
        System.out.println("-------------------------------");
    }
}

