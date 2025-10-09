package lista03.q1;

public class Caminhao extends Veiculo {
    private double capacidadeCarga;

    public Caminhao(String marca, String modelo, int ano, double preco, double capacidadeCarga) {
        super(marca, modelo, ano, preco);
        this.capacidadeCarga = capacidadeCarga;
    }

    @Override
    public double calcularIpva() {
        return preco * 0.015; // 1.5% do preço
    }

    @Override
    public void exibirDetalhes() {
        super.exibirDetalhes();
        System.out.println("Capacidade de carga: " + capacidadeCarga + " toneladas");
        System.out.println("-------------------------------");
    }
}
