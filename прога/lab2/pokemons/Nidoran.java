package lab2.pokemons;

import ru.ifmo.se.pokemon.*;
import lab2.moves.*;

public class Nidoran extends Pokemon {
    public Nidoran(String name, int level){
        super(name, level);

        setType(Type.POISON);
        setStats(55, 47, 52, 40, 40,41);
        setMove(new Thunder(), new Thunderbolt());
    }
}
