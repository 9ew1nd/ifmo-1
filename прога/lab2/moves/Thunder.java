package lab2.moves;

import ru.ifmo.se.pokemon.*;

public class Thunder extends SpecialMove{
    public Thunder(){super(Type.ELECTRIC, 110, 70);}

    @Override
    protected String describe(){return "Злая молния падает на врага, чтобы нанести ему урон. Это также может привести к параличу цели";}

    // Гром наносит урон и имеет 30% шанс парализовать цель.
    @Override
    protected void applyOppEffects(Pokemon pokemon){
        Effect e = new Effect().chance(0.3).condition(Status.PARALYZE);
        pokemon.setCondition(e);
        }
}




