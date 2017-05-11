package xyy.java.note.webmagic.scheduler.component;

import xyy.java.note.webmagic.Request;
import xyy.java.note.webmagic.Task;

import java.util.Collections;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;

/**
 * @author xyy
 * @version 1.0 2017/4/13.
 * @since 1.0
 */
public class HashSetDuplicateRemover implements DuplicateRemover {
    /**
     * 这种写法啥意思？？？
     */
    private Set<String> urls = Collections.newSetFromMap(new ConcurrentHashMap<String, Boolean>());

    /**
     * 这个设计很好， 根据添加结果判断是否 重复
     * @param request
     * @param task
     * @return
     */
    public boolean isDuplicate(Request request, Task task) {
        return !urls.add(getUrl(request));
    }

    protected String getUrl(Request request){
        return request.getUrl();
    }

    public void resetDuplicatedCheck(Task task) {
        urls.clear();
    }

    public int getTotalReqeustCount(Task task) {
        return urls.size();
    }
}
