package lab2.moves;

import ru.ifmo.se.pokemon.*;

public class Amnesia extends StatusMove{
    public Amnesia(){
        super(Type.PSYCHIC, 0, 100);
    }

    @Override
    protected String describe() {
        return "временно освобождает свой разум, чтобы забыть о своих заботах. Это резко повышает Sp. Def stat";
    }

    // Амнезия повышает особую защиту пользователя на два уровня.
    @Override
    protected void applySelfEffects(Pokemon pokemon) {
        pokemon.setMod(Stat.SPECIAL_DEFENSE, +2);
    }
}

