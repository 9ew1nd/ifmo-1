package lab2.moves;

import ru.ifmo.se.pokemon.*;

public class Crunch extends PhysicalMove{
    public Crunch(){super(Type.DARK, 80, 100);}

    @Override
    protected String describe(){return "сокрушает врага острыми клыками. Это также может снизить показатель защиты цели";}

    // Crunch наносит урон и имеет 20% шанс понизить защиту цели на одну ступень.
    @Override
    protected void applyOppEffects(Pokemon pokemon) {
        if (Math.random() <= 0.2){
            pokemon.setMod(Stat.DEFENSE, -1);
        }
    }
}
