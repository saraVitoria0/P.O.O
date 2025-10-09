package lista03.q2;

public class ContaBancaria {
    protected String numeroConta;
    protected double saldo;
    protected String titular;

    public ContaBancaria(String numeroConta, String titular, double saldo) {
        this.numeroConta = numeroConta;
        this.titular = titular;
        this.saldo = saldo;
    }

    public void depositar(double valor) {
        saldo += valor;
    }

    public void sacar(double valor) {
        if (valor <= saldo)
            saldo -= valor;
        else
            System.out.println("Saldo insuficiente!");
    }

    public void consultarSaldo() {
        System.out.println("Titular: " + titular + " | Saldo: R$ " + saldo);
    }
}
