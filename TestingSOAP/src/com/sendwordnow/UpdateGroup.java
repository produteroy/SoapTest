
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
 *         &lt;element name="pInfo" type="{http://www.sendwordnow.com}GrpUpdReq"/>
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
    "pInfo"
})
@XmlRootElement(name = "updateGroup")
public class UpdateGroup {

    @XmlElement(required = true)
    protected GrpUpdReq pInfo;

    /**
     * Gets the value of the pInfo property.
     * 
     * @return
     *     possible object is
     *     {@link GrpUpdReq }
     *     
     */
    public GrpUpdReq getPInfo() {
        return pInfo;
    }

    /**
     * Sets the value of the pInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link GrpUpdReq }
     *     
     */
    public void setPInfo(GrpUpdReq value) {
        this.pInfo = value;
    }

}
