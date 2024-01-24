
import cn.com.cnooc.mobile.api.common.PushNotify;
import cn.kuifir.CxfApplication;
import cn.kuifir.module.generatedCode.ICommonAPI;
import cn.kuifir.module.generatedCode.NotifyType;
import cn.kuifir.module.interceptor.ClientInterceptor;
import lombok.extern.slf4j.Slf4j;
import org.apache.cxf.endpoint.Client;
import org.apache.cxf.jaxws.JaxWsProxyFactoryBean;
import org.apache.cxf.jaxws.endpoint.dynamic.JaxWsDynamicClientFactory;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import javax.xml.namespace.QName;
import javax.xml.ws.Service;
import java.net.MalformedURLException;
import java.net.URL;

/**
 * Package: PACKAGE_NAME
 * <p>
 * Description： TODO
 * <p>
 * Author: baci
 * <p>
 * Date: Created in 2022/3/6 13:55
 * <p>
 * Version: 0.0.1
 */
@Slf4j
@SpringBootTest(classes = CxfApplication.class)
public class clientTest {
    @Test
    public void client() {
//         webService 服务地址
        String url = "http://mdev.cnooc.com.cn/mp/api/file?wsdl";
        JaxWsProxyFactoryBean jaxWsProxyFactoryBean =new JaxWsProxyFactoryBean();
        jaxWsProxyFactoryBean.setAddress(url);
        jaxWsProxyFactoryBean.setServiceClass(ICommonAPI.class);
        jaxWsProxyFactoryBean.getOutInterceptors().add(new ClientInterceptor("yx_yjzy_flow","flow",null));
        ICommonAPI iCommonAPI=(ICommonAPI) jaxWsProxyFactoryBean.create();
        String message = "测试发送消息";
        String result = iCommonAPI.pushNotify("yx_yjzy_flow","test",
                NotifyType.MESSAGE, message,null);


    }
    @Test
    void clent2() throws MalformedURLException {
        //原始
        URL url =new URL("http://mdev.cnooc.com.cn/mp/api/common?wsdl");
        // 设置服务名称和命名空间（targetNamespace,服务视图(service 标签的 name属性)）
        QName qName = new QName("http://mobile.cnooc.com.cn/api/common", "CommonAPI");
        // 创建服务视图
        Service service = Service.create(url, qName);
        // 得到服务实现类
        ICommonAPI port = service.getPort(ICommonAPI.class);
        String message = "测试发送消息";
        System.out.println(port.pushNotify("yx_yjzy_flow","test", NotifyType.MESSAGE, message,null));
    }
    @Test
    void client3() throws Exception {
        // 动态
        String url = "http://mdev.cnooc.com.cn/mp/api/common?wsdl";
        JaxWsDynamicClientFactory dcf = JaxWsDynamicClientFactory.newInstance();
        Client client = dcf.createClient(url);
        client.getOutInterceptors().add(new ClientInterceptor("yx_yjzy_flow","flow",null));
        String message = "测试发送消息";
        // 构建发送对象
        PushNotify pushNotify = PushNotify.builder()
                .message(message)
                .notifyType(cn.com.cnooc.mobile.api.common.NotifyType.MESSAGE)
                .recipientAccount("test")
                .senderAccount("yx_yjzy_flow")
                .extraInfo(null)
                .build();

        // 构建发送对象
        client.invoke("pushNotify", pushNotify);
        log.info("调用接口成功:返回值：{}");

    }
}
