public class Metro extends Transporte {
    private boolean eletrico;

    public Metro(int capacidadePassageiros, double velocidadeMaxima, double consumo, double preco, boolean eletrico) {
        super(capacidadePassageiros, velocidadeMaxima, consumo, preco);
        this.eletrico = eletrico;
    }

    @Override
    public double calcularCustoViagem(double distancia) {
        return super.calcularCustoViagem(distancia) * 0.70; // 30% de desconto
    }

    @Override
    public void exibirDados() {
        super.exibirDados();
        System.out.println("É elétrico? " + (eletrico ? "Sim" : "Não"));
    }
}
