public class caminhao extends veiculo {
    private final double capacidadeCarga;

    public caminhao(String marca, String modelo, int ano, double preco, double capacidadeCarga) {
        super(marca, modelo, ano, preco);
        this.capacidadeCarga = capacidadeCarga;
    }

    @Override
    public double calcularIpva() {
        return preco * 0.015;
    }

    @Override
    public void exibirDetalhes() {
        super.exibirDetalhes();
        System.out.println("Capacidade de carga: " + capacidadeCarga + " toneladas");
        System.out.println("-------------------------------");
    }
}

