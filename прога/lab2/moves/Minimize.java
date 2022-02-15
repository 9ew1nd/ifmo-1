package lab2.moves;

import ru.ifmo.se.pokemon.*;

public class Minimize extends StatusMove{
    public Minimize(){ super(Type.NORMAL, 0, 100);}

    @Override
    protected String describe(){return "сжимает все клетки своего тела, чтобы повысить его уклончивость";}

    // Минимизация увеличивает уклонение пользователя на два уровня, что затрудняет попадание по пользователю.
    @Override
    protected void applySelfEffects(Pokemon pokemon){
        pokemon.setMod(Stat.EVASION, +2);
    }
}
