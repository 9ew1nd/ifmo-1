import locations.*;
import humans.*;
import environment.*;

import java.lang.IllegalArgumentException;

public class Main{
    public static void main(String[] args){
        try{
        Carlson carlson = new Carlson("Карлсон", 29);
        Mother mother  = new Mother("Мама");
        mother.setAge(40);
        Kid kid = new Kid("Малыш", 8);
        Somebody somebody = new Somebody("кто-нибудь", 20);
        Roof roof = new Roof("крыша");
        HouseOnTheRoof houseOnTheRoof = new HouseOnTheRoof("домик на крыше");
        House house = new House("дом");
        House.Kitchen kitchen = new House.Kitchen();
        System.out.println();

        kid.getThrough(kitchen.inTheKitchen());
        Unions.AND.printUnion();
        kid.returned();
        PunctationMarks.DOT.printPunctationMark();

        System.out.println();
        mother.allow();
        PunctationMarks.DOT.printPunctationMark();
        System.out.println();

        Need need = new Need();

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

        System.out.println();

        kid.getUsedTo(kid.flightWithKarlson());
        Unions.AND.printUnion();
        kid.notAfraid();
        PunctationMarks.COMMA.printPunctationMark();
        Unions.AND.printUnion();
        kid.kidsHeart();
        PunctationMarks.COMMA.printPunctationMark();
        Unions.WHEN.printUnion();
        kid.embrace(carlson.getName(), Prepositins.HANDS, Prepositins.BYTHENECK);
        Unions.AND.printUnion();
        kid.takeOff(Prepositins.UP, houseOnTheRoof.toTheHouse());
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
        PunctationMarks.DOT.printPunctationMark();}
        catch(AgeException ex){
                System.out.println(ex.getMessage());
            }
        catch(IllegalArgumentException ex){
            System.out.println(ex.getMessage());
        }
        finally {
            EndOfStory end = new EndOfStory();
            end.theEnd();
        }
    }
}
