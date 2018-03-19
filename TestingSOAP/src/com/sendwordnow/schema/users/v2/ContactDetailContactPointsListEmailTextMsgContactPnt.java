
package com.sendwordnow.schema.users.v2;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import com.sendwordnow.ContactPntTextMsgType;


/**
 * <p>Java class for ContactDetailContactPointsListEmailTextMsgContactPnt complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ContactDetailContactPointsListEmailTextMsgContactPnt">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;choice>
 *           &lt;element name="TextMsgContactPnt" type="{http://www.sendwordnow.com}ContactPntTextMsgType"/>
 *           &lt;element name="EmailContactPnt" type="{http://www.sendwordnow.com/schema/users/v2}ContactPntEmailType"/>
 *         &lt;/choice>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ContactDetailContactPointsListEmailTextMsgContactPnt", propOrder = {
    "textMsgContactPnt",
    "emailContactPnt"
})
public class ContactDetailContactPointsListEmailTextMsgContactPnt {

    @XmlElement(name = "TextMsgContactPnt")
    protected ContactPntTextMsgType textMsgContactPnt;
    @XmlElement(name = "EmailContactPnt")
    protected ContactPntEmailType emailContactPnt;

    /**
     * Gets the value of the textMsgContactPnt property.
     * 
     * @return
     *     possible object is
     *     {@link ContactPntTextMsgType }
     *     
     */
    public ContactPntTextMsgType getTextMsgContactPnt() {
        return textMsgContactPnt;
    }

    /**
     * Sets the value of the textMsgContactPnt property.
     * 
     * @param value
     *     allowed object is
     *     {@link ContactPntTextMsgType }
     *     
     */
    public void setTextMsgContactPnt(ContactPntTextMsgType value) {
        this.textMsgContactPnt = value;
    }

    /**
     * Gets the value of the emailContactPnt property.
     * 
     * @return
     *     possible object is
     *     {@link ContactPntEmailType }
     *     
     */
    public ContactPntEmailType getEmailContactPnt() {
        return emailContactPnt;
    }

    /**
     * Sets the value of the emailContactPnt property.
     * 
     * @param value
     *     allowed object is
     *     {@link ContactPntEmailType }
     *     
     */
    public void setEmailContactPnt(ContactPntEmailType value) {
        this.emailContactPnt = value;
    }

}
