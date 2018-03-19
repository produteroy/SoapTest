
package com.sendwordnow.schema.users.v2;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfContactLocation complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfContactLocation">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;choice>
 *           &lt;element name="StreetAddressContactLocation" type="{http://www.sendwordnow.com/schema/users/v2}StreetAddressContactLocation" maxOccurs="unbounded" minOccurs="0"/>
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
@XmlType(name = "ArrayOfContactLocation", propOrder = {
    "streetAddressContactLocation"
})
@XmlSeeAlso({
    com.sendwordnow.schema.users.v2.ContactLocationsList.Locations.class
})
public class ArrayOfContactLocation {

    @XmlElement(name = "StreetAddressContactLocation")
    protected List<StreetAddressContactLocation> streetAddressContactLocation;

    /**
     * Gets the value of the streetAddressContactLocation property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the streetAddressContactLocation property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getStreetAddressContactLocation().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link StreetAddressContactLocation }
     * 
     * 
     */
    public List<StreetAddressContactLocation> getStreetAddressContactLocation() {
        if (streetAddressContactLocation == null) {
            streetAddressContactLocation = new ArrayList<StreetAddressContactLocation>();
        }
        return this.streetAddressContactLocation;
    }

}
