package xyy.java.note.java.io.accessFile;

import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.util.Arrays;

/**
 * @author xyy
 * @version 1.0 2017/4/11.
 * @since 1.0
 */
public class RafDemo {
    public static void main(String[] args) throws IOException {
        File demo = new File("demo");
        if(!demo.exists()){
            demo.mkdir();
        }

        File file = new File(demo, "raf,dat");
        if(!file.exists()){
            file.createNewFile();
        }

        RandomAccessFile raf = new RandomAccessFile(file, "rw");

        System.out.println(raf.getFilePointer());

        raf.write('A'); // 只写了一个字节
        System.out.println(raf.getFilePointer());

        raf.write('B');

        int i = 0x7fffffff;
        raf.write(i>>>24); // 高八位
        raf.write(i>>>16);
        raf.write(i>>>8);
        raf.write(i);

        System.out.println(raf.getFilePointer());

        raf.writeInt(i);
        System.out.println(raf.getFilePointer());


        String s = "中";
        byte[] gbk = s.getBytes("gbk");
        raf.write(gbk);
        System.out.println(raf.getFilePointer());


        // 读文件， 必须把指针移动到头部
        raf.seek(0);

        //一次性读取，吧文件中的内容都读到字节数组中
        byte[] buf = new byte[(int)raf.length()];
        raf.read(buf);
        System.out.println(Arrays.toString(buf));

        raf.seek(10);
        //读取 中文
        byte[] ch = new byte[2];
        raf.read(ch, 0 , 2);
        String zhong = new String(ch, "gbk");
        System.out.println(zhong);

        raf.close();
    }
}
