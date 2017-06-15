package xyy.java.note.mt;

/**
 * @author xyy
 * @version 1.0 2017/3/10.
 * @since 1.0
 */
public class SynchronizeDemo {

    //共享变量
    private boolean ready = false;
    private int result = 0;
    private int number = 2;

    //写操作
    public void write(){
        ready = true;
        result = 2;
    }

    public void read(){
        if(ready){
            result = number * 3;
        }
        System.out.println("result 的值为 " + result);
    }

    private class ReadWriteThread extends Thread{
        private boolean flag;
        public ReadWriteThread(boolean flag){
            this.flag = flag;
        }

        public void run(){
            if(flag){
                write();
            }else {
                read();
            }
        }

    }

    public static void main(String[] args) {
        SynchronizeDemo demo = new SynchronizeDemo();
        demo.new ReadWriteThread(true).start();
        demo.new ReadWriteThread(false).start();

    }
}
