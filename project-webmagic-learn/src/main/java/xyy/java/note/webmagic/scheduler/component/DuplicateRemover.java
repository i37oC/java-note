package xyy.java.note.webmagic.scheduler.component;

import xyy.java.note.webmagic.Request;
import xyy.java.note.webmagic.Task;

/**
 *
 * Remove duplicate requests.
 * @author xyy
 * @version 1.0 2017/4/13.
 * @since 1.0
 */
public interface DuplicateRemover {

    /**
     * check whether the reqeust is duplicate.
     *
     * @param request
     * @param task
     * @return
     */
    public boolean isDuplicate(Request request, Task task);

    /**
     * Rest duplicate check.
     * @param task
     */
    public void resetDuplicatedCheck(Task task);

    /**
     * get totalRequesCount for monitor.
     * @param task
     * @return number of total request
     */
    public int getTotalReqeustCount(Task task);
}
