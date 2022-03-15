package environment;

public class Sky{
    private static String name = "небо";
    public static String getName(){
        return name;
    }
    public void doesNotGlow(Object object1, Object object2){
        System.out.print(object1 + " небо не светится " + object2);
    }
}
