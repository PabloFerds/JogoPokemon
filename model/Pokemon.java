package JogoPokemon.model;

import java.util.ArrayList;
import java.util.List;

public class Pokemon {
    private Integer id;
    private String nome;
    private Integer vida;
    private Integer nivel;
    private List<Movimento> movimentoList = new ArrayList<>();



    public Pokemon(Integer vida) {
        this.vida = vida;
    }

    public Integer getVida() {
        return vida;
    }

    public void setVida(Integer vida) {
        this.vida = vida;
    }
}
