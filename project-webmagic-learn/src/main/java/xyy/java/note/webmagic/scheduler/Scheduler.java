package xyy.java.note.webmagic.scheduler;

import xyy.java.note.webmagic.Request;
import xyy.java.note.webmagic.Task;

/**
 * Scheduler is the part of url management <br>
 * you can implement interface xyy.java.note.webmagic.scheduler to do:
 *
 * manage urls to fetch
 * remove duplicate urls
 *
 * @author xyy
 * @version 1.0 2017/4/13.
 * @since 1.0
 */
public interface Scheduler {

    /**
     * add a url to fetch
     *
     * @param request
     * @param task
     */
    public void push(Request request, Task task);

    /**
     * get an url to crawl
     *
     * @param task
     * @return
     */
    public Request poll(Task task);
}
