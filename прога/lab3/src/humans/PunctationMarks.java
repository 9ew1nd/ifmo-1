package humans;

public enum PunctationMarks{
    COMMA(","),
    DOT("."),
    SPACE(" ");

    private String punctationMark;
    PunctationMarks(String punctationMark){
        this.punctationMark = punctationMark;
    }

    public String getPunctationMark(){
        return punctationMark;
    }

    public void printPunctationMark(){
        if (getPunctationMark() == " "){
            System.out.print(" ");
        }
        else{
        System.out.print(getPunctationMark() + " ");
        }
    }
}
