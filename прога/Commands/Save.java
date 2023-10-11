package Commands;

import Data.Dragon;
import DragonCollection.DragonCollection;
import org.w3c.dom.DOMImplementation;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Text;
import org.w3c.dom.ls.DOMImplementationLS;
import org.w3c.dom.ls.LSSerializer;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import java.io.BufferedOutputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.charset.StandardCharsets;

/** Класс команды save, которая позволяет
 * сохранить коллекцию в файл
 */
public class Save implements Command{
    DragonCollection collection;

    public Save(DragonCollection collection){
        this.collection = collection;
    }

    /** Метод позволяет исполнить команду
     * @return String
     */
    @Override
    public String execute() throws ParserConfigurationException {
        DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
        DocumentBuilder builder =  factory.newDocumentBuilder();
        Document document = builder.newDocument();
        Element dragons = document.createElement("dragons");
        document.appendChild(dragons);

        for (Dragon dr: collection.getCollection()
             ) {
            // создаём и добавляем нужные ноды
            Element dragon = document.createElement("dragon");
            Element name = document.createElement("name");
            Element coordinates = document.createElement("coordinates");
            Element coordX = document.createElement("coord_X");
            Element coordY = document.createElement("coord_Y");
            Element createdate = document.createElement("creation_date");
            Element age = document.createElement("age");
            Element wingspan = document.createElement("wingspan");
            Element weight = document.createElement("weight");
            Element character = document.createElement("character");
            Element cave = document.createElement("cave");
            Element depth = document.createElement("depth");
            dragons.appendChild(dragon);
            dragon.setAttribute("id", String.valueOf(dr.getId()));
            dragon.appendChild(name);
            dragon.appendChild(coordinates);
            dragon.appendChild(createdate);
            dragon.appendChild(age);
            dragon.appendChild(wingspan);
            dragon.appendChild(weight);
            dragon.appendChild(character);
            dragon.appendChild(cave);


            Text name_ = document.createTextNode(dr.getName());
            Text xCord = document.createTextNode(String.valueOf(dr.get_X()));
            Text yCord = document.createTextNode(String.valueOf(dr.get_Y()));
            Text cr = document.createTextNode(String.valueOf(dr.getCreationDate()));
            Text age_ = document.createTextNode(String.valueOf(dr.getAge()));
            Text wingspan_ = document.createTextNode(String.valueOf(dr.getWingspan()));
            Text weight_ = document.createTextNode(String.valueOf(dr.getWeight()));
            Text char_ = document.createTextNode(String.valueOf(dr.getCharacter()));
            Text depth_ = document.createTextNode(String.valueOf(dr.getDepth()));

            name.appendChild(name_);
            coordinates.appendChild(coordX);
            coordX.appendChild(xCord);
            coordinates.appendChild(coordY);
            coordY.appendChild(yCord);
            createdate.appendChild(cr);
            cave.appendChild(depth);
            age.appendChild(age_);
            wingspan.appendChild(wingspan_);
            weight.appendChild(weight_);
            character.appendChild(char_);
            depth.appendChild(depth_);
        }
        DOMImplementation impl = document.getImplementation();
        DOMImplementationLS implLS = (DOMImplementationLS) impl.getFeature("LS", "3.0");
        LSSerializer ser = implLS.createLSSerializer();
        ser.getDomConfig().setParameter("format-pretty-print", true);
        String ans = ser.writeToString(document);

        try(FileOutputStream out = new FileOutputStream("data.xml");
            BufferedOutputStream bos = new BufferedOutputStream(out))
        {
            byte[] buffer = ans.getBytes(StandardCharsets.UTF_8);
            bos.write(buffer, 0, buffer.length);
            System.out.println("Успешно сохранено!");
        }
        catch(IOException ex){

            System.out.println(ex.getMessage());
        }
        return null;
    }
}
