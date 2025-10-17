package lista04;

public class Desenvolvedor extends Funcionario {

    public Desenvolvedor(String nome, int codigoCargo, double salarioBase) {
        super(nome, codigoCargo, salarioBase);
    }

    @Override
    public double calcularBonificacao() {
        switch (codigoCargo) {
            case 1: return salarioBase * 0.10;
            case 2: return salarioBase * 0.15;
            case 3: return salarioBase * 0.20;
            default: return salarioBase * 0.05;
        }
    }

    public static void main(String[] args) {
        Desenvolvedor d1 = new Desenvolvedor("Ana", 1, 3000);
        Desenvolvedor d2 = new Desenvolvedor("Bruno", 3, 8000);

        System.out.println("Bonificação Ana: " + d1.calcularBonificacao());
        System.out.println("Bonificação Bruno: " + d2.calcularBonificacao());
    }
}

