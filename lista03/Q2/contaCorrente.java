public class contaCorrente extends contaBancaria {
    private final double limiteChequeEspecial;

    public contaCorrente(String numeroConta, String titular, double saldo, double limiteChequeEspecial) {
        super(numeroConta, titular, saldo);
        this.limiteChequeEspecial = limiteChequeEspecial;
    }

    @Override
    public void sacar(double valor) {
        if (valor <= saldo + limiteChequeEspecial) {
            saldo -= valor;
        } else {
            System.out.println("Limite insuficiente!");
        }
    }
}
