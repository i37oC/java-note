package xyy.java.note.webmagic;

/**
 * Interface for identifying different tasks. <br/>
 *
 * @author xyy
 * @version 1.0 2017/4/13.
 * @since 1.0
 */
public interface Task {

    /**
     * unique id for a task.
     *
     * @return
     */
    public String getUUID();

    /**
     * site for a task
     *
     * @return
     */
    public Site getSite();
}
