
package com.sendwordnow;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
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
 *         &lt;element name="isContactInAccountResult" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
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
    "isContactInAccountResult"
})
@XmlRootElement(name = "isContactInAccountResponse")
public class IsContactInAccountResponse {

    protected boolean isContactInAccountResult;

    /**
     * Gets the value of the isContactInAccountResult property.
     * 
     */
    public boolean isIsContactInAccountResult() {
        return isContactInAccountResult;
    }

    /**
     * Sets the value of the isContactInAccountResult property.
     * 
     */
    public void setIsContactInAccountResult(boolean value) {
        this.isContactInAccountResult = value;
    }

}
