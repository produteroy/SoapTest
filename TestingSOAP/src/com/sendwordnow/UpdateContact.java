
package com.sendwordnow;

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
 *         &lt;element name="pOrig" type="{http://www.sendwordnow.com}ContactDetail"/>
 *         &lt;element name="pNew" type="{http://www.sendwordnow.com}ContactDetail"/>
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
    "pOrig",
    "pNew"
})
@XmlRootElement(name = "updateContact")
public class UpdateContact {

    @XmlElement(required = true)
    protected ContactDetail pOrig;
    @XmlElement(required = true)
    protected ContactDetail pNew;

    /**
     * Gets the value of the pOrig property.
     * 
     * @return
     *     possible object is
     *     {@link ContactDetail }
     *     
     */
    public ContactDetail getPOrig() {
        return pOrig;
    }

    /**
     * Sets the value of the pOrig property.
     * 
     * @param value
     *     allowed object is
     *     {@link ContactDetail }
     *     
     */
    public void setPOrig(ContactDetail value) {
        this.pOrig = value;
    }

    /**
     * Gets the value of the pNew property.
     * 
     * @return
     *     possible object is
     *     {@link ContactDetail }
     *     
     */
    public ContactDetail getPNew() {
        return pNew;
    }

    /**
     * Sets the value of the pNew property.
     * 
     * @param value
     *     allowed object is
     *     {@link ContactDetail }
     *     
     */
    public void setPNew(ContactDetail value) {
        this.pNew = value;
    }

}
