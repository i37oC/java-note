package xyy.java.note.java.io;

import java.io.*;

/**
 * @author xyy
 * @version 1.0 2017/4/11.
 * @since 1.0
 */
public class IOUtil {

    // 把文件作为字节流进行读操作
    public static void printHex(String fileName) throws IOException {
        FileInputStream in = new FileInputStream(fileName);

        int b;
        int i = 1;

        while ((b=in.read())!=-1){
            System.out.print(Integer.toHexString(b) + " ");
            if(i ++ %10 ==0){
                System.out.println("");
            }
        }

    }

    /**
     * 使用 批量读取
     * @param fileName
     * @throws IOException
     */
    public static void printHexByByteArray(String fileName) throws IOException{
        FileInputStream in = new FileInputStream(fileName);
        byte[] buff = new byte[20*1024]; // 20 K

        // 从in中 批量读取字节， 放入到 buf 这个字节数组中， 从 第0个位置开始放， 最多放 buf。lenght个

        /**
         * 从in中 批量读取字节， 放入到 buf 这个字节数组中
         * 从 第0个位置开始放， 最多放 buf.lenght个
         * 返回的是读到的字节的个数
         */
        int bytes = in.read(buff, 0 , buff.length); // 一次性读完， 说明字节数组足够大
        int j = 1;

        while ((bytes = in.read(buff, 0, buff.length))!=-1){
            for(int i=0; i<bytes; i++){

                /**
                 * buff[i] & 0xff
                 * byte 类型8位， int 类型32位，为了避免数据转换错误， 通过 &0xff 将高24位清零
                 */
                System.out.print(Integer.toHexString(buff[i] & 0xff)+" ");
                if(j ++ %10 ==0){
                    System.out.println("");
                }
            }
        }
    }

    public static void copyFile(File srcFile, File destFile) throws IOException {
        if(!srcFile.exists()){
            throw new IllegalArgumentException(srcFile + " 不存在");
        }

        if(!srcFile.isFile()){
            throw new IllegalArgumentException(srcFile + " 不是文件");
        }

        FileInputStream in = new FileInputStream(srcFile);
        FileOutputStream out = new FileOutputStream(destFile);

        byte[] buf = new byte[8*1024];
        int b ;
        while ((b=in.read(buf, 0 , buf.length))!=-1){
            out.write(buf, 0, b);
            out.flush(); // 最好加上
        }
        in.close();
        out.close();

    }

    public static void copyFileByBuffer(File srcFile, File destFile) throws IOException{
        if(!srcFile.exists()){
            throw new IllegalArgumentException(srcFile + " 不存在");
        }

        if(!srcFile.isFile()){
            throw new IllegalArgumentException(srcFile + " 不是文件");
        }

        BufferedInputStream bis = new BufferedInputStream(new FileInputStream(srcFile));
        BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream(destFile));

        int c;
        while ((c=bis.read())!=-1){
            bos.write(c);
            bos.flush(); //刷新缓冲区，必须写
        }
        bis.close();
        bos.close();
    }
}
