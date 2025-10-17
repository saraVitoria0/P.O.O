package lista04;

public class Fatura implements IImprimivel {
    private String numero;

    public Fatura(String numero) {
        this.numero = numero;
    }

    @Override
    public void imprimir(int copias) {
        if (copias > 5) {
            System.out.println("Imprimindo " + copias + " cópias em modo rascunho.");
        } else {
            System.out.println("Imprimindo " + copias + " cópias em modo alta qualidade.");
        }
    }

    public static void main(String[] args) {
        IImprimivel f = new Fatura("FAT-001");
        f.imprimir(3);
        f.imprimir(6);
    }
}
