
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
 *         &lt;element name="Definition" type="{http://www.sendwordnow.com/contract/users/v2}ArrayOfContactCustomFieldDefinition"/>
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
    "definition"
})
@XmlRootElement(name = "setContactCustomFieldsDefinition")
public class SetContactCustomFieldsDefinition {

    @XmlElement(name = "Definition", required = true)
    protected ArrayOfContactCustomFieldDefinition definition;

    /**
     * Gets the value of the definition property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfContactCustomFieldDefinition }
     *     
     */
    public ArrayOfContactCustomFieldDefinition getDefinition() {
        return definition;
    }

    /**
     * Sets the value of the definition property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfContactCustomFieldDefinition }
     *     
     */
    public void setDefinition(ArrayOfContactCustomFieldDefinition value) {
        this.definition = value;
    }

}
