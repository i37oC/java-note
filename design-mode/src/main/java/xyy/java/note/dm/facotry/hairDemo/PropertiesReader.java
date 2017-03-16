package xyy.java.note.dm.facotry.hairDemo;

import java.io.IOException;
import java.io.InputStream;
import java.util.Enumeration;
import java.util.HashMap;
import java.util.Map;
import java.util.Properties;

/**
 * @author xyy
 * @version 1.0 2017/3/8.
 * @since 1.0
 */
public class PropertiesReader {
    public Map<String, String> getProperties(){
        Properties properties = new Properties();
        Map<String, String> map = new HashMap<>();
        InputStream in = getClass().getResourceAsStream("type.properties");
        try {
            properties.load(in);
        } catch (IOException e) {
            e.printStackTrace();
        }
        Enumeration en = properties.propertyNames();
        while (en.hasMoreElements()){
            String key = (String) en.nextElement();
            String value = properties.getProperty(key);
            map.put(key,value);
        }
        return map;
    }
}
