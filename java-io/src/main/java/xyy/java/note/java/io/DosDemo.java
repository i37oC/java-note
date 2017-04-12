package xyy.java.note.java.io;

import xyy.java.note.java.io.IOUtil;

import java.io.*;

/**
 * @author xyy
 * @version 1.0 2017/4/11.
 * @since 1.0
 */
public class DosDemo {
    public static void main(String[] args) throws IOException {
        String file = "/Users/xyy/IdeaProjects/java-note/java-io/dos.dat";

        DataOutputStream dos = new DataOutputStream(new FileOutputStream(file));
        dos.writeInt(10);
        dos.writeInt(-10);
        dos.writeLong(10L);
        dos.writeDouble(10.5);

        //采用utf-8
        dos.writeUTF("中国");

        //采用 utf-16be
        dos.writeChars("中国");
        dos.close();
        IOUtil.printHex(file);

    }
}
