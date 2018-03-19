
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
 *         &lt;element name="getContactDetailResult" type="{http://www.sendwordnow.com}ContactDetail"/>
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
    "getContactDetailResult"
})
@XmlRootElement(name = "getContactDetailResponse")
public class GetContactDetailResponse {

    @XmlElement(required = true)
    protected ContactDetail getContactDetailResult;

    /**
     * Gets the value of the getContactDetailResult property.
     * 
     * @return
     *     possible object is
     *     {@link ContactDetail }
     *     
     */
    public ContactDetail getGetContactDetailResult() {
        return getContactDetailResult;
    }

    /**
     * Sets the value of the getContactDetailResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link ContactDetail }
     *     
     */
    public void setGetContactDetailResult(ContactDetail value) {
        this.getContactDetailResult = value;
    }

}
