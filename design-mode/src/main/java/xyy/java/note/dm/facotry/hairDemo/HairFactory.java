package xyy.java.note.dm.facotry.hairDemo;

import java.util.Map;

/**
 * 发型工厂
 *
 * @author xyy
 * @version 1.0 2017/3/8.
 * @since 1.0
 */
public class HairFactory {

    /**
     * 根据类型来生成对象
     * @param key
     * @return
     */
    public HairInterface getHair(String key){
        if("left".equals(key)){
            return new LeftHair();
        }else if("right".equals(key)){
            return new RightHair();
        }
        return null;
    }

    public HairInterface getHairByClass(String className){
        HairInterface hairInterface = null;
        try {
            hairInterface = (HairInterface) Class.forName(className).newInstance();
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        return hairInterface;

    }

    public HairInterface getHairByClassKey(String key){
        HairInterface hairInterface = null;

        Map<String, String> map = new PropertiesReader().getProperties();
        if(map.get(key)==null){
            return null;
        }
        try {
            hairInterface = (HairInterface) Class.forName(map.get(key)).newInstance();
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        return hairInterface;
    }
}
