package lista04;

public class TransferenciaHTTP implements ITransferencia {
    @Override
    public void iniciarDownload(int tamanhoTotal) {
        int bytesRecebidos = 0;
        boolean continuar = true;

        while (bytesRecebidos < tamanhoTotal && continuar) {
            int incremento = Math.max(1, tamanhoTotal / 10);
            bytesRecebidos += incremento;
            if (bytesRecebidos > tamanhoTotal) bytesRecebidos = tamanhoTotal;

            System.out.println("Progresso: " + bytesRecebidos + "/" + tamanhoTotal);

            if (bytesRecebidos >= tamanhoTotal / 2) {
                continuar = false;
                System.out.println("Download Pausado Automaticamente!");
            }
        }

        if (bytesRecebidos >= tamanhoTotal) {
            System.out.println("Download Completo");
        } else {
            System.out.println("Pausado/Interrompido");
        }
    }

    public static void main(String[] args) {
        ITransferencia t = new TransferenciaHTTP();
        t.iniciarDownload(100);
    }
}

