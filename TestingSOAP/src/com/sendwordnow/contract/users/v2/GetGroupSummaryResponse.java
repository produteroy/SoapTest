
package com.sendwordnow.contract.users.v2;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import com.sendwordnow.GrpSummary;


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
 *         &lt;element ref="{http://www.sendwordnow.com}getGroupSummaryResult"/>
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
    "getGroupSummaryResult"
})
@XmlRootElement(name = "getGroupSummaryResponse")
public class GetGroupSummaryResponse {

    @XmlElement(namespace = "http://www.sendwordnow.com", required = true)
    protected GrpSummary getGroupSummaryResult;

    /**
     * Gets the value of the getGroupSummaryResult property.
     * 
     * @return
     *     possible object is
     *     {@link GrpSummary }
     *     
     */
    public GrpSummary getGetGroupSummaryResult() {
        return getGroupSummaryResult;
    }

    /**
     * Sets the value of the getGroupSummaryResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link GrpSummary }
     *     
     */
    public void setGetGroupSummaryResult(GrpSummary value) {
        this.getGroupSummaryResult = value;
    }

}
