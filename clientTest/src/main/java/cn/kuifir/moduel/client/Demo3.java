package cn.kuifir.moduel.client;

import org.apache.cxf.endpoint.Client;
import org.apache.cxf.jaxws.endpoint.dynamic.JaxWsDynamicClientFactory;


public class Demo3 {
    public static void main(String[] args) throws Exception {
        JaxWsDynamicClientFactory jaxWsDynamicClientFactory = JaxWsDynamicClientFactory.newInstance();
        Client client = jaxWsDynamicClientFactory.createClient("http://localhost:9999/service?wsdl");
        Object[] invoke = client.invoke("people", "黎明", 28);
        for (Object o : invoke) {
            System.out.println(o.toString());
        }

    }
}
