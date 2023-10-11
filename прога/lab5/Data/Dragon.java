package Data;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

/** Основоной класс, элементы которого хранятся в коллекции
 */
public class Dragon implements Comparable<Dragon>{
    private long id; //Значение поля должно быть больше 0, Значение этого поля должно быть уникальным, Значение этого поля должно генерироваться автоматически
    private String name; //Поле не может быть null, Строка не может быть пустой
    private Coordinates coordinates; //Поле не может быть null
    private java.time.LocalDateTime creationDate; //Поле не может быть null, Значение этого поля должно генерироваться автоматически
    private int age; //Значение поля должно быть больше 0
    private Float wingspan; //Значение поля должно быть больше 0, Поле не может быть null
    private double weight; //Значение поля должно быть больше 0
    private DragonCharacter character; //Поле не может быть null
    private DragonCave cave; //Поле может быть null

    static long counter = 1;


    public Dragon(String name, Coordinates coordinates,
                  LocalDateTime creationDate, int age,
                  Float wingspan, double weight, DragonCharacter character,
                  DragonCave cave){
        this.id = counter++;
        this.name = name;
        this.coordinates = coordinates;
        this.creationDate = creationDate;
        this.age = age;
        this.wingspan = wingspan;
        this.weight = weight;
        this.character = character;
        this.cave = cave;
    }

    public Dragon(String name, Coordinates coordinates,
                  LocalDateTime creationDate, int age,
                  Float wingspan, double weight, DragonCharacter character){
        this.id = counter++;
        this.name = name;
        this.coordinates = coordinates;
        this.creationDate = creationDate;
        this.age = age;
        this.wingspan = wingspan;
        this.weight = weight;
        this.character = character;
    }

    public Dragon(long id, String name, Coordinates coordinates,
                  LocalDateTime creationDate, int age,
                  Float wingspan, double weight, DragonCharacter character,
                  DragonCave cave){
        this.id = counter++;
        this.name = name;
        this.coordinates = coordinates;
        this.creationDate = creationDate;
        this.age = age;
        this.wingspan = wingspan;
        this.weight = weight;
        this.character = character;
        this.cave = cave;
    }

    public Dragon(long id, String name, Coordinates coordinates,
                  LocalDateTime creationDate, int age,
                  Float wingspan, double weight, DragonCharacter character){
        this.id = counter++;
        this.name = name;
        this.coordinates = coordinates;
        this.creationDate = creationDate;
        this.age = age;
        this.wingspan = wingspan;
        this.weight = weight;
        this.character = character;
    }

    /** Возвращает уникальный номер объекта
     * @return Long
     */
    public long getId(){
        return id;
    }

    /** Вовзращает возраст объекта
     * @return int
     */
    public int getAge(){return age;}

    /** Вовзращает имя объекта
     * @return String
     */
    public String getName(){return name;}

    /** Вовзращает время создания объекта
     * @return LocalDateTime
     */
    public LocalDateTime getCreationDate(){return creationDate;}

    /** Вовзращает координату X объекта
     * @return double
     */
    public double get_X(){return coordinates.getX();}

    /** Вовзращает координату Y объекта
     * @return Long
     */
    public Long get_Y(){return coordinates.getY();}

    /** Вовзращает размах крыльев объекта
     * @return Float
     */
    public Float getWingspan(){return wingspan;}

    /** Вовзращает вес объекта
     * @return double
     */
    public double getWeight(){return weight;}

    /** Вовзращает тип персонажа объекта
     * @return DragonCharacter
     */
    public DragonCharacter getCharacter(){return character;}

    /** Вовзращает глубину пещеры объекта
     * @return Long
     */
    public Long getDepth(){return cave.getDepth();}

    /** Вовзращает информацию об объекте в формате строки
     * @return String
     */
    public String toString(){
        if (cave == null){
            String info = "id: " + id + ", name: " + name +
                    ", coordinates: (" + coordinates.getX() + ", " + coordinates.getY()  + "), creationDate: " +
                    creationDate.format(DateTimeFormatter.ofPattern("d.MM.uuuu HH:mm:ss")) +
                    ", age: " + age + ", wingspan: " + wingspan + ", weight: " + weight +
                    ", character: " + character + ", cave: null";
            return info;
        }
        else{
            String info = "id: " + id + ", name: " + name +
                    ", coordinates: (" + coordinates.getX() + ", " + coordinates.getY()  + "), creationDate: " +
                    creationDate.format(DateTimeFormatter.ofPattern("d.MM.uuuu HH:mm:ss")) +
                    ", age: " + age + ", wingspan: " + wingspan + ", weight: " + weight +
                    ", character: " + character + ", cave depth: " + cave.getDepth();
            return info;
        }
    }

    /** Метод для сравнения двух объектов
     * @param dragon
     * @return int
     */
    @Override
    public int compareTo(Dragon dragon){
        return Long.compare(id, dragon.getId());
        }
}
