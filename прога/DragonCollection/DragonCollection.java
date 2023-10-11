package DragonCollection;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.TreeSet;
import Data.Dragon;

/** Класс хранящий коллекцию
 */
public class DragonCollection{
    private TreeSet<Dragon> collection;
    private LocalDateTime initDate;

    public DragonCollection(TreeSet<Dragon> collection, LocalDateTime initDate) {
        this.collection = collection;
        this.initDate = initDate;
    }

    /** Метод позволяющий получить информацию о коллекции
     * @return String
     */
    public String info() {
        return  "Тип коллекции: " + collection.getClass() +
                "\nДата инициализации: " + initDate.format(DateTimeFormatter.ofPattern("d.MM.uuuu")) +
                "\nКоличество элементов: " + collection.size();}

    /** Вывод коллекции на экран
     */
    public void show(){
        if (collection.isEmpty()){
            System.out.println("Коллекция пуста!");
        }
        else{
        for (Dragon item: collection) {
            System.out.println(item.toString());
            }
        }
    }

    /** Вывод коллекции на экран в обратном порядке
     */
    public void reverseShow(){
        if (collection.isEmpty()){
            System.out.println("Коллекция пуста!");
        }
        else{
            TreeSet<Dragon> descending = (TreeSet<Dragon>) collection.descendingSet();
            for (Dragon item: descending) {
                System.out.println(item.toString());
            }
        }
    }

    /** Метод позволяющий добавить элеменет в коллекцию
     * @param dragon
     */
    public void add(Dragon dragon){
        collection.add(dragon);
    }

    /** Метод позволяющий удалить элемент по id
     * @param id
     */
    public void removeById(Long id) {
        collection.removeIf(unhappy -> unhappy.getId() == id);
    }

    /** Метод проверяющий содержится ли элемент с таким id
     * в коллекции
     * @param id
     * @return bool
     */
    public boolean containsById(Long id){
        boolean flag = false;
        for (Dragon chekable: collection){
            if (chekable.getId() == id){
                return true;
            }
        }
        return flag;
    }

    /** Метод очищающий коллекцию
     */
    public void clear(){
        collection.clear();
        System.out.println("Коллекция очищена");
    }

    /**Позволяет найти минимальный возраст в коллекции
     * @return int
     */
    public int minAge(){
        int minAge = 2^31 - 1;
        for (Dragon dragon: collection){
            if (dragon.getAge() < minAge){
                minAge = dragon.getAge();
            }
        }
        return minAge;
    }

    /** Поиск элементов, у которых имя начинается с заданной подстроки
     * @param name
     */
    public void filter(String name){
        int cnt = 0;
        for (Dragon dragon: collection){
            if (dragon.getName().startsWith(name)){
                System.out.println(dragon.toString());
                cnt ++;
            }
        }
            System.out.println(String.format("Всего найдено %d совпадений", cnt));
    }

    /** Метод возвращает коллекцию
     * @return DragonCollection
     */
    public TreeSet<Dragon> getCollection(){
        return collection;
    }

}
