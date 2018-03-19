
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
 *         &lt;element name="pGrpName" type="{http://www.sendwordnow.com}GrpName"/>
 *         &lt;element name="pContactId">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;minLength value="1"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
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
    "pGrpName",
    "pContactId"
})
@XmlRootElement(name = "isContactInGroup")
public class IsContactInGroup {

    @XmlElement(required = true)
    protected String pGrpName;
    @XmlElement(required = true)
    protected String pContactId;

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

    /**
     * Gets the value of the pContactId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPContactId() {
        return pContactId;
    }

    /**
     * Sets the value of the pContactId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPContactId(String value) {
        this.pContactId = value;
    }

}
