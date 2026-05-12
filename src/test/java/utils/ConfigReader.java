package utils;

import java.io.FileInputStream;
import java.util.Properties;

public class ConfigReader {

    static Properties properties;

    static {

        try {

            FileInputStream file =
                    new FileInputStream(
                            "src/config.properties");

            properties = new Properties();

            properties.load(file);

        } catch (Exception e) {

            System.out.println(e.getMessage());
        }
    }

    public static String getBrowser() {

        return properties.getProperty("browser");
    }

    public static String getUrl() {

        return properties.getProperty("url");
    }

    public static String getTimeout() {

        return properties.getProperty("timeout");
    }
}