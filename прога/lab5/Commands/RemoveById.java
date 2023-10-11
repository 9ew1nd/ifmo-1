package Commands;

import DragonCollection.DragonCollection;

/** Класс команды remove_by_id, которая позволяет
 * удалить элемент по id
 */
public class RemoveById implements Command{
    private DragonCollection collection;
    private long id;

    public RemoveById(DragonCollection collection, long id){
        this.collection = collection;
        this.id = id;
    }
    /** Метод позволяет исполнить команду
     * @return String
     */
    @Override
    public String execute(){
        if (collection.containsById(id)){
            collection.removeById(id);
            return "Удаление завершено!";
        }
        else{
            return "Такого id нет в коллекции!";
        }
    }
}
