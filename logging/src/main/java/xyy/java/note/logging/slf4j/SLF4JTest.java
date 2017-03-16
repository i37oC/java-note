package xyy.java.note.logging.slf4j;

import  org.slf4j.Logger;
import  org.slf4j.LoggerFactory;


public class SLF4JTest{
    final  Logger logger  =  LoggerFactory.getLogger(SLF4JTest. class );
    Integer t;
    Integer oldT;
    public   void  setTemperature(Integer temperature)  {
        oldT  =  t;
        t  =  temperature;
        logger.error( " Temperature set to {}. Old temperature was {}. " , t, oldT);
        if  (temperature.intValue()  >   50 )  {
            logger.info( " Temperature has risen above 50 degrees. " );
        }
    }


    public   static   void  main(String[] args)  {
        SLF4JTest wombat  =   new  SLF4JTest();
        wombat.setTemperature( 1 );
        wombat.setTemperature( 55 );
    }


    /**
     * @Author
     * @param ix
     * @return
     */
    public String hehe(int ix){



        return "";
    }



}