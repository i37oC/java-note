package xyy.java.note.mt.excutorDemo;

import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * @author xyy
 * @version 1.0 2017/6/15.
 * @since 1.0
 */
public class ExcutorServerDemo {
    private static final ExecutorService executorService = Executors.newScheduledThreadPool(10,
            Executors.defaultThreadFactory());

    public static void main(String[] args) {
        int taskNum = 5;
        final CountDownLatch task = new CountDownLatch(taskNum);

        executorService.submit(new Runnable() {
            public void run() {
                //TODO 业务代码
                task.countDown();
            }
        });

        try {
            task.wait();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

}
