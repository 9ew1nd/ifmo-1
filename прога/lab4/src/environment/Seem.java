package environment;

import humans.PunctationMarks;
import humans.Unions;

public class Seem{
    public static String reflect(){
        return " отражённые в блеклых водах залива";
    }
    public static void seem(){
        System.out.print(City.getName() + " " + Unions.AND.getUnion() + " " + Sky.getName()
                + PunctationMarks.COMMA.getPunctationMark() + reflect() + PunctationMarks.COMMA.getPunctationMark()
                + " кажутся совсем сказочными");
    }
}
