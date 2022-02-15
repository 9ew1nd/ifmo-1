package lab2;

import lab2.pokemons.*;
import ru.ifmo.se.pokemon.*;

public class Main {
    public static void main(String[] args) {
        Battle b = new Battle();
        Pokemon corsola = new Corsola("Corsa", 1);
        Pokemon grimer = new Grimer("Grimy", 1);
        Pokemon muk = new Muk("Muki", 1);
        Pokemon nidoran = new Nidoran("Nido", 1);
        Pokemon nidorina = new Nidorina("Nidora", 1);
        Pokemon nidoqueen = new Nidoqueen("Queeny", 1);

        b.addAlly(grimer);
        b.addAlly(nidoran);
        b.addAlly(nidoqueen);
        b.addFoe(corsola);
        b.addFoe(muk);
        b.addFoe(nidorina);

        b.go();
    }
}
