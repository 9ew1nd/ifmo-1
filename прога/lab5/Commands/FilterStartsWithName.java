package Commands;

import DragonCollection.DragonCollection;

/** Класс команды filter_statrs_with_name, которая находит
 * элементы с именем, начинающимся с заданной подстроки
 */
public class FilterStartsWithName implements Command{
    private DragonCollection collection;
    private String name;

    public FilterStartsWithName(DragonCollection collection, String name){
        this.collection = collection;
        this.name = name;
    }

    /** Метод позволяет исполнить команду
     * @return String
     */
    @Override
    public String execute(){
        collection.filter(name);
        return null;
    }
}
