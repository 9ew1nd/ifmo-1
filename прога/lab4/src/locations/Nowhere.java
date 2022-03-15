package locations;

public class Nowhere extends Location{
    public Nowhere(String name){
        super(name);
    }

    public String getName(){
        String[] subStr = toString().split(" ");
        return subStr[0].replace('Н', 'н');
    }
}
