package lista04;

public abstract class TarefaBase {
    protected boolean concluida = false;

    public void marcarConcluida() {
        this.concluida = true;
        System.out.println("Tarefa marcada como concluída.");
    }

    public boolean isConcluida() {
        return concluida;
    }
}

