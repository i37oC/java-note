package xyy.java.note.dm.chain_Of_responsibility.handler;

/**
 * Created by xyy on 2017/3/8.
 */
public class PriceHandlerFactory {

    public static PriceHandler createPriceHandler(){
        PriceHandler sales = new Sales();
        PriceHandler manager = new Manager();
        PriceHandler director = new Director();
        PriceHandler vp = new VP();
        PriceHandler ceo = new CEO();
        sales.setSuccessor(manager);
        manager.setSuccessor(director);
        director.setSuccessor(vp);
        vp.setSuccessor(ceo);
        return sales;
    }
}
