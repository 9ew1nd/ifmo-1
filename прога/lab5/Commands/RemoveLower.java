package Commands;

import DragonCollection.DragonCollection;

/** Класс команды remove_lower, который позволяет
 * удалить объект с наименьшим id
 */
public class RemoveLower implements Command{
    private DragonCollection collection;
    private long id;

    public RemoveLower(DragonCollection collection, long id){
        this.collection = collection;
        this.id = id;
    }
    /** Метод позволяет исполнить команду
     * @return String
     */
    @Override
    public String execute(){
        for (long i = 1; i < id; i++){
            if (collection.containsById(i)){
                collection.removeById(i);
        }
        }
        return "Удаление завершено!";
    }
}
