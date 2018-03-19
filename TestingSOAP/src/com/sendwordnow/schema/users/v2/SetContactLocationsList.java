
package com.sendwordnow.schema.users.v2;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for SetContactLocationsList complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SetContactLocationsList">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ContactId" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="LocationsToRemove" type="{http://www.sendwordnow.com/schema/users/v2}ArrayOfLocationLabels" minOccurs="0"/>
 *         &lt;element name="LocationsToAddOrUpdate" type="{http://www.sendwordnow.com/schema/users/v2}ArrayOfContactLocation" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SetContactLocationsList", propOrder = {
    "contactId",
    "locationsToRemove",
    "locationsToAddOrUpdate"
})
public class SetContactLocationsList {

    @XmlElement(name = "ContactId", required = true)
    protected String contactId;
    @XmlElement(name = "LocationsToRemove")
    protected ArrayOfLocationLabels locationsToRemove;
    @XmlElement(name = "LocationsToAddOrUpdate")
    protected ArrayOfContactLocation locationsToAddOrUpdate;

    /**
     * Gets the value of the contactId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getContactId() {
        return contactId;
    }

    /**
     * Sets the value of the contactId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setContactId(String value) {
        this.contactId = value;
    }

    /**
     * Gets the value of the locationsToRemove property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfLocationLabels }
     *     
     */
    public ArrayOfLocationLabels getLocationsToRemove() {
        return locationsToRemove;
    }

    /**
     * Sets the value of the locationsToRemove property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfLocationLabels }
     *     
     */
    public void setLocationsToRemove(ArrayOfLocationLabels value) {
        this.locationsToRemove = value;
    }

    /**
     * Gets the value of the locationsToAddOrUpdate property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfContactLocation }
     *     
     */
    public ArrayOfContactLocation getLocationsToAddOrUpdate() {
        return locationsToAddOrUpdate;
    }

    /**
     * Sets the value of the locationsToAddOrUpdate property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfContactLocation }
     *     
     */
    public void setLocationsToAddOrUpdate(ArrayOfContactLocation value) {
        this.locationsToAddOrUpdate = value;
    }

}
