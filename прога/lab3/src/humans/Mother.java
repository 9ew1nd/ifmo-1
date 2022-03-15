package humans;

import java.lang.reflect.Method;

public class Mother extends Caracter{
    public Mother(String name, int age){
        super(name, age);
    }

    public void ban(Object object){
        System.out.print(getName() + " не разрешала " + object);
    }
}
