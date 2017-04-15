package xyy.java.note.webmagic;

import utils.Experimental;

import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;

/**
 * @author xyy
 * @version 1.0 2017/4/13.
 * @since 1.0
 */
public class Request implements Serializable {

    private static final long serialVersionUID = 2062192774891352043L;

    /**
     * 啥意思？
     */
    public static final String CYCLE_TRIED_TIMES = "_cycle_tried_tiems";
    public static final String STATUS_CODE = "statusCode";
    public static final String PROXY = "proxy";

    private String url;
    private String method;

    /**
     * Store additional information in extras.
     */
    private Map<String, Object> extras;

    /***
     * Priority of the request. <br>
     * the bigger will be processed earlier. <br>
     * @see ???
     */
    private long priority;

    public Request(String url){
        this.url = url;
    }


    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getMethod() {
        return method;
    }

    public void setMethod(String method) {
        this.method = method;
    }

    public Map<String, Object> getExtras() {
        return extras;
    }

    public void setExtras(Map<String, Object> extras) {
        this.extras = extras;
    }

    public long getPriority() {
        return priority;
    }

    /**
     * Set the priority of request for sorting. <br>
     *     Need a scheduler supporting priority.<br>
     *
     * @see
     * @param priority
     * @return
     */
    @Experimental
    public Request setPriority(long priority) {
        this.priority = priority;
        return this;
    }


    public Object getExtra(String key) {
        if (extras == null) {
            return null;
        }
        return extras.get(key);
    }

    public Request putExtra(String key, Object value) {
        if (extras == null) {
            extras = new HashMap<String, Object>();
        }
        extras.put(key, value);
        return this;
    }

}
