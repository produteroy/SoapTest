
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
 *         &lt;element name="oldLabel" type="{http://www.sendwordnow.com/schema/users/v2}ContactLocationLabelName"/>
 *         &lt;element name="newLabel" type="{http://www.sendwordnow.com/schema/users/v2}ContactLocationLabelName"/>
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
    "oldLabel",
    "newLabel"
})
@XmlRootElement(name = "renameContactLocationLabel")
public class RenameContactLocationLabel {

    @XmlElement(required = true)
    protected String oldLabel;
    @XmlElement(required = true)
    protected String newLabel;

    /**
     * Gets the value of the oldLabel property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOldLabel() {
        return oldLabel;
    }

    /**
     * Sets the value of the oldLabel property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOldLabel(String value) {
        this.oldLabel = value;
    }

    /**
     * Gets the value of the newLabel property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNewLabel() {
        return newLabel;
    }

    /**
     * Sets the value of the newLabel property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNewLabel(String value) {
        this.newLabel = value;
    }

}
