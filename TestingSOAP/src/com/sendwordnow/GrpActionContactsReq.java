
package com.sendwordnow;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for GrpActionContactsReq complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="GrpActionContactsReq">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ActionType" type="{http://www.sendwordnow.com}GrpActionContactsReqActionType"/>
 *         &lt;element name="GroupName" type="{http://www.sendwordnow.com}GrpName"/>
 *         &lt;element name="ContactIdsList" type="{http://www.sendwordnow.com}ArrayOfString1" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GrpActionContactsReq", propOrder = {
    "actionType",
    "groupName",
    "contactIdsList"
})
public class GrpActionContactsReq {

    @XmlElement(name = "ActionType", required = true)
    @XmlSchemaType(name = "string")
    protected GrpActionContactsReqActionType actionType;
    @XmlElement(name = "GroupName", required = true)
    protected String groupName;
    @XmlElement(name = "ContactIdsList")
    protected ArrayOfString1 contactIdsList;

    /**
     * Gets the value of the actionType property.
     * 
     * @return
     *     possible object is
     *     {@link GrpActionContactsReqActionType }
     *     
     */
    public GrpActionContactsReqActionType getActionType() {
        return actionType;
    }

    /**
     * Sets the value of the actionType property.
     * 
     * @param value
     *     allowed object is
     *     {@link GrpActionContactsReqActionType }
     *     
     */
    public void setActionType(GrpActionContactsReqActionType value) {
        this.actionType = value;
    }

    /**
     * Gets the value of the groupName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGroupName() {
        return groupName;
    }

    /**
     * Sets the value of the groupName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGroupName(String value) {
        this.groupName = value;
    }

    /**
     * Gets the value of the contactIdsList property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfString1 }
     *     
     */
    public ArrayOfString1 getContactIdsList() {
        return contactIdsList;
    }

    /**
     * Sets the value of the contactIdsList property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfString1 }
     *     
     */
    public void setContactIdsList(ArrayOfString1 value) {
        this.contactIdsList = value;
    }

}
