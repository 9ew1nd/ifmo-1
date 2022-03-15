package locations;

public class House extends Location{
    public House(String name){
        super(name);
    }
    Kitchen kitchen = new Kitchen();
    public static class Kitchen{
        public static String inTheKitchen(){
            return "в кухню";
        }
    }


}
