
package com.sendwordnow;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.XmlValue;


/**
 * <p>Java class for GrpUpdReq complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="GrpUpdReq">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Name" type="{http://www.sendwordnow.com}GrpName"/>
 *         &lt;element name="NewName" type="{http://www.sendwordnow.com}GrpName" minOccurs="0"/>
 *         &lt;element name="NewDesc" minOccurs="0">
 *           &lt;complexType>
 *             &lt;simpleContent>
 *               &lt;extension base="&lt;http://www.sendwordnow.com>GrpDesc">
 *                 &lt;attribute name="Clear" type="{http://www.w3.org/2001/XMLSchema}boolean" default="false" />
 *               &lt;/extension>
 *             &lt;/simpleContent>
 *           &lt;/complexType>
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
@XmlType(name = "GrpUpdReq", propOrder = {
    "name",
    "newName",
    "newDesc"
})
public class GrpUpdReq {

    @XmlElement(name = "Name", required = true)
    protected String name;
    @XmlElement(name = "NewName")
    protected String newName;
    @XmlElement(name = "NewDesc")
    protected GrpUpdReq.NewDesc newDesc;

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
     * Gets the value of the newName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNewName() {
        return newName;
    }

    /**
     * Sets the value of the newName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNewName(String value) {
        this.newName = value;
    }

    /**
     * Gets the value of the newDesc property.
     * 
     * @return
     *     possible object is
     *     {@link GrpUpdReq.NewDesc }
     *     
     */
    public GrpUpdReq.NewDesc getNewDesc() {
        return newDesc;
    }

    /**
     * Sets the value of the newDesc property.
     * 
     * @param value
     *     allowed object is
     *     {@link GrpUpdReq.NewDesc }
     *     
     */
    public void setNewDesc(GrpUpdReq.NewDesc value) {
        this.newDesc = value;
    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;simpleContent>
     *     &lt;extension base="&lt;http://www.sendwordnow.com>GrpDesc">
     *       &lt;attribute name="Clear" type="{http://www.w3.org/2001/XMLSchema}boolean" default="false" />
     *     &lt;/extension>
     *   &lt;/simpleContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "value"
    })
    public static class NewDesc {

        @XmlValue
        protected String value;
        @XmlAttribute(name = "Clear")
        protected Boolean clear;

        /**
         * Gets the value of the value property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getValue() {
            return value;
        }

        /**
         * Sets the value of the value property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setValue(String value) {
            this.value = value;
        }

        /**
         * Gets the value of the clear property.
         * 
         * @return
         *     possible object is
         *     {@link Boolean }
         *     
         */
        public boolean isClear() {
            if (clear == null) {
                return false;
            } else {
                return clear;
            }
        }

        /**
         * Sets the value of the clear property.
         * 
         * @param value
         *     allowed object is
         *     {@link Boolean }
         *     
         */
        public void setClear(Boolean value) {
            this.clear = value;
        }

    }

}
