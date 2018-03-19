
package com.sendwordnow.contract.users.v2;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import com.sendwordnow.schema.users.v2.ContactLocationsList;


/**
 * <p>Java class for ArrayOfContactLocationsList complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfContactLocationsList">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ContactLocationsList" type="{http://www.sendwordnow.com/schema/users/v2}ContactLocationsList" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfContactLocationsList", propOrder = {
    "contactLocationsList"
})
public class ArrayOfContactLocationsList {

    @XmlElement(name = "ContactLocationsList", nillable = true)
    protected List<ContactLocationsList> contactLocationsList;

    /**
     * Gets the value of the contactLocationsList property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the contactLocationsList property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getContactLocationsList().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ContactLocationsList }
     * 
     * 
     */
    public List<ContactLocationsList> getContactLocationsList() {
        if (contactLocationsList == null) {
            contactLocationsList = new ArrayList<ContactLocationsList>();
        }
        return this.contactLocationsList;
    }

}
