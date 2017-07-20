package  Pages;

import java.util.Properties;
import java.io.IOException;
import java.net.URL;

public class DataProperties {
    private static Properties PROPERTIES;

    static {
	PROPERTIES = new Properties();
	URL props = ClassLoader.getSystemResource("data.properties");
	try {
	    PROPERTIES.load(props.openStream());
	} catch (IOException e) {
	    e.printStackTrace();
	}
    }

    public static String getProperty(String key) {
	return PROPERTIES.getProperty(key);
    }

    public static String get(String key) {
	//just to use short name
	return getProperty(key);
    }

}
