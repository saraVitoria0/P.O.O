public class main {
    public main(String[] args) {
        veiculo carro = new veiculo("Toyota", "Corolla", 2022, 120000);
        carro.exibirDetalhes();

        moto moto = new moto("Honda", "CB 500", 2023, 40000, 500);
        moto.exibirDetalhes();

        caminhao caminhao = new caminhao("Volvo", "FH16", 2021, 500000, 25);
        caminhao.exibirDetalhes();
    }
}
