package xyy.java.note.java.io;

import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.IOException;

/**
 * @author xyy
 * @version 1.0 2017/4/11.
 * @since 1.0
 */
public class DisDemo {


    public static void main(String[] args) throws IOException {
        String file = "/Users/xyy/IdeaProjects/java-note/java-io/dos.dat";
        IOUtil.printHex(file);

        DataInputStream in = new DataInputStream(new FileInputStream(file));
        int i = in.readInt();
        System.out.println(i);
        int j = in.readInt();
        System.out.println(j);
        long x = in.readLong();
        System.out.println(x);
        double y = in.readDouble();
        System.out.println(y);
        String ss = in.readUTF();
        System.out.println(ss);
    }

}
