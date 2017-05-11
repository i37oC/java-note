package xyy.java.note.webmagic;

import org.apache.commons.collections.map.HashedMap;
import xyy.java.note.webmagic.model.HttpRequestBody;
import xyy.java.note.webmagic.utils.Experimental;

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

    private HttpRequestBody requestBody;

    /**
     * Store additional information in extras.
     */
    private Map<String, Object> extras;

    /**
     * cookies for current url, if not set use Site's cookies
     */
    private Map<String, String> cookies = new HashMap<String, String>();

    private Map<String, String> headers = new HashMap<String, String>();

    /***
     * Priority of the request. <br>
     * the bigger will be processed earlier. <br>
     * @see ???
     */
    private long priority;

    public Request(String url) {
        this.url = url;
    }

    public Request() {
    }

    public long getPriority() {
        return priority;
    }

    /**
     * Set the priority of request for sorting. <brr>
     *     need a scheduler supporting priority.
     * @param priority
     * @return
     */
    public Request setPriority(long priority){
        this.priority = priority;
        return this;
    }

    public Object getExtra(String key){
        if(extras == null){
            return null;
        }
        return extras.get(key);
    }

    public Request putExtra(String key, Object value){
        if(extras == null){
            extras = new HashedMap();
        }
        extras.put(key, value);
        return this;
    }

    public Map<String, Object> getExtras() {
        return extras;
    }

    public void setExtras(Map<String, Object> extras) {
        this.extras = extras;
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


    @Override
    public int hashCode() {
        int result = url != null ? url.hashCode() : 0;
        result = 31 * result + (method != null ? method.hashCode() : 0);
        return result;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Request request = (Request) o;

        if (url != null ? !url.equals(request.url) : request.url != null) return false;
        return method != null ? method.equals(request.method) : request.method == null;
    }

    public Request addCookie(String name, String value) {
        cookies.put(name, value);
        return this;
    }

    public Request addHeader(String name, String value) {
        headers.put(name, value);
        return this;
    }

    public Map<String, String> getCookies() {
        return cookies;
    }

    public Map<String, String> getHeaders() {
        return headers;
    }

    public HttpRequestBody getRequestBody() {
        return requestBody;
    }

    public void setRequestBody(HttpRequestBody requestBody) {
        this.requestBody = requestBody;
    }

    @Override
    public String toString() {
        return "Request{" +
                "url='" + url + '\'' +
                ", method='" + method + '\'' +
                ", extras=" + extras +
                ", priority=" + priority +
                ", headers=" + headers +
                ", cookies="+ cookies+
                '}';
    }
}
