package lista03.q2;

public class ContaPoupanca extends ContaBancaria {
    private double taxaRendimento;

    public ContaPoupanca(String numeroConta, String titular, double saldo, double taxaRendimento) {
        super(numeroConta, titular, saldo);
        this.taxaRendimento = taxaRendimento;
    }

    public void aplicarRendimento() {
        saldo += saldo * taxaRendimento;
    }
}
