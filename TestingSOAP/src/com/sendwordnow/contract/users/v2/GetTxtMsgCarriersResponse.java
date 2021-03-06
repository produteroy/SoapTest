
package com.sendwordnow.contract.users.v2;

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
 *         &lt;element name="getTxtMsgCarriersResult" type="{http://www.sendwordnow.com/contract/users/v2}ArrayOfTxtMsgCarrier"/>
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
    "getTxtMsgCarriersResult"
})
@XmlRootElement(name = "getTxtMsgCarriersResponse")
public class GetTxtMsgCarriersResponse {

    @XmlElement(required = true)
    protected ArrayOfTxtMsgCarrier getTxtMsgCarriersResult;

    /**
     * Gets the value of the getTxtMsgCarriersResult property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfTxtMsgCarrier }
     *     
     */
    public ArrayOfTxtMsgCarrier getGetTxtMsgCarriersResult() {
        return getTxtMsgCarriersResult;
    }

    /**
     * Sets the value of the getTxtMsgCarriersResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfTxtMsgCarrier }
     *     
     */
    public void setGetTxtMsgCarriersResult(ArrayOfTxtMsgCarrier value) {
        this.getTxtMsgCarriersResult = value;
    }

}
