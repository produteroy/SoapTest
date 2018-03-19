
package com.sendwordnow.schema.users.v2;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import com.sendwordnow.ArrayOfObjActionResultDetailInfo;


/**
 * <p>Java class for ObjActionResult complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ObjActionResult">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ObjType" type="{http://www.sendwordnow.com/schema/users/v2}ObjActionResultObjType"/>
 *         &lt;element name="ObjId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Details" type="{http://www.sendwordnow.com}ArrayOfObjActionResultDetailInfo"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ObjActionResult", propOrder = {
    "objType",
    "objId",
    "details"
})
public class ObjActionResult {

    @XmlElement(name = "ObjType", required = true)
    @XmlSchemaType(name = "string")
    protected ObjActionResultObjType objType;
    @XmlElement(name = "ObjId")
    protected String objId;
    @XmlElement(name = "Details", required = true)
    protected ArrayOfObjActionResultDetailInfo details;

    /**
     * Gets the value of the objType property.
     * 
     * @return
     *     possible object is
     *     {@link ObjActionResultObjType }
     *     
     */
    public ObjActionResultObjType getObjType() {
        return objType;
    }

    /**
     * Sets the value of the objType property.
     * 
     * @param value
     *     allowed object is
     *     {@link ObjActionResultObjType }
     *     
     */
    public void setObjType(ObjActionResultObjType value) {
        this.objType = value;
    }

    /**
     * Gets the value of the objId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getObjId() {
        return objId;
    }

    /**
     * Sets the value of the objId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setObjId(String value) {
        this.objId = value;
    }

    /**
     * Gets the value of the details property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfObjActionResultDetailInfo }
     *     
     */
    public ArrayOfObjActionResultDetailInfo getDetails() {
        return details;
    }

    /**
     * Sets the value of the details property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfObjActionResultDetailInfo }
     *     
     */
    public void setDetails(ArrayOfObjActionResultDetailInfo value) {
        this.details = value;
    }

}
