package locations;

public class Stockholm extends Location{
    public Stockholm(String name){
        super(name);
    }

    public void getPlace(){
        System.out.print(toString() + "a");
    }
}
