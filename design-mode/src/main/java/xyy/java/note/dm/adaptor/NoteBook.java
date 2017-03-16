package xyy.java.note.dm.adaptor;

/**
 * @author xyy
 * @version 1.0 2017/3/10.
 * @since 1.0
 */
public class NoteBook {
    /**
     * 笔记本配置的是三相充电器
     */
    private ThreePlugIf threePlugIf;

    public NoteBook(ThreePlugIf threePlugIf){
        this.threePlugIf = threePlugIf;
    }

    /**
     * 使用插座充电
     */
    public void charge(){
        threePlugIf.powerwithThreePlug();
    }

    public static void main(String[] args) {
        GBTwoPlug gbTwoPlug = new GBTwoPlug();
        ThreePlugIf plugIf = new TwoPlugAdapter(gbTwoPlug);
        NoteBook noteBook = new NoteBook(plugIf);
        noteBook.charge();
    }

}
