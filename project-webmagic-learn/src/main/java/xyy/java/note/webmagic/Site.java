package xyy.java.note.webmagic;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

/**
 * Object contains setting for crawler.<br>
 *
 * @author xyy
 * @version 1.0 2017/4/13.
 * @since 1.0
 */
public class Site {

    private String domain;

    private String userAgent;

    private Map<String, String> defaultCookies = new LinkedHashMap<String, String>();

    private Map<String, Map<String, String>> cookies = new HashMap<String, Map<String, String>>();

    private String charset;


}
