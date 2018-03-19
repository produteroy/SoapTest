
package com.sendwordnow;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ContactDetailLogin complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ContactDetailLogin">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Username">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;pattern value="([\w\.@\-]{3,30})?"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="Password">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;pattern value="([\S\w#~`'!@$%*\(\)\-_\{\};:/\?,>\.&amp;"&lt;‘’“”…–—-[\^]][\s\w#~`'!@$%*\(\)\-_\{\};:/\?,>\.&amp;"&lt;‘’“”…–—-[\^]]{5,13}[\S\w#~`'!@$%*\(\)\-_\{\};:/\?,>\.&amp;"&lt;‘’“”…–—-[\^]])?"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="QuickSendCode">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;pattern value="([\S\w#~`'!@$%*\(\)\-_\{\};:/\?,>\.&amp;"&lt;‘’“”…–—-[\^]][\s\w#~`'!@$%*\(\)\-_\{\};:/\?,>\.&amp;"&lt;‘’“”…–—-[\^]]{5,13}[\S\w#~`'!@$%*\(\)\-_\{\};:/\?,>\.&amp;"&lt;‘’“”…–—-[\^]])?"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="AccessGrpsList" type="{http://www.sendwordnow.com}ArrayOfGrpName"/>
 *         &lt;element name="Status" type="{http://www.sendwordnow.com}ContactDetailLoginStatus"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ContactDetailLogin", propOrder = {
    "username",
    "password",
    "quickSendCode",
    "accessGrpsList",
    "status"
})
public class ContactDetailLogin {

    @XmlElement(name = "Username", required = true)
    protected String username;
    @XmlElement(name = "Password", required = true)
    protected String password;
    @XmlElement(name = "QuickSendCode", required = true)
    protected String quickSendCode;
    @XmlElement(name = "AccessGrpsList", required = true)
    protected ArrayOfGrpName accessGrpsList;
    @XmlElement(name = "Status", required = true)
    @XmlSchemaType(name = "string")
    protected ContactDetailLoginStatus status;

    /**
     * Gets the value of the username property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUsername() {
        return username;
    }

    /**
     * Sets the value of the username property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUsername(String value) {
        this.username = value;
    }

    /**
     * Gets the value of the password property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPassword() {
        return password;
    }

    /**
     * Sets the value of the password property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPassword(String value) {
        this.password = value;
    }

    /**
     * Gets the value of the quickSendCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getQuickSendCode() {
        return quickSendCode;
    }

    /**
     * Sets the value of the quickSendCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setQuickSendCode(String value) {
        this.quickSendCode = value;
    }

    /**
     * Gets the value of the accessGrpsList property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfGrpName }
     *     
     */
    public ArrayOfGrpName getAccessGrpsList() {
        return accessGrpsList;
    }

    /**
     * Sets the value of the accessGrpsList property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfGrpName }
     *     
     */
    public void setAccessGrpsList(ArrayOfGrpName value) {
        this.accessGrpsList = value;
    }

    /**
     * Gets the value of the status property.
     * 
     * @return
     *     possible object is
     *     {@link ContactDetailLoginStatus }
     *     
     */
    public ContactDetailLoginStatus getStatus() {
        return status;
    }

    /**
     * Sets the value of the status property.
     * 
     * @param value
     *     allowed object is
     *     {@link ContactDetailLoginStatus }
     *     
     */
    public void setStatus(ContactDetailLoginStatus value) {
        this.status = value;
    }

}
