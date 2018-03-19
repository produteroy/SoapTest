
package com.sendwordnow;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
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
 *         &lt;element name="getGroupsResult" type="{http://www.sendwordnow.com}ArrayOfGrpSummary" minOccurs="0"/>
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
    "getGroupsResult"
})
@XmlRootElement(name = "getGroupsResponse")
public class GetGroupsResponse {

    protected ArrayOfGrpSummary getGroupsResult;

    /**
     * Gets the value of the getGroupsResult property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfGrpSummary }
     *     
     */
    public ArrayOfGrpSummary getGetGroupsResult() {
        return getGroupsResult;
    }

    /**
     * Sets the value of the getGroupsResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfGrpSummary }
     *     
     */
    public void setGetGroupsResult(ArrayOfGrpSummary value) {
        this.getGroupsResult = value;
    }

}
