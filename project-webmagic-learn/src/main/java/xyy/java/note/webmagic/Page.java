package xyy.java.note.webmagic;

import xyy.java.note.webmagic.utils.HttpConstant;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/**
 * Object storing extracted result and urls to fetch.
 * note thread safe
 *
 *
 * @author xyy
 * @version 1.0 2017/4/19.
 * @since 1.0
 */
public class Page {
    private Request request;

    private ResultItems resultItems = new ResultItems();

    //private Html html;

    private String reawText;

    private Map<String,List<String>> headers;

    private int statusCode = HttpConstant.StatusCode.CODE_200;

    private boolean downloadSuccess = true;

    private List<Request> targetRequests = new ArrayList<Request>();

    public static Page fail(){
        Page page = new Page();
        page.setDownloadSuccess(false);
        return page;
    }

    public boolean isDownloadSuccess() {
        return downloadSuccess;
    }

    public void setDownloadSuccess(boolean downloadSuccess) {
        this.downloadSuccess = downloadSuccess;
    }
}
