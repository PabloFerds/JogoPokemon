package JogoPokemon.enums;

import JogoPokemon.enums.Tipo;

public class TipoInicializar {

    public static void inicializar() {

        Tipo.FIRE.adicionarFraqueza(Tipo.WATER);
        Tipo.FIRE.adicionarFraqueza(Tipo.GROUND);
        Tipo.FIRE.adicionarFraqueza(Tipo.ROCK);

        Tipo.FIRE.adicionarVantagem(Tipo.GRASS);
        Tipo.FIRE.adicionarVantagem(Tipo.BUG);
        Tipo.FIRE.adicionarVantagem(Tipo.ICE);

        Tipo.WATER.adicionarFraqueza(Tipo.ELECTRIC);
        Tipo.WATER.adicionarFraqueza(Tipo.GRASS);

        Tipo.WATER.adicionarVantagem(Tipo.FIRE);
        Tipo.WATER.adicionarVantagem(Tipo.GROUND);
        Tipo.WATER.adicionarVantagem(Tipo.ROCK);

        Tipo.GRASS.adicionarFraqueza(Tipo.FIRE);
        Tipo.GRASS.adicionarFraqueza(Tipo.ICE);
        Tipo.GRASS.adicionarFraqueza(Tipo.FLYING);
        Tipo.GRASS.adicionarFraqueza(Tipo.BUG);
        Tipo.GRASS.adicionarFraqueza(Tipo.POISON);

        Tipo.GRASS.adicionarVantagem(Tipo.WATER);
        Tipo.GRASS.adicionarVantagem(Tipo.GROUND);
        Tipo.GRASS.adicionarVantagem(Tipo.ROCK);

        Tipo.ELECTRIC.adicionarFraqueza(Tipo.GROUND);

        Tipo.ELECTRIC.adicionarVantagem(Tipo.WATER);
        Tipo.ELECTRIC.adicionarVantagem(Tipo.FLYING);

        Tipo.FLYING.adicionarFraqueza(Tipo.ELECTRIC);
        Tipo.FLYING.adicionarFraqueza(Tipo.ICE);
        Tipo.FLYING.adicionarFraqueza(Tipo.ROCK);

        Tipo.FLYING.adicionarVantagem(Tipo.GRASS);
        Tipo.FLYING.adicionarVantagem(Tipo.BUG);
        Tipo.FLYING.adicionarVantagem(Tipo.FIGHTING);

        Tipo.ROCK.adicionarFraqueza(Tipo.WATER);
        Tipo.ROCK.adicionarFraqueza(Tipo.GRASS);
        Tipo.ROCK.adicionarFraqueza(Tipo.GROUND);
        Tipo.ROCK.adicionarFraqueza(Tipo.FIGHTING);

        Tipo.ROCK.adicionarVantagem(Tipo.FIRE);
        Tipo.ROCK.adicionarVantagem(Tipo.FLYING);
        Tipo.ROCK.adicionarVantagem(Tipo.BUG);
        Tipo.ROCK.adicionarVantagem(Tipo.ICE);

        Tipo.FIGHTING.adicionarFraqueza(Tipo.FLYING);
        Tipo.FIGHTING.adicionarFraqueza(Tipo.PSYCHIC);
        Tipo.FIGHTING.adicionarFraqueza(Tipo.BUG);

        Tipo.FIGHTING.adicionarVantagem(Tipo.NORMAL);
        Tipo.FIGHTING.adicionarVantagem(Tipo.ICE);
        Tipo.FIGHTING.adicionarVantagem(Tipo.ROCK);

        Tipo.GROUND.adicionarFraqueza(Tipo.WATER);
        Tipo.GROUND.adicionarFraqueza(Tipo.GRASS);
        Tipo.GROUND.adicionarFraqueza(Tipo.ICE);

        Tipo.GROUND.adicionarVantagem(Tipo.FIRE);
        Tipo.GROUND.adicionarVantagem(Tipo.ELECTRIC);
        Tipo.GROUND.adicionarVantagem(Tipo.POISON);
        Tipo.GROUND.adicionarVantagem(Tipo.ROCK);

        Tipo.PSYCHIC.adicionarFraqueza(Tipo.BUG);
        Tipo.PSYCHIC.adicionarFraqueza(Tipo.GHOST);

        Tipo.PSYCHIC.adicionarVantagem(Tipo.POISON);
        Tipo.PSYCHIC.adicionarVantagem(Tipo.FIGHTING);

        Tipo.GHOST.adicionarFraqueza(Tipo.GHOST);

        Tipo.GHOST.adicionarImunidade(Tipo.NORMAL);
        Tipo.GHOST.adicionarImunidade(Tipo.FIGHTING);

        Tipo.GHOST.adicionarVantagem(Tipo.PSYCHIC);

        Tipo.POISON.adicionarFraqueza(Tipo.PSYCHIC);
        Tipo.POISON.adicionarFraqueza(Tipo.GROUND);

        Tipo.POISON.adicionarVantagem(Tipo.GRASS);
        Tipo.POISON.adicionarVantagem(Tipo.BUG);

        Tipo.BUG.adicionarFraqueza(Tipo.FIRE);
        Tipo.BUG.adicionarFraqueza(Tipo.FLYING);
        Tipo.BUG.adicionarFraqueza(Tipo.ROCK);

        Tipo.BUG.adicionarVantagem(Tipo.GRASS);
        Tipo.BUG.adicionarVantagem(Tipo.PSYCHIC);
        Tipo.BUG.adicionarVantagem(Tipo.POISON);

        Tipo.ICE.adicionarFraqueza(Tipo.FIRE);
        Tipo.ICE.adicionarFraqueza(Tipo.FIGHTING);
        Tipo.ICE.adicionarFraqueza(Tipo.ROCK);

        Tipo.ICE.adicionarVantagem(Tipo.GRASS);
        Tipo.ICE.adicionarVantagem(Tipo.FLYING);
        Tipo.ICE.adicionarVantagem(Tipo.GROUND);

        Tipo.DRAGON.adicionarFraqueza(Tipo.ICE);
        Tipo.DRAGON.adicionarFraqueza(Tipo.DRAGON);

        Tipo.DRAGON.adicionarVantagem(Tipo.DRAGON);
    }
}