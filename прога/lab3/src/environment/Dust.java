package environment;

import humans.PunctationMarks;

public class Dust{
    public void notToBe(){
        System.out.print(" сумерки не бывают ");
        Adjective[] arrayAdj = {Adjective.CLEAR, Adjective.TRANSPARENT, Adjective.BLUE};
        for (int i = 0; i < 3; i++){
            System.out.print("такими " + arrayAdj[i].getAdjective());
            if (i<2){
                System.out.print(PunctationMarks.COMMA.getPunctationMark());
                System.out.print(" ");
            }
        }
    }
}
