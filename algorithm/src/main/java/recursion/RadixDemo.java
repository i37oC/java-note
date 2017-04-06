package recursion;

import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;

/**
 * @author xyy
 * @version 1.0 2017/4/4.
 * @since 1.0
 */
public class RadixDemo {
    public static void main(String[] args) {
        System.out.println(Integer.toBinaryString(255));//二进制
        System.out.println(Integer.toHexString(112));//十六进制
        System.out.println(Integer.toOctalString(112));//八进制

        System.out.println("\n");
        //其他进制转换为10进制
        System.out.println(Integer.parseInt("1111111",2));
        System.out.println(Integer.parseInt("ff",16));
        System.out.println(Integer.parseInt("A8",16));

        System.out.println();



    }
}
