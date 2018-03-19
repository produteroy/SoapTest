
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
 *         &lt;element ref="{http://www.sendwordnow.com}deleteGroupResult"/>
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
    "deleteGroupResult"
})
@XmlRootElement(name = "deleteGroupResponse")
public class DeleteGroupResponse {

    @XmlElement(required = true)
    protected ObjActionResult deleteGroupResult;

    /**
     * Gets the value of the deleteGroupResult property.
     * 
     * @return
     *     possible object is
     *     {@link ObjActionResult }
     *     
     */
    public ObjActionResult getDeleteGroupResult() {
        return deleteGroupResult;
    }

    /**
     * Sets the value of the deleteGroupResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link ObjActionResult }
     *     
     */
    public void setDeleteGroupResult(ObjActionResult value) {
        this.deleteGroupResult = value;
    }

}
