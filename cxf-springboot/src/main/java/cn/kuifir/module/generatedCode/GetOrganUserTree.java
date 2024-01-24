
package cn.kuifir.module.generatedCode;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>getOrganUserTree complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="getOrganUserTree"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="queryBy" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="parentOrganId" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "getOrganUserTree", propOrder = {
    "queryBy",
    "parentOrganId"
})
public class GetOrganUserTree {

    protected String queryBy;
    protected int parentOrganId;

    /**
     * 获取queryBy属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getQueryBy() {
        return queryBy;
    }

    /**
     * 设置queryBy属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setQueryBy(String value) {
        this.queryBy = value;
    }

    /**
     * 获取parentOrganId属性的值。
     * 
     */
    public int getParentOrganId() {
        return parentOrganId;
    }

    /**
     * 设置parentOrganId属性的值。
     * 
     */
    public void setParentOrganId(int value) {
        this.parentOrganId = value;
    }

}
