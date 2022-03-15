package humans;

import java.lang.reflect.Method;

public class Mother extends Caracter{
    public Mother(String name, int age){
        super(name, age);
    }

    public Mother(String name){super(name); }

    public void ban(Object object){
        System.out.print(getName() + " не разрешала " + object);
    }

    public interface Givable{
        public String give();
    }

    Givable givable = new Givable() {
        @Override
        public String give(){
            return "давать Карлсону булочку-другую в случае необходимости";
        }
    };
    public void allow(){
        System.out.print(toString() + " разрешила ему " + givable.give());
    }
}
