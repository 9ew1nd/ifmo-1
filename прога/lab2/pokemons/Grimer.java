package lab2.pokemons;

import ru.ifmo.se.pokemon.*;
import lab2.moves.*;

public class Grimer extends Pokemon{
    public Grimer(String name, int level){
        super(name, level);

        setType(Type.POISON);
        setStats(80, 80, 50, 40, 50, 25);
        setMove(new GunkShot(), new Minimize(), new MudSlap());
    }
}
