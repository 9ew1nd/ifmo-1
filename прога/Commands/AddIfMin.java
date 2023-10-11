package Commands;

import DragonCollection.DragonCollection;
import Data.Coordinates;
import Data.Dragon;
import Data.DragonCave;
import Data.DragonCharacter;
import Utils.Utils;

import java.time.LocalDateTime;
import java.util.Scanner;

/** Класс команды add_if_min, которая добавляет
 * элемент в коллекцию, если его возраст минимальный
 */
public class AddIfMin implements Command {
    DragonCollection collection;
    String name = null;
    double x = 0;
    long y = 0;
    int age = 0;
    float wingspan = 0;
    double weight = 0;
    DragonCharacter character = null;
    long caveDepth = 0;
    boolean nullCaveFlag = false;
    int minAge;

    public AddIfMin(DragonCollection collection) {
        this.collection = collection;
        this.minAge = collection.minAge();
    }

    /** Метод позволяет исполнить команду
     * @return String
     */
    @Override
    public String execute(){
        String[] values = {"имя", "координаты", "возраст",
                "размах крыльев", "вес", "персонажа", "глубину пещеры"};

        Scanner scanner = new Scanner(System.in);
        boolean flag = false;

        for (String value : values) {
            switch (value) {
                case "имя":
                    boolean name_flag = false;
                    while (!name_flag){
                        System.out.print("Введите " + value + ": ");
                        name = scanner.nextLine();
                        if (name == null || name.trim().isEmpty()){
                            System.out.println("Некорректный ввод. Строка не может быть пустой.");
                        }
                        else{
                            name_flag = true;
                        }
                    }
                    break;
                case "координаты":
                    System.out.println("Введите " + value);
                    boolean x_flag = false;
                    while (!x_flag){
                        System.out.print("Введите x: ");
                        String x_str = scanner.nextLine();
                        if (Utils.isDouble(x_str)){
                            x = Double.parseDouble(x_str);
                            x_flag = true;
                        }
                        else{
                            System.out.println("Некорректный ввод. Ожидалось вещественное значение.");
                        }
                    }

                    boolean y_flag = false;
                    while (!y_flag){
                        System.out.print("Введите y: ");
                        String y_str = scanner.nextLine();
                        if (Utils.isLong(y_str) && Long.parseLong(y_str) <= 565){
                            y = Long.parseLong(y_str);
                            y_flag = true;
                        }
                        else{
                            System.out.println("Некорректный ввод. Ожидалось вещественное значение, меньшее 565.");
                        }
                    }
                    break;
                case "возраст":
                    boolean age_flag = false;
                    while (!age_flag){
                        System.out.print("Введите " + value + ": ");
                        String str_Age = scanner.nextLine();
                        if (Utils.isInt(str_Age) && Integer.parseInt(str_Age) > 0){
                            age = Integer.parseInt(str_Age);
                            age_flag = true;
                        }
                        else{
                            System.out.println("Возраст не может быть отрицательным, нулевым или равным " +
                                    "буквенному символу!");
                        }
                    }
                    break;
                case "размах крыльев":
                    boolean wng_flag = false;
                    while (!wng_flag){
                        System.out.print("Введите " + value + ": ");
                        String str_Wng = scanner.nextLine();
                        if (Utils.isFloat(str_Wng) && Float.parseFloat(str_Wng) > 0){
                            wingspan = Float.parseFloat(str_Wng);
                            wng_flag = true;
                        }
                        else{
                            System.out.println("Размах крыльев должен быть равен числу, которое " +
                                    "больше нуля!");
                        }
                    }
                    break;
                case "вес":
                    boolean weight_flag = false;
                    while (!weight_flag){
                        System.out.print("Введите " + value + ": ");
                        String str_Weight = scanner.nextLine();
                        if (Utils.isDouble(str_Weight) && Double.parseDouble(str_Weight) > 0){
                            weight = Double.parseDouble(str_Weight);
                            weight_flag = true;
                        }
                        else{
                            System.out.println("Вес не может быть меньше нуля, равным нулю или равняться" +
                                    " буквенному символу!");
                        }
                    }
                    break;
                case "персонажа":
                    String ans = "(";
                    DragonCharacter[] dc = DragonCharacter.values();
                    for (int i = 0; i < dc.length; i++){
                        if (i != (dc.length - 1)){
                            ans += dc[i];
                            ans += ", ";}
                        else{
                            ans += dc[i] + ")";
                        }
                    }
                    boolean chr_flag = false;
                    while (!chr_flag){
                        System.out.print("Введите " + value + ans + ": ");
                        String input_ = scanner.nextLine();
                        switch(input_){
                            case "CUNNING":
                                character = DragonCharacter.CUNNING;
                                chr_flag = true;
                                break;
                            case "GOOD":
                                character = DragonCharacter.GOOD;
                                chr_flag = true;
                                break;
                            case "CHAOTIC":
                                character = DragonCharacter.CHAOTIC;
                                chr_flag = true;
                                break;
                            case "FICKLE":
                                character = DragonCharacter.FICKLE;
                                chr_flag = true;
                                break;
                            default:
                                System.out.println("Такого персонажа нет!");
                        }
                    }
                    break;
                case "глубину пещеры":
                    boolean cave_flag = false;
                    while (!cave_flag){
                        System.out.print("Введите " + value + ": ");
                        String str_Depth = scanner.nextLine();
                        if (str_Depth == null || str_Depth.trim().isEmpty()){
                            nullCaveFlag = true;
                            cave_flag = true;
                        }
                        else if (Utils.isLong(str_Depth)){
                            caveDepth = Long.parseLong(str_Depth);
                            cave_flag = true;
                        }
                        else{
                            System.out.println("Неправильный формат введённых данных!");
                        }
                    }
                    break;
            }
        }

        System.out.println("Данные записаны. Идёт проверка условия.");
        if (age < minAge){
            System.out.println("Возраст меньше, чем минимальный в коллекции, создание разрешено.");
            if (!nullCaveFlag){
                Dragon dragon = new Dragon(name, new Coordinates(x, y),
                        LocalDateTime.now(), age,
                        wingspan, weight, character, new DragonCave(caveDepth));
                collection.add(dragon);
            }
            else{
                Dragon dragon = new Dragon(name, new Coordinates(x, y),
                        LocalDateTime.now(), age,
                        wingspan, weight, character);
                collection.add(dragon);
            }
            System.out.println("Объект создан!");

        }
        else{
            System.out.println("Возраст дракона больше минимального возраста в коллекции\nВ создании отказано");
        }
        return null;
    }
}