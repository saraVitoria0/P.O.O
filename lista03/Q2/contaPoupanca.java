public class contaPoupanca extends contaBancaria {
    private final double taxaRendimento;

    public contaPoupanca(String numeroConta, String titular, double saldo, double taxaRendimento) {
        super(numeroConta, titular, saldo);
        this.taxaRendimento = taxaRendimento;
    }

    public void aplicarRendimento() {
        saldo += saldo * taxaRendimento;
    }
}
