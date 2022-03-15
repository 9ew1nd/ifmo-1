package humans;

public enum Unions{
    BUT("но "),
    AND("и"),
    IF("если "),
    WOULD("бы"),
    WHEN("когда "),
    HOW("как "),
    WHAT("что "),
    EXCEPT("кроме ");

    private String union;
    Unions(String union){
        this.union = union;
    }

    public String getUnion(){
        return union;
    }

    public void printUnion(){
        System.out.print(getUnion());
    }
}
