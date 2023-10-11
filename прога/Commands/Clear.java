package Commands;

import DragonCollection.DragonCollection;

/** Класс команды clear, которая очищает коллекцию
 */
public class Clear implements Command{
    private DragonCollection collection;

    public Clear(DragonCollection collection){
        this.collection = collection;
    }

    /** Метод позволяет исполнить команду
     * @return String
     */
    @Override
    public String execute() {
        collection.clear();
        return null;
    }
}

