package aaa;

import java.net.MalformedURLException;
import java.net.URL;
import javax.xml.namespace.QName;
import javax.xml.ws.WebEndpoint;
import javax.xml.ws.WebServiceClient;
import javax.xml.ws.WebServiceFeature;
import javax.xml.ws.Service;

/**
 * This class was generated by Apache CXF 3.5.1
 * 2022-03-21T14:50:28.449+08:00
 * Generated source version: 3.5.1
 *
 */
@WebServiceClient(name = "ServiceTestImplService",
                  wsdlLocation = "http://localhost:9999/service?wsdl",
                  targetNamespace = "http://impl.service.moduel.kuifir.cn/")
public class ServiceTestImplService extends Service {

    public final static URL WSDL_LOCATION;

    public final static QName SERVICE = new QName("http://impl.service.moduel.kuifir.cn/", "ServiceTestImplService");
    public final static QName ServiceTestImplPort = new QName("http://impl.service.moduel.kuifir.cn/", "ServiceTestImplPort");
    static {
        URL url = null;
        try {
            url = new URL("http://localhost:9999/service?wsdl");
        } catch (MalformedURLException e) {
            java.util.logging.Logger.getLogger(ServiceTestImplService.class.getName())
                .log(java.util.logging.Level.INFO,
                     "Can not initialize the default wsdl from {0}", "http://localhost:9999/service?wsdl");
        }
        WSDL_LOCATION = url;
    }

    public ServiceTestImplService(URL wsdlLocation) {
        super(wsdlLocation, SERVICE);
    }

    public ServiceTestImplService(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public ServiceTestImplService() {
        super(WSDL_LOCATION, SERVICE);
    }

    public ServiceTestImplService(WebServiceFeature ... features) {
        super(WSDL_LOCATION, SERVICE, features);
    }

    public ServiceTestImplService(URL wsdlLocation, WebServiceFeature ... features) {
        super(wsdlLocation, SERVICE, features);
    }

    public ServiceTestImplService(URL wsdlLocation, QName serviceName, WebServiceFeature ... features) {
        super(wsdlLocation, serviceName, features);
    }




    /**
     *
     * @return
     *     returns ServiceTestImpl
     */
    @WebEndpoint(name = "ServiceTestImplPort")
    public ServiceTestImpl getServiceTestImplPort() {
        return super.getPort(ServiceTestImplPort, ServiceTestImpl.class);
    }

    /**
     *
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns ServiceTestImpl
     */
    @WebEndpoint(name = "ServiceTestImplPort")
    public ServiceTestImpl getServiceTestImplPort(WebServiceFeature... features) {
        return super.getPort(ServiceTestImplPort, ServiceTestImpl.class, features);
    }

}
