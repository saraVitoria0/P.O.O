public class Basquete extends Esporte {
    private double alturaCesta;

    public Basquete(String nome, int numeroJogadores, int duracaoPartida, int popularidade, double alturaCesta) {
        super(nome, numeroJogadores, duracaoPartida, popularidade);
        this.alturaCesta = alturaCesta;
    }

    @Override
    public double calcularCustoEquipamento() {
        return 400.0;
    }
}
