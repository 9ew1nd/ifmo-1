package Commands;

import javax.xml.parsers.ParserConfigurationException;

/** Интерфейс команды
 */
public interface Command {

    /** Метод позволяет исполнить команду
     * @return String
     */
    public String execute() throws ParserConfigurationException;
}
