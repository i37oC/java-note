package xyy.java.note.dm.chain_Of_responsibility.handler;

/**
 * Created by xyy on 2017/3/7.
 * 销售人员可以处理 5% 以内的折扣
 */
public class VP extends PriceHandler {
    @Override
    public void processDiscount(int discount) {
        if(discount<=50){
            System.out.format("%s批准了折扣：%1%n",this.getClass().getName(), discount);
        }else{
            successor.processDiscount(discount);
        }
    }
}
