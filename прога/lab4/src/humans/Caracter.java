package humans;

public abstract class Caracter{
    private String name;
    private int age = 20;

    public Caracter(String name, int age){
        this.name = name;
        this.age = age;
        System.out.printf("Персонаж %s создан!", name);
        System.out.println();
    }

    public Caracter(String name){
        this.name = name;
    }
    public void setName(){
        this.name = name;
    }

    public void setAge(int age) throws AgeException{
        if (age<1) throw new AgeException("Неверный формат данных!");
        this.age = age;
    }

    public String getName(){
        return name;
    }

    public int getAge(){
        return age;
    }

    public void birthday(){
        age++;
    }

    public String say(String phrase){
        return phrase;
    }

    public String sleep(){
        return getName() + "спит";
    }

    public String wakeUp(){
        return getName() + "проснулся";

    }
    @Override
    public String toString() {
        return name;
    }

    @Override
    public int hashCode(){
        return hashCode() * 10 + 15;
    }

    @Override
    public boolean equals(Object obj) {

        if (!(obj instanceof Caracter)) return false;
        Caracter p = (Caracter) obj;
        return this.name.equals(p.name);
    }
}
