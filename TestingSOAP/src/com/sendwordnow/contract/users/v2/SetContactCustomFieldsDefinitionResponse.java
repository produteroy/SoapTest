
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
 *         &lt;element name="setContactCustomFieldsDefinitionResult" type="{http://www.sendwordnow.com/contract/users/v2}ArrayOfObjActionResult2"/>
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
    "setContactCustomFieldsDefinitionResult"
})
@XmlRootElement(name = "setContactCustomFieldsDefinitionResponse")
public class SetContactCustomFieldsDefinitionResponse {

    @XmlElement(required = true)
    protected ArrayOfObjActionResult2 setContactCustomFieldsDefinitionResult;

    /**
     * Gets the value of the setContactCustomFieldsDefinitionResult property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfObjActionResult2 }
     *     
     */
    public ArrayOfObjActionResult2 getSetContactCustomFieldsDefinitionResult() {
        return setContactCustomFieldsDefinitionResult;
    }

    /**
     * Sets the value of the setContactCustomFieldsDefinitionResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfObjActionResult2 }
     *     
     */
    public void setSetContactCustomFieldsDefinitionResult(ArrayOfObjActionResult2 value) {
        this.setContactCustomFieldsDefinitionResult = value;
    }

}
