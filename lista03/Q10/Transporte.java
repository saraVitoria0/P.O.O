public class Transporte {
    protected int capacidadePassageiros;
    protected double velocidadeMaxima;
    protected double consumo; // km por litro
    protected double preco;

    public Transporte(int capacidadePassageiros, double velocidadeMaxima, double consumo, double preco) {
        this.capacidadePassageiros = capacidadePassageiros;
        this.velocidadeMaxima = velocidadeMaxima;
        this.consumo = consumo;
        this.preco = preco;
    }

    public double calcularCustoViagem(double distancia) {
        return (distancia / consumo) * 5.50;
    }

    public void exibirDados() {
        System.out.println("Capacidade: " + capacidadePassageiros + " passageiros");
        System.out.println("Velocidade Máx.: " + velocidadeMaxima + " km/h");
        System.out.println("Consumo: " + consumo + " km/l");
        System.out.println("Preço do veículo: R$ " + preco);
    }
}


