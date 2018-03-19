
package com.sendwordnow.contract.users.v2;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import com.sendwordnow.schema.users.v2.ArrayOfObjActionResult;


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
 *         &lt;element name="setContactsLocationsResult" type="{http://www.sendwordnow.com/schema/users/v2}ArrayOfObjActionResult"/>
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
    "setContactsLocationsResult"
})
@XmlRootElement(name = "setContactsLocationsResponse")
public class SetContactsLocationsResponse {

    @XmlElement(required = true)
    protected ArrayOfObjActionResult setContactsLocationsResult;

    /**
     * Gets the value of the setContactsLocationsResult property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfObjActionResult }
     *     
     */
    public ArrayOfObjActionResult getSetContactsLocationsResult() {
        return setContactsLocationsResult;
    }

    /**
     * Sets the value of the setContactsLocationsResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfObjActionResult }
     *     
     */
    public void setSetContactsLocationsResult(ArrayOfObjActionResult value) {
        this.setContactsLocationsResult = value;
    }

}
