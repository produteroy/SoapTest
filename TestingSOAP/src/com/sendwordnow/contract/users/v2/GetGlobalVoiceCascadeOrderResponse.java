
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
 *         &lt;element name="getGlobalVoiceCascadeOrderResult" type="{http://www.sendwordnow.com/contract/users/v2}ArrayOfString"/>
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
    "getGlobalVoiceCascadeOrderResult"
})
@XmlRootElement(name = "getGlobalVoiceCascadeOrderResponse")
public class GetGlobalVoiceCascadeOrderResponse {

    @XmlElement(required = true)
    protected ArrayOfString getGlobalVoiceCascadeOrderResult;

    /**
     * Gets the value of the getGlobalVoiceCascadeOrderResult property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfString }
     *     
     */
    public ArrayOfString getGetGlobalVoiceCascadeOrderResult() {
        return getGlobalVoiceCascadeOrderResult;
    }

    /**
     * Sets the value of the getGlobalVoiceCascadeOrderResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfString }
     *     
     */
    public void setGetGlobalVoiceCascadeOrderResult(ArrayOfString value) {
        this.getGlobalVoiceCascadeOrderResult = value;
    }

}
