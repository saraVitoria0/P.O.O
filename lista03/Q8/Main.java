package lista03.q8;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        PratoVegano veg = new PratoVegano("Salada Verde", 25, 10, Arrays.asList("Alface", "Tomate", "Pepino"), "CertVeg");
        veg.exibirCardapio();

        System.out.println();

        PratoGourmet gourmet = new PratoGourmet("Risoto de Camarão", 70, 30, Arrays.asList("Arroz", "Camarão", "Vinho"), "Chef Carlos");
        gourmet.exibirCardapio();
    }
}
