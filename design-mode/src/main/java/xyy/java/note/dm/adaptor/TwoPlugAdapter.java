package xyy.java.note.dm.adaptor;

/**
 * 二项转三相的插座适配器
 * @author xyy
 * @version 1.0 2017/3/10.
 * @since 1.0
 */
public class TwoPlugAdapter implements ThreePlugIf {
    private GBTwoPlug gbTwoPlug;

    public TwoPlugAdapter(GBTwoPlug gbTwoPlug) {
        this.gbTwoPlug = gbTwoPlug;
    }

    @Override
    public void powerwithThreePlug() {
        System.out.println("通过转换");
        gbTwoPlug.powerWithTwo();
    }
}
