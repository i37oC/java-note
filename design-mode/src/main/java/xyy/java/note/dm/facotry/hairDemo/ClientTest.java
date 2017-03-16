package xyy.java.note.dm.facotry.hairDemo;

/**
 * 模拟客户端实现
 *
 * @author xyy
 * @version 1.0 2017/3/8.
 * @since 1.0
 */
public class ClientTest {
    public static void main(String[] args) {
        HairInterface hairInterface = new LeftHair();
        hairInterface.draw();


        /**
         * 这样就将 客户端 与 实现端解耦了； 客户端不直接解除 实现类。
         */
        HairFactory factory = new HairFactory();
        HairInterface hairInterface1 = factory.getHair("left");
        hairInterface1.draw();


        /**
         * 这样就将 客户端 与 实现端解耦了； 客户端不直接解除 实现类。
         */
        HairInterface hairInterface2 = factory.getHairByClass("xyy.java.note.dm.facotry.hairDemo.RightHair");
        hairInterface2.draw();

        /**
         * 这样就将 客户端 与 实现端解耦了； 客户端不直接解除 实现类。
         */
        HairInterface hairInterface3 = factory.getHairByClassKey("left");
        hairInterface3.draw();
    }
}
