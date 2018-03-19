
package com.sendwordnow.schema.users.v2;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfContactLocationLabel complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfContactLocationLabel">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ContactLocationLabel" type="{http://www.sendwordnow.com/schema/users/v2}ContactLocationLabel" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfContactLocationLabel", propOrder = {
    "contactLocationLabel"
})
public class ArrayOfContactLocationLabel {

    @XmlElement(name = "ContactLocationLabel", nillable = true)
    protected List<ContactLocationLabel> contactLocationLabel;

    /**
     * Gets the value of the contactLocationLabel property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the contactLocationLabel property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getContactLocationLabel().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ContactLocationLabel }
     * 
     * 
     */
    public List<ContactLocationLabel> getContactLocationLabel() {
        if (contactLocationLabel == null) {
            contactLocationLabel = new ArrayList<ContactLocationLabel>();
        }
        return this.contactLocationLabel;
    }

}
