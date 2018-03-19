
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
 *         &lt;element name="pGrpName" type="{http://www.sendwordnow.com}GrpName"/>
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
    "pGrpName"
})
@XmlRootElement(name = "deleteGroup")
public class DeleteGroup {

    @XmlElement(required = true)
    protected String pGrpName;

    /**
     * Gets the value of the pGrpName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPGrpName() {
        return pGrpName;
    }

    /**
     * Sets the value of the pGrpName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPGrpName(String value) {
        this.pGrpName = value;
    }

}
