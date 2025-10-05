public class casa extends imovel {
    private final double areaQuintal;
    private final boolean temPiscina;

    public casa(String endereco, double area, int numeroQuartos, double preco, double areaQuintal, boolean temPiscina) {
        super(endereco, area, numeroQuartos, preco);
        this.areaQuintal = areaQuintal;
        this.temPiscina = temPiscina;
    }

    @Override
    public double calcularTaxaAdministracao() {
        return preco * 0.10;
    }

    @Override
    public void exibirCaracteristicas() {
        super.exibirCaracteristicas();
        System.out.println("Área do quintal: " + areaQuintal + " m²");
        System.out.println("Tem piscina? " + (temPiscina ? "Sim" : "Não"));
        System.out.println("-------------------------------");
    }
}

