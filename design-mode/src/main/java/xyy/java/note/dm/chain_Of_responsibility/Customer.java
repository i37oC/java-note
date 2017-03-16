package xyy.java.note.dm.chain_Of_responsibility;

import xyy.java.note.dm.chain_Of_responsibility.handler.PriceHandler;
import xyy.java.note.dm.chain_Of_responsibility.handler.PriceHandlerFactory;

/**
 * Created by xyy on 2017/3/8.
 * 客户请求折扣
 */
public class Customer {
    private PriceHandler priceHandler;

    public void setPriceHandler(PriceHandler priceHandler) {
        this.priceHandler = priceHandler;
    }

    public void questDiscount(int count){
        priceHandler.processDiscount(count);
    }

    public static void main(String[] args) {
        Customer customer = new Customer();
        customer.setPriceHandler(PriceHandlerFactory.createPriceHandler());
        customer.questDiscount(30);
    }
}
