package JogoPokemon.model;

import JogoPokemon.enums.Tipo;

import java.util.ArrayList;
import java.util.List;

public class Pokemon {
    private Integer id;
    private String nome;
    private Tipo tipo;
    private Integer vida;
    private Integer nivel;
    private List<Movimento> movimentoList = new ArrayList<>();

    public Tipo getTipo() {
        return tipo;
    }

    public void setTipo(Tipo tipo) {
        this.tipo = tipo;
    }

    public Pokemon(Integer vida) {
        this.vida = vida;
    }

    public Integer getVida() {
        return vida;
    }

    public void setVida(Integer vida) {
        this.vida = vida;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Integer getNivel() {
        return nivel;
    }

    public void setNivel(Integer nivel) {
        this.nivel = nivel;
    }

    public List<Movimento> getMovimentoList() {
        return movimentoList;
    }

    public void setMovimentoList(List<Movimento> movimentoList) {
        this.movimentoList = movimentoList;
    }
}
