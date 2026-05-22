package JogoPokemon.Application;

import JogoPokemon.model.Pokemon;
import JogoPokemon.model.Usuario;
import JogoPokemon.repository.PokemonRepository;

import java.util.ArrayList;
import java.util.List;


public class Main {
    public static void main(String[] args) throws Exception {

        PokemonRepository pokemonRepository = new PokemonRepository();

        Pokemon pokemon = new Pokemon(10);

        List<Pokemon> pokemonList = new ArrayList<>();

        Usuario jogador = new Usuario("pablo",pokemonList);

        jogador.curarPokemon(pokemon);

        System.out.println(pokemon.getVida());


    }
}