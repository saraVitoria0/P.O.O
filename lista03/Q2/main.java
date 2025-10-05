public class main {
    public static void main(String[] args) {
        contaCorrente cc = new contaCorrente("001", "João", 1000, 500);
        cc.consultarSaldo();
        cc.sacar(1200);
        cc.consultarSaldo();

        contaPoupanca cp = new contaPoupanca("002", "Maria", 2000, 0.05);
        cp.consultarSaldo();
        cp.aplicarRendimento();
        cp.consultarSaldo();
    }
}
