
package com.sendwordnow;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for GrpDetail complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="GrpDetail">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.sendwordnow.com}GrpSummary">
 *       &lt;sequence>
 *         &lt;element name="ContactsList" type="{http://www.sendwordnow.com}ArrayOfContactSummary"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GrpDetail", propOrder = {
    "contactsList"
})
public class GrpDetail
    extends GrpSummary
{

    @XmlElement(name = "ContactsList", required = true)
    protected ArrayOfContactSummary contactsList;

    /**
     * Gets the value of the contactsList property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfContactSummary }
     *     
     */
    public ArrayOfContactSummary getContactsList() {
        return contactsList;
    }

    /**
     * Sets the value of the contactsList property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfContactSummary }
     *     
     */
    public void setContactsList(ArrayOfContactSummary value) {
        this.contactsList = value;
    }

}
