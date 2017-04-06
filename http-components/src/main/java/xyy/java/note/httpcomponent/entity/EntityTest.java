package xyy.java.note.httpcomponent.entity;

import org.apache.http.entity.ContentType;
import org.apache.http.entity.StringEntity;
import org.apache.http.util.EntityUtils;

import java.io.IOException;
import java.io.InputStream;

/**
 * @author xyy
 * @version 1.0 2017/3/31.
 * @since 1.0
 */
public class EntityTest {
    public static void main(String[] args) throws IOException {
        StringEntity myEntity = new StringEntity("important message", ContentType.create("text/pain", "UTF-8"));
        System.out.println(myEntity.getContentType());
        System.out.println(myEntity.getContentLength());
        System.out.println(EntityUtils.toString(myEntity));
        System.out.println(EntityUtils.toByteArray(myEntity).length);

        InputStream inputStream = myEntity.getContent();

    }
}
