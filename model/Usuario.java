package JogoPokemon.model;

import java.util.ArrayList;
import java.util.List;

public class Usuario {
    private String nome;
    private List<Pokemon> listaPokemon = new ArrayList<>();
    private Integer pocao;

    public Usuario(String nome, List<Pokemon> listaPokemon) {
        this.nome = nome;
        this.listaPokemon = listaPokemon;
        this.pocao = 5;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public List<Pokemon> getListaPokemon() {
        return listaPokemon;
    }

    public void setListaPokemon(List<Pokemon> listaPokemon) {
        this.listaPokemon = listaPokemon;
    }

    public Integer getPocao() {
        return pocao;
    }

    public void setPocao(Integer pocao) {
        this.pocao = pocao;
    }

    public Integer curarPokemon (Pokemon pokemon){
        if(pokemon.getVida() <= 0){
            System.out.println("Pokemon Desmaiou");
            return pokemon.getVida();
        }
        pokemon.setVida(pokemon.getVida()+50);
        if(pokemon.getVida()>50){
            pokemon.setVida(50);
        }
        pocao -= 1;
        return pocao;

    }
}
