
package cn.kuifir.module.generatedCode;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>notifyType的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * <pre>
 * &lt;simpleType name="notifyType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="MESSAGE"/&gt;
 *     &lt;enumeration value="IMAGE"/&gt;
 *     &lt;enumeration value="FILE"/&gt;
 *     &lt;enumeration value="NEWS"/&gt;
 *     &lt;enumeration value="APPROVAL"/&gt;
 *     &lt;enumeration value="SUBS"/&gt;
 *     &lt;enumeration value="REPORT"/&gt;
 *     &lt;enumeration value="SURVEY"/&gt;
 *     &lt;enumeration value="LINK"/&gt;
 *     &lt;enumeration value="DATAGRAPH"/&gt;
 *     &lt;enumeration value="SHARE"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "notifyType")
@XmlEnum
public enum NotifyType {

    MESSAGE,
    IMAGE,
    FILE,
    NEWS,
    APPROVAL,
    SUBS,
    REPORT,
    SURVEY,
    LINK,
    DATAGRAPH,
    SHARE;

    public String value() {
        return name();
    }

    public static NotifyType fromValue(String v) {
        return valueOf(v);
    }

}
