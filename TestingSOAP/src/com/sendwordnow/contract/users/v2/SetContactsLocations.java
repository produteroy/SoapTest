
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
 *         &lt;element name="locationsInfo" type="{http://www.sendwordnow.com/contract/users/v2}ArrayOfSetContactLocationsList"/>
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
    "locationsInfo"
})
@XmlRootElement(name = "setContactsLocations")
public class SetContactsLocations {

    @XmlElement(required = true)
    protected ArrayOfSetContactLocationsList locationsInfo;

    /**
     * Gets the value of the locationsInfo property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfSetContactLocationsList }
     *     
     */
    public ArrayOfSetContactLocationsList getLocationsInfo() {
        return locationsInfo;
    }

    /**
     * Sets the value of the locationsInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfSetContactLocationsList }
     *     
     */
    public void setLocationsInfo(ArrayOfSetContactLocationsList value) {
        this.locationsInfo = value;
    }

}
