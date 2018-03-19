
package com.sendwordnow.schema.users.v2;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for GrpCreateReqContactsList complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="GrpCreateReqContactsList">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="NewContacts" type="{http://www.sendwordnow.com/schema/users/v2}ArrayOfContactDetail" minOccurs="0"/>
 *         &lt;element name="ExistingContacts" type="{http://www.sendwordnow.com/schema/users/v2}ArrayOfContactIds" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GrpCreateReqContactsList", propOrder = {
    "newContacts",
    "existingContacts"
})
public class GrpCreateReqContactsList {

    @XmlElement(name = "NewContacts")
    protected ArrayOfContactDetail newContacts;
    @XmlElement(name = "ExistingContacts")
    protected ArrayOfContactIds existingContacts;

    /**
     * Gets the value of the newContacts property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfContactDetail }
     *     
     */
    public ArrayOfContactDetail getNewContacts() {
        return newContacts;
    }

    /**
     * Sets the value of the newContacts property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfContactDetail }
     *     
     */
    public void setNewContacts(ArrayOfContactDetail value) {
        this.newContacts = value;
    }

    /**
     * Gets the value of the existingContacts property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfContactIds }
     *     
     */
    public ArrayOfContactIds getExistingContacts() {
        return existingContacts;
    }

    /**
     * Sets the value of the existingContacts property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfContactIds }
     *     
     */
    public void setExistingContacts(ArrayOfContactIds value) {
        this.existingContacts = value;
    }

}
