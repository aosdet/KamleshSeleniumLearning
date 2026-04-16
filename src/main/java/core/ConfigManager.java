package core;

import pages.HomePage;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class ConfigManager {

    public static Properties properties;

    // static block is used to initilaise static variables for one time
    //System.getProperty("user.dir") return project current diretory
    static {
        properties = new Properties();

        FileInputStream fin = null;
        try {
            fin = new FileInputStream(System.getProperty("user.dir") + "/src/main/resources/config/config.properties");
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }   try {
            properties.load(fin);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }

    public static String get(String key) {

        return properties.getProperty(key);
    }


}
