package lista03.q6;

public class Main {
    public static void main(String[] args) {
        Filme filme = new Filme("Inception", 2010, 148, 50, "Christopher Nolan", "Sci-Fi");
        filme.exibirInfo();

        System.out.println();

        Serie serie = new Serie("Stranger Things", 2016, 50, 30, 4, 8);
        serie.exibirInfo();
    }
}
