package xyy.java.note.mt;

/**
 * @author xyy
 * @version 1.0 2017/6/14.
 * @since 1.0
 */
public class TreadManagerDemo {
    public static void main(String[] args) {
        AThread aTask = new AThread("a");
        System.out.println(aTask.getName());
        AThread bTask = new AThread("b");
        System.out.println(bTask.getName());
        aTask.start();
        bTask.start();

    }

    private static class AThread extends Thread{
        private String name;
        public AThread(String name){
            this.name = name;
        }

        public void run(){
            while (true){
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println(currentThread().getName()  + "  "  + name);
            }
        }

    }
}
