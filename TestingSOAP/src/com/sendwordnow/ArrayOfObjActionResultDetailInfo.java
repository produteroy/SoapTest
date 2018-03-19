
package com.sendwordnow;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfObjActionResultDetailInfo complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfObjActionResultDetailInfo">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="DetailInfo" type="{http://www.sendwordnow.com}ObjActionResultDetailInfo" maxOccurs="unbounded"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfObjActionResultDetailInfo", propOrder = {
    "detailInfo"
})
public class ArrayOfObjActionResultDetailInfo {

    @XmlElement(name = "DetailInfo", required = true)
    protected List<ObjActionResultDetailInfo> detailInfo;

    /**
     * Gets the value of the detailInfo property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the detailInfo property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDetailInfo().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ObjActionResultDetailInfo }
     * 
     * 
     */
    public List<ObjActionResultDetailInfo> getDetailInfo() {
        if (detailInfo == null) {
            detailInfo = new ArrayList<ObjActionResultDetailInfo>();
        }
        return this.detailInfo;
    }

}
