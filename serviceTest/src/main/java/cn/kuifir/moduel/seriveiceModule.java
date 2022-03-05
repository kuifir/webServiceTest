package cn.kuifir.moduel;

import cn.kuifir.moduel.service.impl.ServiceTestImpl;

import javax.xml.ws.Endpoint;

/**
 * Package: cn.kuifir.moudel
 * <p>
 * Description： TODO
 * <p>
 * Author: baci
 * <p>
 * Date: Created in 2022/3/5 14:52
 * <p>
 * Version: 0.0.1
 */
public class seriveiceModule {
    public static void main(String[] args) {
        Endpoint.publish("http://localhost:9999/service",new ServiceTestImpl());
        System.out.println("服务发布成功。。。。。");
    }
}
