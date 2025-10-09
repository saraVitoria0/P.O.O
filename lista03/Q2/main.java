package lista03.q2;

public class Main {
    public static void main(String[] args) {
        ContaCorrente cc = new ContaCorrente("001", "João", 1000, 500);
        cc.consultarSaldo();
        cc.sacar(1200);
        cc.consultarSaldo();

        ContaPoupanca cp = new ContaPoupanca("002", "Maria", 2000, 0.05);
        cp.aplicarRendimento();
        cp.consultarSaldo();
    }
}
