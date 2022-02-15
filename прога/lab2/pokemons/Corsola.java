package lab2.pokemons;

import ru.ifmo.se.pokemon.*;
import lab2.moves.*;

public class Corsola extends Pokemon{
    public Corsola(String name, int level){
        super(name, level);

        setType(Type.WATER, Type.ROCK);
        setStats(65, 55, 95, 65, 95, 35);
        setMove(new PowerGem(), new IcicleSpear(), new StoneEdge(), new Amnesia());
    }
}
