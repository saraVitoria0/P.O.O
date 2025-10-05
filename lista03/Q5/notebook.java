public class notebook extends produtoEletronico {
    private String processador;
    private int memoriaRAM;

    public notebook(String marca, String modelo, double preco, String voltagem, String processador, int memoriaRAM) {
        super(marca, modelo, preco, voltagem);
        this.processador = processador;
        this.memoriaRAM = memoriaRAM;
    }

    @Override
    public double calcularGarantiaEstendida() {
        return preco * 0.25;
    }

    @Override
    public void exibirEspecificacoes() {
        super.exibirEspecificacoes();
        System.out.println("Processador: " + processador);
        System.out.println("Memória RAM: " + memoriaRAM + " GB");
        System.out.println("-------------------------------");
    }
}

