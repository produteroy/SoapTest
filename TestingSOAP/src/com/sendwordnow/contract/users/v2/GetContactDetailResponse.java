
package com.sendwordnow.contract.users.v2;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import com.sendwordnow.schema.users.v2.ContactDetail;


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
 *         &lt;element ref="{http://www.sendwordnow.com/schema/users/v2}getContactDetailResult"/>
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

    @XmlElement(namespace = "http://www.sendwordnow.com/schema/users/v2", required = true)
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
