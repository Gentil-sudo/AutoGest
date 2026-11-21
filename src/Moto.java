public class Moto extends Veiculo {

    private int cilindradas;

    public Moto(String id,
    String marca,
    String modelo,
    int ano,
    double precoBase,
    int cilindradas){
        super(String marca, String modelo, int ano, double precoBase);

        
    }

    public String exibirDetalhes(){
        return "a";
    }

    public void definirCilindradas(int cilindradas){
        if (cilindradas > 0) {
            throw new IllegalArgumentException();
        }
        this.cilindradas = cilindradas;
    }

}
