public class main {
    public static void main(String[] args) {
        smartphone sp = new smartphone("Samsung", "Galaxy S23", 4500, "Bivolt", 6.7, 5000);
        sp.exibirEspecificacoes();

        notebook nb = new notebook("Dell", "XPS 13", 8500, "Bivolt", "Intel i7", 16);
        nb.exibirEspecificacoes();
    }
}
