package cn.kuifir.module.interceptor;

import lombok.extern.slf4j.Slf4j;
import org.apache.cxf.binding.soap.SoapMessage;
import org.apache.cxf.binding.soap.interceptor.AbstractSoapInterceptor;
import org.apache.cxf.interceptor.Fault;
import org.apache.cxf.message.Message;
import org.apache.cxf.phase.Phase;
import org.apache.tomcat.util.codec.binary.Base64;
import org.junit.platform.commons.util.StringUtils;

import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.TreeMap;

/**
 * Package: cn.kuifir.module.interceptor
 * <p>
 * Description： TODO
 * <p>
 * Author: baci
 * <p>
 * Date: Created in 2022/3/6 13:40
 * <p>
 * Version: 0.0.1
 */
@Slf4j
public class ClientInterceptor extends AbstractSoapInterceptor {

    private String appId;

    private String password;

    private String authorization;


    public ClientInterceptor(String appId, String password, String authorization) {
        super(Phase.WRITE);
        this.appId = appId;
        this.password = password;
        this.authorization = authorization;
    }

    @SuppressWarnings("unchecked")
    public void handleMessage(SoapMessage message) throws Fault {
        TreeMap<String, ArrayList<String>> map = (TreeMap<String, ArrayList<String>>) message.get(Message.PROTOCOL_HEADERS);

        if (StringUtils.isBlank(authorization)) {
            //信息
            authorization = appId + ":" + password;
            //对信息进行加密
            authorization = new String(Base64.encodeBase64(authorization.getBytes()), StandardCharsets.UTF_8);
            authorization = "basic " + authorization;
        } else {
            if (!authorization.startsWith("basic")) {
                authorization = "basic " + authorization;
            }
        }

        ArrayList<String> appIdList = new ArrayList<String>();
        appIdList.add(appId);
        ArrayList<String> authorizationList = new ArrayList<String>();
        authorizationList.add(authorization);
        map.put("AppId", appIdList);
        map.put("Authorization", authorizationList);
        log.debug("移动云认证：appId:{},password:{},authorization:{}", appId, password, authorization);

    }
}

