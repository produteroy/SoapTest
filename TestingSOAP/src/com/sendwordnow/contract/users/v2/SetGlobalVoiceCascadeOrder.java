
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
 *         &lt;element name="labelsToUpdate" type="{http://www.sendwordnow.com/contract/users/v2}ArrayOfCustomLabelNames"/>
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
    "labelsToUpdate"
})
@XmlRootElement(name = "setGlobalVoiceCascadeOrder")
public class SetGlobalVoiceCascadeOrder {

    @XmlElement(required = true)
    protected ArrayOfCustomLabelNames labelsToUpdate;

    /**
     * Gets the value of the labelsToUpdate property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfCustomLabelNames }
     *     
     */
    public ArrayOfCustomLabelNames getLabelsToUpdate() {
        return labelsToUpdate;
    }

    /**
     * Sets the value of the labelsToUpdate property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfCustomLabelNames }
     *     
     */
    public void setLabelsToUpdate(ArrayOfCustomLabelNames value) {
        this.labelsToUpdate = value;
    }

}
