package cn.kuifir.moduel.client;

import cn.kuifir.moduel.generatedCode.ServiceTestImpl;
import cn.kuifir.moduel.generatedCode.ServiceTestImplService;

/**
 * Package: cn.kuifir.moduel.client
 * <p>
 * Description： TODO
 * <p>
 * Author: baci
 * <p>
 * Date: Created in 2022/3/5 15:24
 * <p>
 * Version: 0.0.1
 */
public class clientModule {
    public static void main(String[] args) {
        // 创建服务视图（service 标签的 name属性）
        ServiceTestImplService serviceTestImplService = new ServiceTestImplService();
        // 得到服务的实现类（service 标签的 portType）
        ServiceTestImpl port = serviceTestImplService.getPort(ServiceTestImpl.class);
        // 调用接口中的方法
        String result = port.weather("北京");
        System.out.println(result);
    }

}
