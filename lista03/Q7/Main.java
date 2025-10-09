package lista03.q7;

public class Main {
    public static void main(String[] args) {
        Futebol fut = new Futebol("Futebol", 11, 90, 100, 105.0);
        fut.exibirRegras();

        System.out.println();

        Basquete basq = new Basquete("Basquete", 5, 48, 90, 3.05);
        basq.exibirRegras();
    }
}
