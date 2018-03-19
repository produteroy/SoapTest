
package com.sendwordnow;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for actionContactsGroup complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="actionContactsGroup">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="pInfo" type="{http://www.sendwordnow.com}GrpActionContactsReq"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "actionContactsGroup", propOrder = {
    "pInfo"
})
public class ActionContactsGroup {

    @XmlElement(required = true)
    protected GrpActionContactsReq pInfo;

    /**
     * Gets the value of the pInfo property.
     * 
     * @return
     *     possible object is
     *     {@link GrpActionContactsReq }
     *     
     */
    public GrpActionContactsReq getPInfo() {
        return pInfo;
    }

    /**
     * Sets the value of the pInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link GrpActionContactsReq }
     *     
     */
    public void setPInfo(GrpActionContactsReq value) {
        this.pInfo = value;
    }

}
