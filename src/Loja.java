import java.util.ArrayList;
import java.util.List;

public class Loja {

    private final List<String> carros = new ArrayList<>();

    public Loja() {
        carros.add("Honda");
        carros.add("Toyota");
        carros.add("Fiat");
    }

    private void mostrarCarros() {
        for (String carro : carros) {
            IO.println(carro);
        }
    }

    private int qtdCarros() {
        return carros.size();
    }

    private String obterPrimeiro() {
        return (carros.getFirst());
    }

    private String obterUltimo() {
        return carros.getLast();
    }

    private void removeCarro(int index) {
        if (index < 1 || index > carros.size()) {
            throw new IndexOutOfBoundsException("Posição inválida, o tamanho da Lista é " + carros.size());
        }
        carros.remove(index - 1);
        mostrarCarros();
    }

    private boolean verificarCarro(String nome) {
        return carros.contains(nome);
    }

    private int buscarPosicao(String nome) {
        int posicao = carros.indexOf(nome);
        if (posicao != -1) {
            return posicao + 1;
        }
        return posicao;
    }

    private int buscarIndiceIgnorandoMaiusculas(String nome) {
        for (int i = 0; i < carros.size(); i++) {
            if (carros.get(i).equalsIgnoreCase(nome)) {
                return i;
            }
        }

        return -1;
    }

    private boolean verificarCarroIgnorandoMaiusculas(String nome) {
        return buscarIndiceIgnorandoMaiusculas(nome) != -1;
    }
}
