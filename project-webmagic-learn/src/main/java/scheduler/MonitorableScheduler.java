package scheduler;

import xyy.java.note.webmagic.Task;

/**
 * @author xyy
 * @version 1.0 2017/4/13.
 * @since 1.0
 */
public interface MonitorableScheduler extends Scheduler {


    /**
     * 获取剩余的请求数量
     *
     * 一个 task 可以执行 多个 request ？？？
     *
     * @param task
     * @return
     */
    public int getLeftReqeustsCount(Task task);

    public int getTotalReqeustCount(Task task);
}
