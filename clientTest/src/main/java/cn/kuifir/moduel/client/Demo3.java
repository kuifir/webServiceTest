package cn.kuifir.moduel.client;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;

/**
 * Package: cn.kuifir.moduel.client
 * <p>
 * Description： TODO
 * <p>
 * Author: baci
 * <p>
 * Date: Created in 2022/3/5 17:22
 * <p>
 * Version: 0.0.1
 */
public class Demo3 {
    public static void main(String[] args) throws IOException {
        // 设置服务地址
        URL url = new URL("");
        // 打开一个连接
        HttpURLConnection httpURLConnection = (HttpURLConnection) url.openConnection();
        httpURLConnection.setRequestMethod("POST");
    }
}
