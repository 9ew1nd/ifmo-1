package lab2.moves;

import ru.ifmo.se.pokemon.*;

public class Scratch extends PhysicalMove{
    public Scratch(){super(Type.NORMAL, 40, 100);}

    @Override
    protected String describe(){return "царапает врага острыми когтями";}

    // Нет эффекта.
}
