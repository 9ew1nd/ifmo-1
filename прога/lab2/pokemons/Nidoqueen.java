package lab2.pokemons;

import ru.ifmo.se.pokemon.*;
import lab2.pokemons.Nidorina;
import lab2.moves.*;

public class Nidoqueen extends Nidorina{
    public Nidoqueen(String name, int level){
        super(name, level);

        setType(Type.POISON, Type.GROUND);
        setStats(90, 92, 87, 75, 85, 76);
        setMove(new Scratch());

    }
}
