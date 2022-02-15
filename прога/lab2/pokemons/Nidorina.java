package lab2.pokemons;

import ru.ifmo.se.pokemon.*;
import lab2.pokemons.Nidoran;
import lab2.moves.*;

public class Nidorina extends Nidoran{
    public Nidorina(String name, int level){
        super(name, level);

        setType(Type.POISON);
        setStats(70, 62, 67, 55, 55, 56);
        setMove(new Crunch());
    }
}
