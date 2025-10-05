
public class contaBancaria {
    protected String numeroConta;
    protected double saldo;
    protected String titular;

    public contaBancaria(String numeroConta, String titular, double saldo) {
        this.numeroConta = numeroConta;
        this.titular = titular;
        this.saldo = saldo;
    }

    public void depositar(double valor) {
        saldo += valor;
    }

    public void sacar(double valor) {
        if (valor <= saldo) saldo -= valor;
        else System.out.println("Saldo insuficiente!");
    }

    public void consultarSaldo() {
        System.out.println("Titular: " + titular + " | Saldo: R$ " + saldo);
    }
}
