package lista04;

import java.util.ArrayList;
import java.util.List;

public class ProcessadorCSV implements IProcessadorDeDados {
    @Override
    public void processar(String[] dados) {
        for (int i = 0; i < dados.length; i++) {
            System.out.println(i + ": " + dados[i]);
        }
    }

    public static void main(String[] args) {
        IProcessadorDeDados p = new ProcessadorCSV();
        String[] linhas = {"id,nome,idade", "1,Ana,23", "2,Bruno,30"};
        p.processar(linhas);

        List<IProcessadorDeDados> lista = new ArrayList<>();
        lista.add(new ProcessadorCSV());

        for (IProcessadorDeDados proc : lista) {
            proc.processar(new String[]{"linhaA", "linhaB"});
        }
    }
}

