package Commands;

import java.util.*;

/** Класс команды history, которая позволяет
 * вывести последние 13 команд
 */
public class History{
    private Queue queue = new LinkedList();

    public History(){}

    /** Метод добавляет последнюю использованную
     * команду в очередь
     * @param s
     */
    public void update(String s){
        if (queue.size() < 13){
            queue.add(s);
        }
        else{
            queue.remove();
            queue.add(s);
        }
    }

    /** Метод позволяет распечатать очередь
     */
    public void printQueue() {
        for (Object item: queue
        ) {
            System.out.print(item + " ");
        }
        System.out.println();
    }
}