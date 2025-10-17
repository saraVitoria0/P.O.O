package lista04;

public class Logger implements ISalvavelEmArquivo, ISalvavelEmDB {
    @Override
    public void salvarLocal(String log) {
        if (log != null && !log.isEmpty()) {
            System.out.println("LOG ARQUIVO: " + log);
        } else {
            System.out.println("Log vazio. Não salvado no arquivo.");
        }
    }

    @Override
    public void salvarRemoto(String log) {
        for (int i = 1; i <= 3; i++) {
            System.out.println("Tentativa " + i + " de conexão com DB.");
        }
        System.out.println("LOG DB: " + log);
    }

    public static void main(String[] args) {
        Logger logger = new Logger();
        logger.salvarLocal("Aplicação iniciada.");
        logger.salvarRemoto("Erro crítico: NullPointerException");
    }
}

