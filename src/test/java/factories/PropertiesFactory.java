package factories;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

public class PropertiesFactory {

    public static Properties loadProperties(){
        Properties properties = new Properties();
        String target = System.getProperty("target");
        if (target == null) {
            target = "some";
        }
        try {
            properties.load(new FileReader(new File("src/test/resources/properties/" + target + ".properties")));
        } catch (IOException e) {
            e.printStackTrace();
        }
        return properties;
    }
}
