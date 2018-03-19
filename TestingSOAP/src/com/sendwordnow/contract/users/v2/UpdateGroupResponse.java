
package com.sendwordnow.contract.users.v2;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import com.sendwordnow.ObjActionResult;


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
 *         &lt;element ref="{http://www.sendwordnow.com}updateGroupResult"/>
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
    "updateGroupResult"
})
@XmlRootElement(name = "updateGroupResponse")
public class UpdateGroupResponse {

    @XmlElement(namespace = "http://www.sendwordnow.com", required = true)
    protected ObjActionResult updateGroupResult;

    /**
     * Gets the value of the updateGroupResult property.
     * 
     * @return
     *     possible object is
     *     {@link ObjActionResult }
     *     
     */
    public ObjActionResult getUpdateGroupResult() {
        return updateGroupResult;
    }

    /**
     * Sets the value of the updateGroupResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link ObjActionResult }
     *     
     */
    public void setUpdateGroupResult(ObjActionResult value) {
        this.updateGroupResult = value;
    }

}
