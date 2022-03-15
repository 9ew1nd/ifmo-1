import locations.*;
import humans.*;
import environment.*;

public class Main{
    public static void main(String[] args){
        Carlson carlson = new Carlson("Карлсон", 29);
        Mother mother  = new Mother("Мама", 40);
        Kid kid = new Kid("Малыш", 8);
        Somebody somebody = new Somebody("кто-нибудь", 20);
        Roof roof = new Roof("крыша");
        HouseOnTheRoof house= new HouseOnTheRoof("домик на крыше");

        System.out.println();

        mother.ban(kid.flightWithKarlson(roof.onTheRoof()));
        PunctationMarks.COMMA.printPunctationMark();
        Unions.BUT.printUnion();
        kid.forget(Prepositins.ABOUTIT);
        Unions.AND.printUnion();
        kid.suprise();
        Unions.WOULD.printUnion();
        PunctationMarks.COMMA.printPunctationMark();
        Unions.IF.printUnion();
        Unions.WOULD.printUnion();
        somebody.remind(Prepositins.ABOUTIT);
        PunctationMarks.DOT.printPunctationMark();

        Heart heart = new Heart();
        System.out.println();

        kid.getUsedTo(kid.flightWithKarlson());
        Unions.AND.printUnion();
        kid.notAfraid();
        PunctationMarks.COMMA.printPunctationMark();
        Unions.AND.printUnion();
        heart.notCompressed(Prepositins.HIM);
        PunctationMarks.COMMA.printPunctationMark();
        Unions.WHEN.printUnion();
        kid.embrace(carlson.getName(), Prepositins.HANDS, Prepositins.BYTHENECK);
        Unions.AND.printUnion();
        kid.takeOff(Prepositins.UP, house.toTheHouse());
        PunctationMarks.DOT.printPunctationMark();

        System.out.println();

        Stockholm stockholm = new Stockholm("Стокгольм");
        SummerEvenings summerEvenings = new SummerEvenings();

        System.out.println();

        summerEvenings.canNotBe();
        PunctationMarks.COMMA.printPunctationMark();
        Unions.EXCEPT.printUnion();
        stockholm.getPlace();
        PunctationMarks.DOT.printPunctationMark();

        System.out.println();


        Nowhere nowhere = new Nowhere("Нигде в мире");
        Sky sky = new Sky();
        Light light = new Light();
        Dust dust = new Dust();

        System.out.println();

        sky.doesNotGlow(nowhere.toString(), light.specialLight());
        PunctationMarks.COMMA.printPunctationMark();
        System.out.print(nowhere.getName());
        dust.notToBe();
        PunctationMarks.COMMA.printPunctationMark();
        Unions.WHAT.printUnion();
        Seem.seem();
        PunctationMarks.DOT.printPunctationMark();
    }
}
