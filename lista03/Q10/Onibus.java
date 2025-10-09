package lista03.q10;

public class Onibus extends Transporte {
    private int numeroEixos;

    public Onibus(int capacidadePassageiros, double velocidadeMaxima, double consumo, double preco, int numeroEixos) {
        super(capacidadePassageiros, velocidadeMaxima, consumo, preco);
        this.numeroEixos = numeroEixos;
    }

    @Override
    public double calcularCustoViagem(double distancia) {
        return super.calcularCustoViagem(distancia) * 0.80; // 20% de desconto
    }

    @Override
    public void exibirDados() {
        super.exibirDados();
        System.out.println("Número de eixos: " + numeroEixos);
    }
}
