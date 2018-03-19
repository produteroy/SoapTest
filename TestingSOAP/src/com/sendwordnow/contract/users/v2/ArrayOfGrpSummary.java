
package com.sendwordnow.contract.users.v2;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import com.sendwordnow.GrpSummary;


/**
 * <p>Java class for ArrayOfGrpSummary complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfGrpSummary">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="GrpSummary" type="{http://www.sendwordnow.com}GrpSummary" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfGrpSummary", propOrder = {
    "grpSummary"
})
public class ArrayOfGrpSummary {

    @XmlElement(name = "GrpSummary", nillable = true)
    protected List<GrpSummary> grpSummary;

    /**
     * Gets the value of the grpSummary property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the grpSummary property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getGrpSummary().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link GrpSummary }
     * 
     * 
     */
    public List<GrpSummary> getGrpSummary() {
        if (grpSummary == null) {
            grpSummary = new ArrayList<GrpSummary>();
        }
        return this.grpSummary;
    }

}
