package Commands;

import DragonCollection.DragonCollection;
import Utils.Utils;

import javax.xml.parsers.ParserConfigurationException;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.HashSet;

/** Класс команды execute_script, которая позволяет
 * запустить скрипт из файла
 */
public class ExecuteScript implements Command{
    String fileName;
    DragonCollection collection;

    public ExecuteScript(String file, DragonCollection collection){
        this.fileName = file;
        this.collection = collection;
    }

    /** Метод позволяет исполнить команду
     * @return String
     */
    @Override
    public String execute() {
        try (FileInputStream fin = new FileInputStream(fileName)) {
            String text = "";
            int i;
            while ((i = fin.read()) != -1) {
                text += Character.toString((char) i);
            }
            HashSet<String> files = new HashSet<>();
            files.add(fileName);
            String[] arr = text.split("\n");
            for (String str: arr
            ) {
                String[] split = str.trim().split(" ");
                switch (split[0]) {
                    case "help":
                        Help help = new Help();
                        help.execute();
                        break;

                    case "info":
                        Info info = new Info(collection);
                        info.execute();
                        break;

                    case "show":
                        Show show = new Show(collection);
                        show.execute();
                        break;

                    case "add":
                        Add add = new Add(collection);
                        add.execute();
                        break;

                    case "remove_by_id":
                        if (split.length == 2 && Utils.isLong(split[1])){
                            RemoveById remove = new RemoveById(collection, Long.parseLong(split[1]));
                            System.out.println(remove.execute());}
                        else{
                            System.out.println("Неверный id! Значение должно быть положительным");
                        }
                        break;

                    case "clear":
                        Clear clear = new Clear(collection);
                        clear.execute();
                        break;

                    case "save":
                        Save save = new Save(collection);
                        try{
                            save.execute();}
                        catch (ParserConfigurationException e) {
                            System.out.println("Ошибка парсинга");
                        }
                        break;

                    case "execute_script":
                        if (files.contains(split[1])){
                        System.out.println("Бесконечный цикл исполнения скриптов. Пропуск команды");
                    }else{
                        ExecuteScript exe= new ExecuteScript(split[1], collection);
                        exe.execute();}
                        break;
                    case "add_if_min":
                        AddIfMin addIfMin = new AddIfMin(collection);
                        addIfMin.execute();
                        break;
                    case "remove_lower":
                        if (split.length == 2 && Utils.isLong(split[1])){
                            RemoveLower removeLower = new RemoveLower(collection, Long.parseLong(split[1]));
                            System.out.println(removeLower.execute());}
                        else{
                            System.out.println("Неверный id! Значение должно быть положительным");
                        }
                        break;
                    case "filter_starts_with_name":
                        if (!(split[1] == null || split[1].trim().isEmpty())){
                            FilterStartsWithName filter = new FilterStartsWithName(collection, split[1]);
                            filter.execute();}
                        else{
                            System.out.println("Некорректное имя");
                        }
                        break;
                    case "print_ascending":
                        PrintAscending print = new PrintAscending(collection);
                        print.execute();
                        break;
                    case "print_descending":
                        PrintDescending reverse = new PrintDescending(collection);
                        reverse.execute();
                        break;
                    case "update":
                        if (split.length == 2 && Utils.isLong(split[1])){
                            UpdateId update = new UpdateId(collection, Long.parseLong(split[1]));
                            update.execute();}
                        else{
                            System.out.println("Неверный id! Значение должно быть положительным");
                        }
                        break;
                    default:
                        System.out.println("Неизвестная команда! Введите help, чтобы ознакомиться со списком команд.");
                }
            }
        } catch (IOException ex) {
            System.out.println("Ошибка" + ex.getMessage());
        }
        return null;
    }
}
