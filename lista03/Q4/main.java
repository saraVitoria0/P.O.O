public class main {
    public static void main(String[] args) {
        apartamento apt = new apartamento("Rua A, 100", 80, 3, 300000, 5, 500);
        apt.exibirCaracteristicas();

        casa casa = new casa("Av. B, 200", 120, 4, 500000, 60, true);
        casa.exibirCaracteristicas();
    }
}
