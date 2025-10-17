package lista04;

public class Carro extends Veiculo {
    public Carro(String cor) {
        super(cor); // chamada obrigatória ao construtor da superclasse
    }

    @Override
    public String toString() {
        return "Carro{cor='" + cor + "'}";
    }

    public static void main(String[] args) {
        Carro c = new Carro("Azul");
        System.out.println(c);
    }
}

