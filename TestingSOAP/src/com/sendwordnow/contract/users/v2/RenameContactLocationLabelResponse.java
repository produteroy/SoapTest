
package com.sendwordnow.contract.users.v2;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import com.sendwordnow.schema.users.v2.ObjActionResult;


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
 *         &lt;element name="renameContactLocationLabelResult" type="{http://www.sendwordnow.com/schema/users/v2}ObjActionResult"/>
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
    "renameContactLocationLabelResult"
})
@XmlRootElement(name = "renameContactLocationLabelResponse")
public class RenameContactLocationLabelResponse {

    @XmlElement(required = true)
    protected ObjActionResult renameContactLocationLabelResult;

    /**
     * Gets the value of the renameContactLocationLabelResult property.
     * 
     * @return
     *     possible object is
     *     {@link ObjActionResult }
     *     
     */
    public ObjActionResult getRenameContactLocationLabelResult() {
        return renameContactLocationLabelResult;
    }

    /**
     * Sets the value of the renameContactLocationLabelResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link ObjActionResult }
     *     
     */
    public void setRenameContactLocationLabelResult(ObjActionResult value) {
        this.renameContactLocationLabelResult = value;
    }

}
