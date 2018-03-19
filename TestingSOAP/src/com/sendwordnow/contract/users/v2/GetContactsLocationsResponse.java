
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
 *         &lt;element name="getContactsLocationsResult" type="{http://www.sendwordnow.com/contract/users/v2}ArrayOfContactLocationsList"/>
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
    "getContactsLocationsResult"
})
@XmlRootElement(name = "getContactsLocationsResponse")
public class GetContactsLocationsResponse {

    @XmlElement(required = true)
    protected ArrayOfContactLocationsList getContactsLocationsResult;

    /**
     * Gets the value of the getContactsLocationsResult property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfContactLocationsList }
     *     
     */
    public ArrayOfContactLocationsList getGetContactsLocationsResult() {
        return getContactsLocationsResult;
    }

    /**
     * Sets the value of the getContactsLocationsResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfContactLocationsList }
     *     
     */
    public void setGetContactsLocationsResult(ArrayOfContactLocationsList value) {
        this.getContactsLocationsResult = value;
    }

}
