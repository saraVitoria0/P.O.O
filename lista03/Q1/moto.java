public class moto extends veiculo {
    private final int cilindrada;

    public moto(String marca, String modelo, int ano, double preco, int cilindrada) {
        super(marca, modelo, ano, preco);
        this.cilindrada = cilindrada;
    }

    @Override
    public double calcularIpva() {
        return preco * 0.02;
    }

    @Override
    public void exibirDetalhes() {
        super.exibirDetalhes();
        System.out.println("Cilindrada: " + cilindrada + " cc");
        System.out.println("-------------------------------");
    }
}
