
package com.sendwordnow.contract.users.v2;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import com.sendwordnow.schema.users.v2.ObjActionResult;


/**
 * <p>Java class for ArrayOfObjActionResult2 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfObjActionResult2">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ObjActionResult" type="{http://www.sendwordnow.com/schema/users/v2}ObjActionResult" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfObjActionResult2", propOrder = {
    "objActionResult"
})
public class ArrayOfObjActionResult2 {

    @XmlElement(name = "ObjActionResult", nillable = true)
    protected List<ObjActionResult> objActionResult;

    /**
     * Gets the value of the objActionResult property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the objActionResult property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getObjActionResult().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ObjActionResult }
     * 
     * 
     */
    public List<ObjActionResult> getObjActionResult() {
        if (objActionResult == null) {
            objActionResult = new ArrayList<ObjActionResult>();
        }
        return this.objActionResult;
    }

}
