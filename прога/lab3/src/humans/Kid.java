package humans;

public class Kid extends Caracter implements Kidable{
    public Kid(String name, int age){
        super(name, age);
    }

    public String flightWithKarlson(){
        return "летать с Карлсоном ";
    }

    public String flightWithKarlson(Object object){
        return "летать с Карлсоном " + object;
    }

    public void forget(Prepositins thing){
        System.out.print(toString() + " совсем забыл " + thing.getPreposition() + " ");
    }

    public void suprise(){
        System.out.print(" искренне удивился ");
    }

    public void getUsedTo(Object object){ System.out.print(toString() + " привык " + object); }

    public void notAfraid(){ System.out.print(" совсем не боялся");}

    public void embrace(Object object, Prepositins thing1, Prepositins thing2){
        System.out.print(toString() + " обхватывал " + object + "а" + " " + thing1.getPreposition() + " " + thing2.getPreposition() + " ");
    }

    public void takeOff(Prepositins thing, Object object){
        System.out.print(" стремительно взлетал " + thing.getPreposition() + " " + object);
    }
}
