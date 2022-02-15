package lab2.moves;

import ru.ifmo.se.pokemon.*;

public class GunkShot extends PhysicalMove{
    public GunkShot(){ super(Type.POISON, 120, 80);}

    @Override
    protected String describe(){return "стреляет в противника грязным мусором для атаки. Он также может отравить цель";}

    // Gunk Shot наносит урон и имеет 30% шанс отравить цель.
    protected void applyOppEffects(Pokemon pokemon) {
            Effect e = new Effect().chance(0.3).condition(Status.POISON);
            pokemon.setCondition(e);
        }
}
