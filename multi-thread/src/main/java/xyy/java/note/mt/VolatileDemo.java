package xyy.java.note.mt;

/**
 * @author xyy
 * @version 1.0 2017/3/10.
 * @since 1.0
 */
public class VolatileDemo {
    private volatile int number = 0;

    public int getNumber(){
        try {
            Thread.sleep(100);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return this.number;
    }

    public void increase(){
        number++;
    }

    public static void main(String[] args) {
        final VolatileDemo demo = new VolatileDemo();
        for (int i=0; i<500; i++){
            new Thread(new Runnable() {
                public void run() {
                    demo.increase();
                }
            }).start();
        }

        while (Thread.activeCount()>2){
            Thread.yield();
        }
        System.out.println(demo.getNumber());
    }
}
