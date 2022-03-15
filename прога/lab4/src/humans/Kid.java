package humans;

public class Kid extends Caracter implements Kidable{
    public Kid(String name, int age){
        super(name, age);
        Heart heart = new Heart();
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

    public void getThrough(Object object){
        System.out.print(toString() + " пробрался " + object + " ");
    }

    public void returned(){
        class Bread{
            private String loadedWithRolls(){
                return "нагруженный булочками";
            }
        }
        Bread bread = new Bread();
        System.out.print(" вернулся" + PunctationMarks.COMMA.getPunctationMark() + " " + bread.loadedWithRolls());
    }

    // определяем нон-статик класс сердце
    private class Heart{
        public Heart(){
            System.out.println("Сердечко Малыша бьётся и не ёкает!");
        }
        public Heart(boolean bool){}

        public void notCompressed(Prepositins thing){
            System.out.print(" сердце " + thing.getPreposition()+ " не ёкало");
    }
    }
    public void kidsHeart(){
        Heart heart = new Heart(true);
        heart.notCompressed(Prepositins.HIM);
    }
}
