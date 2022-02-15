package lab2.moves;

import ru.ifmo.se.pokemon.*;

public class MudSlap extends SpecialMove{
    public MudSlap(){super(Type.GROUND, 20, 100);}

    @Override
    protected String describe(){return "бросает грязь в лицо цели, чтобы нанести урон и снизить ее точность";}

    // Mud-Slap наносит урон и снижает точность цели на один уровень.
    @Override
    protected void applyOppEffects(Pokemon pokemon){
        pokemon.setMod(Stat.ACCURACY, -1);
    }
}
