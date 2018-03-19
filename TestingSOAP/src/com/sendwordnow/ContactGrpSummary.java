
package com.sendwordnow;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ContactGrpSummary complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ContactGrpSummary">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.sendwordnow.com}GrpSummary">
 *       &lt;sequence>
 *         &lt;element name="ContactId" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="InGrp" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ContactGrpSummary", propOrder = {
    "contactId",
    "inGrp"
})
public class ContactGrpSummary
    extends GrpSummary
{

    @XmlElement(name = "ContactId", required = true)
    protected String contactId;
    @XmlElement(name = "InGrp")
    protected boolean inGrp;

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
     * Gets the value of the inGrp property.
     * 
     */
    public boolean isInGrp() {
        return inGrp;
    }

    /**
     * Sets the value of the inGrp property.
     * 
     */
    public void setInGrp(boolean value) {
        this.inGrp = value;
    }

}
