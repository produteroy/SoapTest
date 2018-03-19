
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
 *         &lt;element name="pXML" type="{http://www.w3.org/2001/XMLSchema}string"/>
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
    "pxml"
})
@XmlRootElement(name = "importFromXML")
public class ImportFromXML {

    @XmlElement(name = "pXML", required = true)
    protected String pxml;

    /**
     * Gets the value of the pxml property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPXML() {
        return pxml;
    }

    /**
     * Sets the value of the pxml property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPXML(String value) {
        this.pxml = value;
    }

}
