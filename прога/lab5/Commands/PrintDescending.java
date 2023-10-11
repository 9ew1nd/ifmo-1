package Commands;

import Data.Dragon;
import DragonCollection.DragonCollection;

/** Класс команды print_descending, которая позволяет
 * вывести элементы в порядке убывания
 */
public class PrintDescending implements Command{
    private DragonCollection collection;

    public PrintDescending(DragonCollection collection){
        this.collection = collection;
    }

    /** Метод позволяет исполнить команду
     * @return String
     */
    @Override
    public String execute() {
        collection.reverseShow();
        return null;
    }
}
