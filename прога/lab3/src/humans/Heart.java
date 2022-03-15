package humans;

public class Heart implements Heartable{
    public Heart(){
        System.out.println();
        System.out.println("Сердечко Малыша бьётся и не ёкает!");
    }
    public void notCompressed(Prepositins thing){
        System.out.print(toString() + thing.getPreposition()+ " не ёкало");
    }

    public void freeze(){
        System.out.print("сердце замерло");
    }

    public void beatFaster(){
        System.out.print("сердце учащённо билось");
    };

    @Override
    public String toString() {
        return " сердце ";
    }
}
