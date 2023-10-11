import java.io.*;
import java.time.LocalDateTime;
import java.util.TreeSet;

import Commands.*;
import Data.Dragon;
import DragonCollection.DragonCollection;
import Utils.Utils;
import org.xml.sax.SAXException;

/** Главный класс программы
 */
public class Main {
    public static void main(String[] args) throws IOException, SAXException {
        DragonCollection collection = new DragonCollection(new TreeSet<Dragon>(), LocalDateTime.now());
        Commander commander = new Commander(collection);
        commander.start();
    }

}
