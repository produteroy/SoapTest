
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
 *         &lt;element name="createContactsResult" type="{http://www.sendwordnow.com/contract/users/v2}ArrayOfObjActionResult"/>
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
    "createContactsResult"
})
@XmlRootElement(name = "createContactsResponse")
public class CreateContactsResponse {

    @XmlElement(required = true)
    protected ArrayOfObjActionResult createContactsResult;

    /**
     * Gets the value of the createContactsResult property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfObjActionResult }
     *     
     */
    public ArrayOfObjActionResult getCreateContactsResult() {
        return createContactsResult;
    }

    /**
     * Sets the value of the createContactsResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfObjActionResult }
     *     
     */
    public void setCreateContactsResult(ArrayOfObjActionResult value) {
        this.createContactsResult = value;
    }

}
