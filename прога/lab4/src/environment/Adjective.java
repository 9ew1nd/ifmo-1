package environment;

public enum Adjective {
    CLEAR("ясными"),
    TRANSPARENT("прозрачными"),
    BLUE("синими"),
    FABULOUS("сказочными");

    private String adjective;
    Adjective(String adjective){this.adjective = adjective;}
    public String getAdjective(){
        return adjective;
    }
}
