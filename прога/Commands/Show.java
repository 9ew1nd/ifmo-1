package Commands;

import DragonCollection.DragonCollection;

/** Класс команды show, которая позволяет
 * вывести объекты коллекции
 */
public class Show implements Command{
    private DragonCollection collection;

    public Show(DragonCollection collection){
        this.collection = collection;
    }

    /** Метод позволяет исполнить команду
     * @return String
     */
    @Override
    public String execute() {
        collection.show();
        return null;
    }
}