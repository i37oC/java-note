package xyy.java.note.webmagic.scheduler;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import xyy.java.note.webmagic.scheduler.component.DuplicateRemover;
import xyy.java.note.webmagic.scheduler.component.HashSetDuplicateRemover;
import xyy.java.note.webmagic.Request;
import xyy.java.note.webmagic.Task;

/**
 * Remove duplicate urls and only push urls which are not duplicate, <br>
 *
 * @author xyy
 * @version 1.0 2017/4/13.
 * @since 1.0
 */
public abstract class DuplicateRemovedScheduler implements Scheduler {

    protected Logger logger = LoggerFactory.getLogger(getClass());

    private DuplicateRemover duplicatedRemover = new HashSetDuplicateRemover();

    public DuplicateRemover getDuplicateRemover() {
        return duplicatedRemover;
    }

    public DuplicateRemovedScheduler setDuplicateRemover(DuplicateRemover duplicatedRemover) {
        this.duplicatedRemover = duplicatedRemover;
        return this;
    }

    public void push(Request request, Task task){
        logger.trace("get a candidate url {}", request.getUrl());


        /**
         *
         * 在校验的时候，吧请求放到 DuplicateRemover 的集合中
         *
         */


        // 不是重复的， 或者 这个请求是需要 循环 爬的
        if(!duplicatedRemover.isDuplicate(request, task) || shouldReserved(request)){
            pushWhenNoDuplicate(request, task);
        }

    }

    protected boolean shouldReserved(Request request) {
        return request.getExtra(Request.CYCLE_TRIED_TIMES) != null;
    }

    protected abstract void pushWhenNoDuplicate(Request request, Task task);

}
