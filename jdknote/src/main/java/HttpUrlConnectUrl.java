import java.io.IOException;
import java.net.URL;
import java.net.URLConnection;
import java.util.List;
import java.util.Map;

/**
 * Created by xyy on 2017/2/28.
 */
public class HttpUrlConnectUrl {
    public static void main(String[] args) throws IOException {
        URL url = new URL("http://www.baidu.com");

        // 打开和URL之间的连接
        URLConnection conn = url.openConnection();

        // 建立实际的连接
        conn.connect();
        // 获取所有响应头字段
        Map<String, List<String>> map = conn.getHeaderFields();
        // 遍历所有的响应头字段
        for (String key : map.keySet()) {
            System.out.println(key + "--->" + map.get(key));
        }
    }
}
