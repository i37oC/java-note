package xyy.java.note.java.encoding;

/**
 * @author xyy
 * @version 1.0 2017/3/24.
 * @since 1.0
 */
public class EncodingDemo {
    public static void main(String[] args) {
        String s = "慕课ABC";

        byte[] bytes1 = s.getBytes();
        for (byte b : bytes1){
            System.out.print(Integer.toHexString(b & 0xff) + "  ");
            //System.out.println(Integer.toHexString(b ));

           // System.out.println(Integer.toBinaryString(b));
        }

        /*for (byte b : bytes1){
            System.out.print((b & 0xff) + "  ");
            //System.out.println(Integer.toHexString(b ));

            // System.out.println(Integer.toBinaryString(b));
        }*/
        //System.out.println(Integer.toBinaryString(3));

    }
}
