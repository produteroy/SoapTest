
package com.sendwordnow.contract.users.v2;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import com.sendwordnow.GrpDetail;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{http://www.sendwordnow.com}getGroupDetailResult"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "getGroupDetailResult"
})
@XmlRootElement(name = "getGroupDetailResponse")
public class GetGroupDetailResponse {

    @XmlElement(namespace = "http://www.sendwordnow.com", required = true)
    protected GrpDetail getGroupDetailResult;

    /**
     * Gets the value of the getGroupDetailResult property.
     * 
     * @return
     *     possible object is
     *     {@link GrpDetail }
     *     
     */
    public GrpDetail getGetGroupDetailResult() {
        return getGroupDetailResult;
    }

    /**
     * Sets the value of the getGroupDetailResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link GrpDetail }
     *     
     */
    public void setGetGroupDetailResult(GrpDetail value) {
        this.getGroupDetailResult = value;
    }

}
