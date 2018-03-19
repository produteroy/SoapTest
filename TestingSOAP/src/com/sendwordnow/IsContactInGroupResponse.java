
package com.sendwordnow;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


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
 *         &lt;element ref="{http://www.sendwordnow.com}isContactInGroupResult"/>
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
    "isContactInGroupResult"
})
@XmlRootElement(name = "isContactInGroupResponse")
public class IsContactInGroupResponse {

    @XmlElement(required = true)
    protected ContactGrpSummary isContactInGroupResult;

    /**
     * Gets the value of the isContactInGroupResult property.
     * 
     * @return
     *     possible object is
     *     {@link ContactGrpSummary }
     *     
     */
    public ContactGrpSummary getIsContactInGroupResult() {
        return isContactInGroupResult;
    }

    /**
     * Sets the value of the isContactInGroupResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link ContactGrpSummary }
     *     
     */
    public void setIsContactInGroupResult(ContactGrpSummary value) {
        this.isContactInGroupResult = value;
    }

}
