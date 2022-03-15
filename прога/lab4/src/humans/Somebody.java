package humans;

public class Somebody extends Caracter{
    public Somebody(String name, int age){
        super(name, age);
    }

    public void remind(Prepositins thing){
        System.out.print(" " + getName() + " напомнил " + thing.getPreposition());
    }
}
