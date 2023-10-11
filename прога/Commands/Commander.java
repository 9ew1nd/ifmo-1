package Commands;

import Data.Coordinates;
import Data.Dragon;
import Data.DragonCave;
import Data.DragonCharacter;
import DragonCollection.DragonCollection;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.time.LocalDateTime;
import java.util.Scanner;
import Utils.Utils;
import org.w3c.dom.Document;
import org.w3c.dom.NamedNodeMap;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;

/** Класс отвечающий за выполнение команд
 */
public class Commander {
    private DragonCollection collection;
    public Commander(DragonCollection collection){
        this.collection = collection;
    }

    /** Метод запускающий работу приложения
     * @throws IOException
     * @throws SAXException
     */
    public void start() throws IOException, SAXException {

        try{
        File file = new File("data.xml");
        DocumentBuilder db = DocumentBuilderFactory.newInstance().newDocumentBuilder();
        Document doc = db.parse(file);
        Node dragons = doc.getFirstChild();
        NodeList dragonsList = dragons.getChildNodes();
        String name = null;
        for (int i = 0; i < dragonsList.getLength(); i++) {

            long id;
            double x = 0;
            long y = 0;
            LocalDateTime creationdate = null;
            int age = 0;
            Float wingspan = 0f;
            double weight = 0;
            DragonCharacter character = null;
            long depth = 0;
            if (dragonsList.item(i).getNodeType() == Node.ELEMENT_NODE) {
                NamedNodeMap al = dragonsList.item(i).getAttributes();
                id = Long.parseLong(al.item(0).getTextContent());
                NodeList dragonFields = dragonsList.item(i).getChildNodes();

                for (int j = 0; j < dragonFields.getLength(); j++) {
                    switch (dragonFields.item(j).getNodeName()) {
                        case "name": {
                            String name_ = dragonFields.item(j).getTextContent();
                            if (name_ == null) {
                                System.out.println("Имени нет");
                                name = "1";
                            } else {
                                name = name_;
                            }
                            break;
                        }
                        case "coordinates": {
                            NodeList dragonCoord = dragonFields.item(j).getChildNodes();
                            for (int k = 0; k < dragonCoord.getLength(); k++) {
                                if (dragonCoord.item(k).getNodeType() == Node.ELEMENT_NODE) {
                                    switch (dragonCoord.item(k).getNodeName()) {
                                        case "coord_X": {
                                            x = Double.parseDouble(dragonCoord.item(k).getTextContent());
                                            break;
                                        }
                                        case "coord_Y": {
                                            if (dragonCoord.item(k).getTextContent() == null) {
                                                System.out.println("Неверное значение Y");
                                                y = 0;
                                            } else if (Long.parseLong(dragonCoord.item(k).getTextContent()) >= 565) {
                                                System.out.println("Превышение верхней границы");
                                                y = 0;
                                            } else {
                                                y = Long.parseLong(dragonCoord.item(k).getTextContent());
                                            }
                                            break;
                                        }
                                    }
                                }

                            }
                            break;
                        }
                        case "creation_date": {
                            if (dragonFields.item(j).getTextContent() == null) {
                                System.out.println("Отсутствует дата создания");
                                creationdate = LocalDateTime.now();
                            } else {
                                creationdate = LocalDateTime.parse(dragonFields.item(j).getTextContent());
                            }
                            break;
                        }
                        case "age": {
                            if (dragonFields.item(j).getTextContent() == null) {
                                System.out.println("Возраст не указан");
                                age = 1;
                            } else if (Integer.parseInt(dragonFields.item(j).getTextContent()) <= 0) {
                                System.out.println("Возраст отрицательный");
                                age = 1;
                            } else {
                                age = Integer.parseInt(dragonFields.item(j).getTextContent());
                            }
                            break;
                        }
                        case "wingspan": {
                            if (dragonFields.item(j).getTextContent() == null) {
                                System.out.println("Размах крыльев не указан");
                                wingspan = 1f;
                            } else if (Float.parseFloat(dragonFields.item(j).getTextContent()) <= 0) {
                                System.out.println("Размах крыльев отрицательный");
                                wingspan = 1f;
                            } else {
                                wingspan = Float.parseFloat(dragonFields.item(j).getTextContent());
                            }
                            break;
                        }
                        case "weight": {
                            if (dragonFields.item(j).getTextContent() == null) {
                                System.out.println("Вес не указан");
                                weight = 1;
                            } else if (Double.parseDouble(dragonFields.item(j).getTextContent()) <= 0) {
                                System.out.println("Вес отрицательный");
                                weight = 1;
                            } else {
                                weight = Double.parseDouble(dragonFields.item(j).getTextContent());
                            }
                            break;
                        }
                        case "character": {
                            switch (dragonFields.item(j).getTextContent()) {
                                case "CUNNING": {
                                    character = DragonCharacter.CUNNING;
                                    break;
                                }
                                case "GOOD": {
                                    character = DragonCharacter.GOOD;
                                    break;
                                }
                                case "CHAOTIC": {
                                    character = DragonCharacter.CHAOTIC;
                                    break;
                                }
                                case "FICKLE": {
                                    character = DragonCharacter.FICKLE;
                                    break;
                                }
                                default: {
                                    System.out.println("Неверное имя персонажа");
                                    character = DragonCharacter.GOOD;
                                    break;
                                }
                            }

                            break;
                        }
                        case "cave": {
                            depth = Long.parseLong(dragonFields.item(j).getTextContent().trim());
                            break;
                        }
                    }
                }
                Dragon dragon = new Dragon(id, name, new Coordinates(x, y),
                        creationdate, age,
                        wingspan, weight, character, new DragonCave(depth));
                collection.add(dragon);
            }
        }}
        catch (ParserConfigurationException e) {
            System.err.println("Ошибка средства парсинга.");}
        catch (FileNotFoundException e) {
            System.err.println("Файл не найден.");
        }
        catch (IOException e) {
            System.err.println("Ошибка доступа к файлу.");}
        catch (SAXException e) {
            System.err.println(" Нельзя выполнить парсинг. Файл должен быть в формате .xml");}

        History history = new History();
        Scanner input = new Scanner(System.in);
        String command;

        System.out.println("Вы запустили консольное приложение, введите команду (ознакомиться со списком команд \"help\")");
        command = input.nextLine();
        while (!command.equals("exit")) {
            String[] split = command.split(" ");
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
                    ExecuteScript exe= new ExecuteScript(split[1], collection);
                    exe.execute();
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
                case "history":
                    history.printQueue();
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
            history.update(split[0]);
            command = input.nextLine();
        }
        System.out.println("Вы вышли из консольного приложения.");
    }
}