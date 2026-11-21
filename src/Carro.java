public class Carro extends Veiculo {

    private int qtdDePortas;

    public Carro(
    String id,
    String marca,
    String modelo,
    int ano,
    double precoBase,
    int qtdDePortas
) {
    super(id, marca, modelo, ano, precoBase);
    definirQtdDePortas(qtdDePortas);
    

}

    @Override 
    public String exibirDetalhes(){
        return detalhesBasicos() + ( "\nQuantidade de portas: " + qtdDePortas);
    }

    private void definirQtdDePortas(int qtdDePortas){
        if (qtdDePortas < 2 || qtdDePortas > 5) {
        throw new IllegalArgumentException(
            "A quantidade de portas deve estar entre 2 e 5."
        );
    }
        this.qtdDePortas = qtdDePortas;
    }
}
