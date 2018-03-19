
package com.sendwordnow;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for actionContactsGroupResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="actionContactsGroupResponse">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="actionContactsGroupResult" type="{http://www.sendwordnow.com}ArrayOfObjActionResult"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "actionContactsGroupResponse", propOrder = {
    "actionContactsGroupResult"
})
public class ActionContactsGroupResponse {

    @XmlElement(required = true)
    protected ArrayOfObjActionResult actionContactsGroupResult;

    /**
     * Gets the value of the actionContactsGroupResult property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfObjActionResult }
     *     
     */
    public ArrayOfObjActionResult getActionContactsGroupResult() {
        return actionContactsGroupResult;
    }

    /**
     * Sets the value of the actionContactsGroupResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfObjActionResult }
     *     
     */
    public void setActionContactsGroupResult(ArrayOfObjActionResult value) {
        this.actionContactsGroupResult = value;
    }

}
