package lista03.q1;

public class Main {
    public static void main(String[] args) {
        Veiculo carro = new Veiculo("Toyota", "Corolla", 2022, 120000);
        carro.exibirDetalhes();

        Moto moto = new Moto("Honda", "CB 500", 2023, 40000, 500);
        moto.exibirDetalhes();

        Caminhao caminhao = new Caminhao("Volvo", "FH16", 2021, 500000, 25);
        caminhao.exibirDetalhes();
    }
}
