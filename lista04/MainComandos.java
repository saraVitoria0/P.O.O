package lista04;

public class MainComandos {
    public static void main(String[] args) {
        IComando[] comandos = { new ComandoRede(), new ComandoArquivo() };
        for (IComando cmd : comandos) {
            cmd.executar(new String[] {});
        }
    }
}

