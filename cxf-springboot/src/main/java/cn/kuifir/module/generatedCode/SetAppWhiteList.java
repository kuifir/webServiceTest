
package cn.kuifir.module.generatedCode;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>setAppWhiteList complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="setAppWhiteList"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="whiteList" type="{http://mobile.cnooc.com.cn/api/common}whiteListItem" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "setAppWhiteList", propOrder = {
    "whiteList"
})
public class SetAppWhiteList {

    protected List<WhiteListItem> whiteList;

    /**
     * Gets the value of the whiteList property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the whiteList property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getWhiteList().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link WhiteListItem }
     * 
     * 
     */
    public List<WhiteListItem> getWhiteList() {
        if (whiteList == null) {
            whiteList = new ArrayList<WhiteListItem>();
        }
        return this.whiteList;
    }

}
