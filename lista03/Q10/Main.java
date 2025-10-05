public class Main {
    public static void main(String[] args) {
        Onibus onibus = new Onibus(50, 120, 3.5, 300000, 2);
        Metro metro = new Metro(300, 80, 5.0, 800000, true);

        System.out.println("=== ÔNIBUS ===");
        onibus.exibirDados();
        System.out.println("Custo da viagem (200 km): R$ " + onibus.calcularCustoViagem(200));
        System.out.println("-------------------------------");

        System.out.println("=== METRÔ ===");
        metro.exibirDados();
        System.out.println("Custo da viagem (200 km): R$ " + metro.calcularCustoViagem(200));
    }
}

