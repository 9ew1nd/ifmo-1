package humans;

public class Need{
    public Need(){
        System.out.println("Появляется необходимость в этом, однако...");
    }
    public void need(){
        System.out.print(Prepositins.NOW.getPreposition() + "необходимость в этом была");
    }
}
