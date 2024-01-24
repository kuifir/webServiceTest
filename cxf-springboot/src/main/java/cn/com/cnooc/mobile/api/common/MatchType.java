
package cn.com.cnooc.mobile.api.common;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>matchType的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * <pre>
 * &lt;simpleType name="matchType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="USER"/&gt;
 *     &lt;enumeration value="COMPANY"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "matchType")
@XmlEnum
public enum MatchType {

    USER,
    COMPANY;

    public String value() {
        return name();
    }

    public static MatchType fromValue(String v) {
        return valueOf(v);
    }

}
