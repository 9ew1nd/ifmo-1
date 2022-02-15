package lab2.moves;

import ru.ifmo.se.pokemon.*;

public class Thunderbolt extends SpecialMove{
    public Thunderbolt(){super(Type.ELECTRIC,90, 100);}

    @Override
    protected String describe(){return "Сильная электрическая атака, которая также может парализовать противника";}

    // Удар молнии наносит урон и имеет 10% шанс парализовать цель.
    @Override
    protected void applyOppEffects(Pokemon pokemon){
        Effect e = new Effect().chance(0.1).condition(Status.PARALYZE);
        pokemon.setCondition(e);
    }
}
