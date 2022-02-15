package lab2.pokemons;

import ru.ifmo.se.pokemon.*;
import lab2.pokemons.Grimer;
import lab2.moves.*;

public class Muk extends Grimer{
    public Muk(String name, int level){
        super(name, level);

        setType(Type.POISON);
        setStats(105, 105, 75, 65, 100, 50);
        setMove(new VenomDrench());



    }
}
