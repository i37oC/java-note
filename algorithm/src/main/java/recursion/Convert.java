package recursion;

/**
 * @author xyy
 * @version 1.0 2017/4/4.
 * @since 1.0
 */
public class Convert {

    public static byte[] int2bytes(int id){
        byte[] arr = new byte[4];

        // id >> 0*8 移位
        // xx & 0xff : 0xff 是 00000000 00000000 00000000 11111111 ， 该表达式是取一个 int 的最后一个字节

        arr[0] = (byte)((id >> 0*8) & 0xff);
        arr[1] = (byte)((id >> 1*8) & 0xff);
        arr[2] = (byte)((id >> 2*8) & 0xff);
        arr[3] = (byte)((id >> 3*8) & 0xff);

        return arr;
    }

    public static void bytes2int(byte[] arr){

    }

    public static void main(String[] args) {
        byte[] arr = int2bytes(8143);
        System.out.println(Integer.toBinaryString(arr[0]) + "," + arr[1] + "," + arr[2] + "," + arr[3]);
    }
}
