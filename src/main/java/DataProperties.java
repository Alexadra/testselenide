package main.java;

import java.util.Properties;
import java.io.IOException;
import java.net.URL;

public class DataProperties {
    private static Properties PROPERTIES;

    static {
	PROPERTIES = new Properties();
	URL props;
	
	String os = System.getProperty("os.name").toLowerCase();
	if (os.contains("win")) 
		props = ClassLoader.getSystemResource("main/resources/data.properties");
	else
		props = ClassLoader.getSystemResource("main\\resources\\data.properties");
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
