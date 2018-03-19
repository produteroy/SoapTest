
package com.sendwordnow.contract.users.v2;

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
 *         &lt;element name="contactIdsList" type="{http://www.sendwordnow.com/contract/users/v2}ContactIdsList"/>
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
    "contactIdsList"
})
@XmlRootElement(name = "getContactsLocations")
public class GetContactsLocations {

    @XmlElement(required = true)
    protected ContactIdsList contactIdsList;

    /**
     * Gets the value of the contactIdsList property.
     * 
     * @return
     *     possible object is
     *     {@link ContactIdsList }
     *     
     */
    public ContactIdsList getContactIdsList() {
        return contactIdsList;
    }

    /**
     * Sets the value of the contactIdsList property.
     * 
     * @param value
     *     allowed object is
     *     {@link ContactIdsList }
     *     
     */
    public void setContactIdsList(ContactIdsList value) {
        this.contactIdsList = value;
    }

}
