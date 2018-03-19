
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
 *         &lt;element name="deleteContactsResult" type="{http://www.sendwordnow.com}ArrayOfObjActionResult"/>
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
    "deleteContactsResult"
})
@XmlRootElement(name = "deleteContactsResponse")
public class DeleteContactsResponse {

    @XmlElement(required = true)
    protected ArrayOfObjActionResult deleteContactsResult;

    /**
     * Gets the value of the deleteContactsResult property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfObjActionResult }
     *     
     */
    public ArrayOfObjActionResult getDeleteContactsResult() {
        return deleteContactsResult;
    }

    /**
     * Sets the value of the deleteContactsResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfObjActionResult }
     *     
     */
    public void setDeleteContactsResult(ArrayOfObjActionResult value) {
        this.deleteContactsResult = value;
    }

}
