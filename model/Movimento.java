package JogoPokemon.model;
import JogoPokemon.enums.Tipo;

public class Movimento {
    private String nomeMovimento;
    private Integer dano;
    private Tipo tipo;
    private Integer ppAtual;
    private Integer ppMaximo;
    private Integer precisao;

    public Movimento(String nomeMovimento, Integer dano, Tipo tipo, Integer ppAtual, Integer ppMaximo, Integer precisao) {
        this.nomeMovimento = nomeMovimento;
        this.dano = dano;
        this.tipo = tipo;
        this.ppAtual = ppAtual;
        this.ppMaximo = ppMaximo;
        this.precisao = precisao;
    }

    public String getNomeMovimento() {
        return nomeMovimento;
    }

    public void setNomeMovimento(String nomeMovimento) {
        this.nomeMovimento = nomeMovimento;
    }

    public Integer getDano() {
        return dano;
    }

    public void setDano(Integer dano) {
        this.dano = dano;
    }

    public Tipo getTipo() {
        return tipo;
    }

    public void setTipo(Tipo tipo) {
        this.tipo = tipo;
    }

    public Integer getPpAtual() {
        return ppAtual;
    }

    public void setPpAtual(Integer ppAtual) {
        this.ppAtual = ppAtual;
    }

    public Integer getPpMaximo() {
        return ppMaximo;
    }

    public void setPpMaximo(Integer ppMaximo) {
        this.ppMaximo = ppMaximo;
    }

    public Integer getPrecisao() {
        return precisao;
    }

    public void setPrecisao(Integer precisao) {
        this.precisao = precisao;
    }
}
