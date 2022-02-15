package lab2.moves;

import ru.ifmo.se.pokemon.*;

public class PowerGem extends SpecialMove{
    public PowerGem(){
        super(Type.ROCK, 80, 100);
    }

    @Override
    protected String describe() {
        return "атакует лучом света, который сверкает, как будто он сделан из драгоценных камней";
    }

    // Нет эффектов.
}
