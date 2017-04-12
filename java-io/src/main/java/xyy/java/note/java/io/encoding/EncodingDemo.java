package xyy.java.note.java.io.encoding;

import java.io.UnsupportedEncodingException;

/**
 * @author xyy
 * @version 1.0 2017/3/24.
 * @since 1.0
 */
public class EncodingDemo {
    public static void main(String[] args) throws UnsupportedEncodingException {
        String s = "慕课ABC";

        /**
         * 默认编码是 UTF-8 utf-8
         * 中文占3个字节  英文占1个字节
         */
        byte[] bytes1 = s.getBytes();
        for (byte b : bytes1){
            System.out.print(Integer.toHexString(b & 0xff) + "  ");
            //System.out.println(Integer.toHexString(b ));

           // System.out.println(Integer.toBinaryString(b));
        }

        System.out.println("\n");

        byte[] bytes2 = s.getBytes("utf-8");
        for (byte b : bytes2){
            System.out.print(Integer.toHexString(b & 0xff) + "  ");
            //System.out.println(Integer.toHexString(b ));

            // System.out.println(Integer.toBinaryString(b));
        }

        System.out.println("\n");


        /**
         * 中文占 2 个字节   英文占一个字节
         */
        byte[] bytes3 = s.getBytes("GBK");
        for (byte b : bytes3){
            System.out.print(Integer.toHexString(b & 0xff) + "  ");
            //System.out.println(Integer.toHexString(b ));

            // System.out.println(Integer.toBinaryString(b));
        }

        System.out.println("\n");

        /**
         * java 是双字节编码 采用 utf-16be
         * 中文占用两个字节， 英文占用两个字节
         */
        byte[] bytes4 = s.getBytes("utf-16be");
        for (byte b : bytes4){
            System.out.print(Integer.toHexString(b & 0xff) + "  ");
            //System.out.println(Integer.toHexString(b ));

            // System.out.println(Integer.toBinaryString(b));
        }

        System.out.println("\n");


        /**
         *
         * 当你的  字节序列  是某种编码时， 这个时候想把字节序列变成
         * 字符串，也需要这种编码方式， 否则会出现乱码。
         *
         *
         */

        String str1 = new String(bytes4);
        System.out.println(str1);

        System.out.println("\n");

        String str2 = new String(bytes4, "utf-16be");
        System.out.println(str2);


        /**
         * 文本文件  就是字节序列
         * 可以是任意编码的字节序列
         *
         * 如果我们在中文机器上直接创建文本文件，该文本文件只认识 ANSI 编码
         *
         *
         */

    }
}
