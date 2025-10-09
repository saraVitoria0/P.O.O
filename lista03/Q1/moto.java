package lista03.q1;

public class Moto extends Veiculo {
    private int cilindrada;

    public Moto(String marca, String modelo, int ano, double preco, int cilindrada) {
        super(marca, modelo, ano, preco);
        this.cilindrada = cilindrada;
    }

    @Override
    public double calcularIpva() {
        return preco * 0.02; // 2% do preço
    }

    @Override
    public void exibirDetalhes() {
        super.exibirDetalhes();
        System.out.println("Cilindrada: " + cilindrada + " cc");
        System.out.println("-------------------------------");
    }
}
