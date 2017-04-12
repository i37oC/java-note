package xyy.java.note.java.io;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * @author xyy
 * @version 1.0 2017/4/11.
 * @since 1.0
 */
public class FileOutDemo1 {
    public static void main(String[] args) throws IOException {
        FileOutputStream out = new FileOutputStream("demo/out.dat");
        out.write('A'); // 只写了 'A' 的低八位
    }
}
