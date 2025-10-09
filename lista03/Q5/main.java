package lista03.q5;

public class Main {
    public static void main(String[] args) {
        Smartphone sp = new Smartphone("Samsung", "Galaxy S23", 4500, "Bivolt", 6.7, 5000);
        sp.exibirEspecificacoes();

        System.out.println();

        Notebook nb = new Notebook("Dell", "XPS 13", 8500, "Bivolt", "Intel i7", 16);
        nb.exibirEspecificacoes();
    }
}
