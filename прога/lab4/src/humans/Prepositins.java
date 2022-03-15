package humans;

public enum Prepositins {
    ABOUTIT("об этом"),
    HIM("у него"),
    HANDS("руками"),
    BYTHENECK("за шею"),
    UP("ввысь"),
    NOW("А сейчас");

    private String thing;
    Prepositins(String thing){
        this.thing = thing;
    }

    public String getPreposition(){
        return thing;
    }
}
