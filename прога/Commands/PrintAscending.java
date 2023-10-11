package Commands;

import Data.Dragon;
import DragonCollection.DragonCollection;

/** Класс команды print_ascending, которая позволяет
 * вывести элементы в порядке возрастания
 */
public class PrintAscending implements Command{
    private DragonCollection collection;

    public PrintAscending(DragonCollection collection){
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
