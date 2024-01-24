
package cn.com.cnooc.mobile.api.common;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>whiteListItem complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="whiteListItem"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="matchValue" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="matchType" type="{http://mobile.cnooc.com.cn/api/common}matchType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "whiteListItem", propOrder = {
    "matchValue",
    "matchType"
})
public class WhiteListItem {

    protected String matchValue;
    @XmlSchemaType(name = "string")
    protected MatchType matchType;

    /**
     * 获取matchValue属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMatchValue() {
        return matchValue;
    }

    /**
     * 设置matchValue属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMatchValue(String value) {
        this.matchValue = value;
    }

    /**
     * 获取matchType属性的值。
     * 
     * @return
     *     possible object is
     *     {@link MatchType }
     *     
     */
    public MatchType getMatchType() {
        return matchType;
    }

    /**
     * 设置matchType属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link MatchType }
     *     
     */
    public void setMatchType(MatchType value) {
        this.matchType = value;
    }

}
