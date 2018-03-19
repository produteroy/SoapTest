
package com.sendwordnow.contract.users.v2;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import com.sendwordnow.schema.users.v2.ArrayOfContactLocationLabel;


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
 *         &lt;element name="getContactLocationLabelsResult" type="{http://www.sendwordnow.com/schema/users/v2}ArrayOfContactLocationLabel"/>
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
    "getContactLocationLabelsResult"
})
@XmlRootElement(name = "getContactLocationLabelsResponse")
public class GetContactLocationLabelsResponse {

    @XmlElement(required = true)
    protected ArrayOfContactLocationLabel getContactLocationLabelsResult;

    /**
     * Gets the value of the getContactLocationLabelsResult property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfContactLocationLabel }
     *     
     */
    public ArrayOfContactLocationLabel getGetContactLocationLabelsResult() {
        return getContactLocationLabelsResult;
    }

    /**
     * Sets the value of the getContactLocationLabelsResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfContactLocationLabel }
     *     
     */
    public void setGetContactLocationLabelsResult(ArrayOfContactLocationLabel value) {
        this.getContactLocationLabelsResult = value;
    }

}
