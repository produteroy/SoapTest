
package com.sendwordnow.contract.users.v2;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import com.sendwordnow.schema.users.v2.SetContactLocationsList;


/**
 * <p>Java class for ArrayOfSetContactLocationsList complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfSetContactLocationsList">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="SetContactLocationsList" type="{http://www.sendwordnow.com/schema/users/v2}SetContactLocationsList" maxOccurs="unbounded"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfSetContactLocationsList", propOrder = {
    "setContactLocationsList"
})
public class ArrayOfSetContactLocationsList {

    @XmlElement(name = "SetContactLocationsList", required = true)
    protected List<SetContactLocationsList> setContactLocationsList;

    /**
     * Gets the value of the setContactLocationsList property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the setContactLocationsList property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSetContactLocationsList().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SetContactLocationsList }
     * 
     * 
     */
    public List<SetContactLocationsList> getSetContactLocationsList() {
        if (setContactLocationsList == null) {
            setContactLocationsList = new ArrayList<SetContactLocationsList>();
        }
        return this.setContactLocationsList;
    }

}
