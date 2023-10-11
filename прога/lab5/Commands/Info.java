package Commands;

import DragonCollection.DragonCollection;

/** Класс команды info, которая выводит информацию о коллекции
 */
public class Info implements Command{
    private DragonCollection collection;
    public Info (DragonCollection collection){
        this.collection = collection;
    }

    /** Метод позволяет исполнить команду
     * @return String
     */
    @Override
    public String execute(){
        System.out.println(collection.info());
        return null;
    }
}
