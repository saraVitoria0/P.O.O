package lista04;

public class ValidadorSeguranca extends ValidadorBase {
    @Override
    public void validarAcesso(String senha) {
        if (senha != null && senha.length() >= 8 && senha.contains("A")) {
            System.out.println("Acesso OK");
        } else {
            System.out.println("Acesso Negado");
        }
    }

    public static void main(String[] args) {
        ValidadorSeguranca v = new ValidadorSeguranca();
        v.validarAcesso("1234567A");
        v.validarAcesso("senhaerrada");
    }
}

