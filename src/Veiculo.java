import java.time.LocalDate;

public abstract class Veiculo {
    protected final String id;
    protected String marca;
    protected String modelo;
    protected int ano;
    protected double precoBase;
    private SituacaoVeiculo situacaoVeiculo;
    private static final int ANO_MINIMO = 1950;
    private static final int ANO_MAXIMO = LocalDate.now().getYear();

    public Veiculo(String id, String marca, String modelo, int ano, double precoBase){
         if (precoBase <= 999) {
            throw new IllegalArgumentException();
        }
        if (ano < ANO_MINIMO ||  ano > ANO_MAXIMO) {
            throw new IllegalArgumentException();
        }
    
        this.id = id;
        this.marca = marca;
        this.modelo = modelo;
        this.ano = ano;
        this.precoBase = precoBase;
        this.situacaoVeiculo = SituacaoVeiculo.DISPONIVEL;
    }

    private boolean estaDisponivel(){
        return situacaoVeiculo == SituacaoVeiculo.DISPONIVEL;
    }

    private void reservar(){
        if (!estaDisponivel()) {
            throw new IllegalStateException();
        }
        this.situacaoVeiculo = SituacaoVeiculo.RESERVADO;
    }

    private void vender(){
        if (!estaDisponivel()) {
            throw new IllegalStateException("Veiculo não disponível!");
        }
        this.situacaoVeiculo = SituacaoVeiculo.VENDIDO;
    }

    public void cancelarReserva(){
        if (situacaoVeiculo != SituacaoVeiculo.RESERVADO) {
            throw new IllegalStateException("Somente veículos reservados podem ter a reserva cancelada.");
        }
        situacaoVeiculo = SituacaoVeiculo.DISPONIVEL;
    }
       
    public abstract String exibirDetalhes();

    protected String detalhesBasicos() {
    return "Marca: " + marca
         + "\nModelo: " + modelo
         + "\nAno: " + ano;
}
    
}
