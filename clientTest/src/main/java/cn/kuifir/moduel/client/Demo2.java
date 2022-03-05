package cn.kuifir.moduel.client;

import cn.kuifir.moduel.generatedCode.ServiceTestImpl;

import javax.xml.namespace.QName;
import javax.xml.ws.Service;
import java.net.MalformedURLException;
import java.net.URL;

/**
 * Package: cn.kuifir.module2
 * <p>
 * Description： 解决服务端URL写死的问题，如果写死，更改地址志后要重新生成代码
 * <p>
 * Author: baci
 * <p>
 * Date: Created in 2022/3/5 16:35
 * <p>
 * Version: 0.0.1
 */
public class Demo2 {

    public static void main(String[] args) throws MalformedURLException {
        // 设置服务地址(服务wsdl地址)
        URL url =new URL("http://localhost:9999/service?wsdl");
        // 设置服务名称和命名空间（targetNamespace,服务视图(service 标签的 name属性)）
        QName qName = new QName("http://impl.service.moduel.kuifir.cn/", "ServiceTestImplService");
        // 创建服务视图
        Service service = Service.create(url, qName);
        // 得到服务实现类
        ServiceTestImpl port = service.getPort(ServiceTestImpl.class);
        System.out.println(port.people("黎明", 28));
    }
}
