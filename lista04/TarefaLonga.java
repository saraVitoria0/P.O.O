package lista04;

public class TarefaLonga extends TarefaBase implements IExecutavel {
    @Override
    public void executar() {
        int progresso = 0;
        while (progresso < 100) {
            progresso += 10;
            System.out.println("Progresso: " + progresso + "%");
        }
        marcarConcluida();
    }

    public static void main(String[] args) {
        TarefaLonga t = new TarefaLonga();
        t.executar();
        System.out.println("Concluída? " + t.isConcluida());
    }
}

