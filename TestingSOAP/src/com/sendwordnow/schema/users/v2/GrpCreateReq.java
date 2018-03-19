
package com.sendwordnow.schema.users.v2;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for GrpCreateReq complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="GrpCreateReq">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Name" type="{http://www.sendwordnow.com}GrpName"/>
 *         &lt;element name="Desc" type="{http://www.sendwordnow.com}GrpDesc" minOccurs="0"/>
 *         &lt;element name="ContactsList" type="{http://www.sendwordnow.com/schema/users/v2}GrpCreateReqContactsList"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GrpCreateReq", propOrder = {
    "name",
    "desc",
    "contactsList"
})
public class GrpCreateReq {

    @XmlElement(name = "Name", required = true)
    protected String name;
    @XmlElement(name = "Desc")
    protected String desc;
    @XmlElement(name = "ContactsList", required = true)
    protected GrpCreateReqContactsList contactsList;

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
     * Gets the value of the desc property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDesc() {
        return desc;
    }

    /**
     * Sets the value of the desc property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDesc(String value) {
        this.desc = value;
    }

    /**
     * Gets the value of the contactsList property.
     * 
     * @return
     *     possible object is
     *     {@link GrpCreateReqContactsList }
     *     
     */
    public GrpCreateReqContactsList getContactsList() {
        return contactsList;
    }

    /**
     * Sets the value of the contactsList property.
     * 
     * @param value
     *     allowed object is
     *     {@link GrpCreateReqContactsList }
     *     
     */
    public void setContactsList(GrpCreateReqContactsList value) {
        this.contactsList = value;
    }

}
