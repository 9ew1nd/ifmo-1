package lab2.moves;

import ru.ifmo.se.pokemon.*;

public class IcicleSpear extends PhysicalMove{
    public IcicleSpear() {
        super(Type.ICE, 25, 100);
    }
    @Override
    protected String describe() {
        return "запускает во врага острые сосульки";
    }
}
