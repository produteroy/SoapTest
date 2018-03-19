
package com.sendwordnow.contract.users.v2;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import com.sendwordnow.schema.users.v2.GrpCreateReq;


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
 *         &lt;element ref="{http://www.sendwordnow.com/schema/users/v2}GrpCreateReq"/>
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
    "grpCreateReq"
})
@XmlRootElement(name = "createGroup")
public class CreateGroup {

    @XmlElement(name = "GrpCreateReq", namespace = "http://www.sendwordnow.com/schema/users/v2", required = true)
    protected GrpCreateReq grpCreateReq;

    /**
     * Gets the value of the grpCreateReq property.
     * 
     * @return
     *     possible object is
     *     {@link GrpCreateReq }
     *     
     */
    public GrpCreateReq getGrpCreateReq() {
        return grpCreateReq;
    }

    /**
     * Sets the value of the grpCreateReq property.
     * 
     * @param value
     *     allowed object is
     *     {@link GrpCreateReq }
     *     
     */
    public void setGrpCreateReq(GrpCreateReq value) {
        this.grpCreateReq = value;
    }

}
