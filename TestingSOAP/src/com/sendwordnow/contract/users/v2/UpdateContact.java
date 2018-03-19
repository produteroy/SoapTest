
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
 *         &lt;element ref="{http://www.sendwordnow.com/schema/users/v2}ContactDetail"/>
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
    "contactDetail"
})
@XmlRootElement(name = "updateContact")
public class UpdateContact {

    @XmlElement(name = "ContactDetail", namespace = "http://www.sendwordnow.com/schema/users/v2", required = true)
    protected ContactDetail contactDetail;

    /**
     * Gets the value of the contactDetail property.
     * 
     * @return
     *     possible object is
     *     {@link ContactDetail }
     *     
     */
    public ContactDetail getContactDetail() {
        return contactDetail;
    }

    /**
     * Sets the value of the contactDetail property.
     * 
     * @param value
     *     allowed object is
     *     {@link ContactDetail }
     *     
     */
    public void setContactDetail(ContactDetail value) {
        this.contactDetail = value;
    }

}
