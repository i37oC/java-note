package xyy.java.note.mt;

/**
 * @author xyy
 * @version 1.0 2017/6/14.
 * @since 1.0
 */
public class VmDemo {

    public static void main(String[] args) {
        ThreadGroup group = Thread.currentThread().getThreadGroup();
        if(group != null) {
            Thread[] threads = new Thread[(int)(group.activeCount() * 1.2)];
            int count = group.enumerate(threads, true);
            System.out.println(count);
            for(int i = 0; i < count; i++) {
                System.out.println(threads[i].getName());
            }
        }
        while (true){
            try {
                Thread.sleep(1000*60*10);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    /**
     * 通过线程组获得线程
     *
     * @param threadId
     * @return
     */
    public static Thread findThread(long threadId) {
        ThreadGroup group = Thread.currentThread().getThreadGroup();
        while(group != null) {
            Thread[] threads = new Thread[(int)(group.activeCount() * 1.2)];
            int count = group.enumerate(threads, true);
            for(int i = 0; i < count; i++) {
                if(threadId == threads[i].getId()) {
                    return threads[i];
                }
            }
            group = group.getParent();
        }
        return null;
    }
}


