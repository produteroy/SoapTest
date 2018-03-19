
package com.sendwordnow.contract.users.v2;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import com.sendwordnow.GrpUpdReq;


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
 *         &lt;element ref="{http://www.sendwordnow.com}pGrpUpdReq"/>
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
    "pGrpUpdReq"
})
@XmlRootElement(name = "updateGroup")
public class UpdateGroup {

    @XmlElement(namespace = "http://www.sendwordnow.com", required = true)
    protected GrpUpdReq pGrpUpdReq;

    /**
     * Gets the value of the pGrpUpdReq property.
     * 
     * @return
     *     possible object is
     *     {@link GrpUpdReq }
     *     
     */
    public GrpUpdReq getPGrpUpdReq() {
        return pGrpUpdReq;
    }

    /**
     * Sets the value of the pGrpUpdReq property.
     * 
     * @param value
     *     allowed object is
     *     {@link GrpUpdReq }
     *     
     */
    public void setPGrpUpdReq(GrpUpdReq value) {
        this.pGrpUpdReq = value;
    }

}
