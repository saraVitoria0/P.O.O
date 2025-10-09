package lista03.q4;

public class Main {
    public static void main(String[] args) {
        Apartamento apt = new Apartamento("Rua A, 100", 80, 3, 300000, 5, 500);
        apt.exibirCaracteristicas();

        System.out.println();

        Casa casa = new Casa("Av. B, 200", 120, 4, 500000, 60, true);
        casa.exibirCaracteristicas();
    }
}
