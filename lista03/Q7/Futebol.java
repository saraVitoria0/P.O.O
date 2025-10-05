public class Futebol extends Esporte {
    private double tamanhoCampo;

    public Futebol(String nome, int numeroJogadores, int duracaoPartida, int popularidade, double tamanhoCampo) {
        super(nome, numeroJogadores, duracaoPartida, popularidade);
        this.tamanhoCampo = tamanhoCampo;
    }

    @Override
    public double calcularCustoEquipamento() {
        return 300.0;
    }
}

