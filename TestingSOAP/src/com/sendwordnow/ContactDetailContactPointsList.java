
package com.sendwordnow;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ContactDetailContactPointsList complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ContactDetailContactPointsList">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="VoiceContactPnt" type="{http://www.sendwordnow.com}ContactPntVoiceType" maxOccurs="5" minOccurs="0"/>
 *         &lt;element name="EmailTextMsgContactPnt" type="{http://www.sendwordnow.com}ContactDetailContactPointsListEmailTextMsgContactPnt" maxOccurs="5" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ContactDetailContactPointsList", propOrder = {
    "voiceContactPnt",
    "emailTextMsgContactPnt"
})
public class ContactDetailContactPointsList {

    @XmlElement(name = "VoiceContactPnt")
    protected List<ContactPntVoiceType> voiceContactPnt;
    @XmlElement(name = "EmailTextMsgContactPnt")
    protected List<ContactDetailContactPointsListEmailTextMsgContactPnt> emailTextMsgContactPnt;

    /**
     * Gets the value of the voiceContactPnt property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the voiceContactPnt property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getVoiceContactPnt().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ContactPntVoiceType }
     * 
     * 
     */
    public List<ContactPntVoiceType> getVoiceContactPnt() {
        if (voiceContactPnt == null) {
            voiceContactPnt = new ArrayList<ContactPntVoiceType>();
        }
        return this.voiceContactPnt;
    }

    /**
     * Gets the value of the emailTextMsgContactPnt property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the emailTextMsgContactPnt property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getEmailTextMsgContactPnt().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ContactDetailContactPointsListEmailTextMsgContactPnt }
     * 
     * 
     */
    public List<ContactDetailContactPointsListEmailTextMsgContactPnt> getEmailTextMsgContactPnt() {
        if (emailTextMsgContactPnt == null) {
            emailTextMsgContactPnt = new ArrayList<ContactDetailContactPointsListEmailTextMsgContactPnt>();
        }
        return this.emailTextMsgContactPnt;
    }

}
