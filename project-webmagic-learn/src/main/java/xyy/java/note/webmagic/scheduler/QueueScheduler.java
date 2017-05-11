package xyy.java.note.webmagic.scheduler;

import xyy.java.note.webmagic.Request;
import xyy.java.note.webmagic.Task;

import java.util.concurrent.BlockingDeque;
import java.util.concurrent.LinkedBlockingDeque;


/**
 * @author xyy
 * @version 1.0 2017/4/13.
 * @since 1.0
 */
public class QueueScheduler extends DuplicateRemovedScheduler implements MonitorableScheduler{
    private BlockingDeque<Request> queque = new LinkedBlockingDeque<>();

    @Override
    public int getLeftReqeustsCount(Task task) {
        return 0;
    }

    @Override
    public int getTotalReqeustCount(Task task) {
        return 0;
    }

    @Override
    public Request poll(Task task) {
        return null;
    }

    @Override
    protected void pushWhenNoDuplicate(Request request, Task task) {

    }
}
