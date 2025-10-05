public class main {
    public static void main(String[] args) {
        filme filme = new filme("Inception", 2010, 148, 50, "Christopher Nolan", "Sci-Fi");
        filme.exibirInfo();

        serie serie = new serie("Stranger Things", 2016, 50, 30, 4, 8);
        serie.exibirInfo();
    }
}

