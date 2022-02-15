package lab2.moves;

import ru.ifmo.se.pokemon.*;

import javax.sound.midi.Soundbank;
import java.net.SocketOption;

public class VenomDrench extends StatusMove{
    public VenomDrench(){super(Type.POISON, 0, 100);}

    @Override
    protected String describe(){return "Покемоны-противники залиты странной ядовитой жидкостью. Это снижает Атаку, Sp. Атк и скорость отравленной цели";}

    // Если цель отравлена, Venom Drench снижает ее Атаку, Специальную атаку и Скорость на один уровень каждый.
    @Override
    protected void applyOppEffects(Pokemon pokemon){
        if (pokemon.getCondition() == Status.NORMAL){
            pokemon.setMod(Stat.ATTACK, -1);
            pokemon.setMod(Stat.SPECIAL_ATTACK, -1);
            pokemon.setMod(Stat.SPEED, -1);
        }
    }
}
