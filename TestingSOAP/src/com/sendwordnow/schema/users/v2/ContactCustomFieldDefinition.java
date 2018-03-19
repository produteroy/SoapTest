
package com.sendwordnow.schema.users.v2;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ContactCustomFieldDefinition complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ContactCustomFieldDefinition">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Name" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="MinInstancesCount" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="MaxInstancesCount" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="ValidationRegExPattern" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ContactCustomFieldDefinition", propOrder = {
    "name",
    "minInstancesCount",
    "maxInstancesCount",
    "validationRegExPattern"
})
public class ContactCustomFieldDefinition {

    @XmlElement(name = "Name", required = true)
    protected String name;
    @XmlElement(name = "MinInstancesCount")
    protected Integer minInstancesCount;
    @XmlElement(name = "MaxInstancesCount")
    protected Integer maxInstancesCount;
    @XmlElement(name = "ValidationRegExPattern")
    protected String validationRegExPattern;

    /**
     * Gets the value of the name property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getName() {
        return name;
    }

    /**
     * Sets the value of the name property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setName(String value) {
        this.name = value;
    }

    /**
     * Gets the value of the minInstancesCount property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getMinInstancesCount() {
        return minInstancesCount;
    }

    /**
     * Sets the value of the minInstancesCount property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setMinInstancesCount(Integer value) {
        this.minInstancesCount = value;
    }

    /**
     * Gets the value of the maxInstancesCount property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getMaxInstancesCount() {
        return maxInstancesCount;
    }

    /**
     * Sets the value of the maxInstancesCount property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setMaxInstancesCount(Integer value) {
        this.maxInstancesCount = value;
    }

    /**
     * Gets the value of the validationRegExPattern property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getValidationRegExPattern() {
        return validationRegExPattern;
    }

    /**
     * Sets the value of the validationRegExPattern property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setValidationRegExPattern(String value) {
        this.validationRegExPattern = value;
    }

}
