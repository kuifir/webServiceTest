package cn.kuifir.moduel.client;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.URL;
import java.net.URLConnection;

public class Demo4 {
    public static void main(String[] args) {
        String param = "<soapenv:Envelope xmlns:soapenv=\"http://schemas.xmlsoap.org/soap/envelope/\" xmlns:impl=\"http://impl.service.moduel.kuifir.cn/\">\n" +
                "   <soapenv:Header/>\n" +
                "   <soapenv:Body>\n" +
                "      <impl:people>\n" +
                "         <!--Optional:-->\n" +
                "         <arg0>黎明</arg0>\n" +
                "         <arg1>15</arg1>\n" +
                "      </impl:people>\n" +
                "   </soapenv:Body>\n" +
                "</soapenv:Envelope>";
        String s = Demo4.sendPost("http://localhost:9999/service", param);
        System.out.println(s);

    }
    public static String sendPost(String url, String param) {
        String result = "";
        try {
            URL url1 = new URL(url);
            // 打开和URL之间的连接
            URLConnection urlConnection = url1.openConnection();
            // 设置通用的请求属性
            urlConnection.setRequestProperty("accept", "*/*");
            urlConnection.setRequestProperty("connection", "Keep-Alive");
            urlConnection.setRequestProperty("user-agent", "Mozilla/4.0(compatible;MSIE 6.0;Windows NT 5.1;SV1)");
            urlConnection.setRequestProperty("Content-Type","text/xml");
            // 发送POST必须设置如下两行
            urlConnection.setDoOutput(true);
            urlConnection.setDoInput(true);
            try (
                    // 获取URLConnection对象对应的输出流
                    PrintWriter out = new PrintWriter(urlConnection.getOutputStream());) {
                // 发送请求参数
                out.print(param);
                // flush输出流的缓冲
                out.flush();
            }
            try (
                    // 定义BufferedReader输入流来读取URL的响应
                    BufferedReader in =
                            new BufferedReader(new InputStreamReader(urlConnection.getInputStream()
                                    , "utf-8"));)
            {
                String line;
                while ((line = in.readLine()) != null) {
                    result += "\n" + line;
                }
            }
        } catch (Exception e) {
            System.out.println("发送Post请求出现异常：" + e);
            e.printStackTrace();
        }

        return result;

    }
}
