
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
 *         &lt;element name="deleteContactLocationLabelResult" type="{http://www.sendwordnow.com/schema/users/v2}ObjActionResult"/>
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
    "deleteContactLocationLabelResult"
})
@XmlRootElement(name = "deleteContactLocationLabelResponse")
public class DeleteContactLocationLabelResponse {

    @XmlElement(required = true)
    protected ObjActionResult deleteContactLocationLabelResult;

    /**
     * Gets the value of the deleteContactLocationLabelResult property.
     * 
     * @return
     *     possible object is
     *     {@link ObjActionResult }
     *     
     */
    public ObjActionResult getDeleteContactLocationLabelResult() {
        return deleteContactLocationLabelResult;
    }

    /**
     * Sets the value of the deleteContactLocationLabelResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link ObjActionResult }
     *     
     */
    public void setDeleteContactLocationLabelResult(ObjActionResult value) {
        this.deleteContactLocationLabelResult = value;
    }

}
