
package cn.kuifir.module.generatedCode;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>getOrganUserTree complex type�� Java �ࡣ
 * 
 * <p>����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
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
     * ��ȡqueryBy���Ե�ֵ��
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
     * ����queryBy���Ե�ֵ��
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
     * ��ȡparentOrganId���Ե�ֵ��
     * 
     */
    public int getParentOrganId() {
        return parentOrganId;
    }

    /**
     * ����parentOrganId���Ե�ֵ��
     * 
     */
    public void setParentOrganId(int value) {
        this.parentOrganId = value;
    }

}
