
package com.sendwordnow.contract.users.v2;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import com.sendwordnow.TxtMsgCarrier;


/**
 * <p>Java class for ArrayOfTxtMsgCarrier complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfTxtMsgCarrier">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="TxtMsgCarrier" type="{http://www.sendwordnow.com}TxtMsgCarrier" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfTxtMsgCarrier", propOrder = {
    "txtMsgCarrier"
})
public class ArrayOfTxtMsgCarrier {

    @XmlElement(name = "TxtMsgCarrier", nillable = true)
    protected List<TxtMsgCarrier> txtMsgCarrier;

    /**
     * Gets the value of the txtMsgCarrier property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the txtMsgCarrier property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTxtMsgCarrier().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TxtMsgCarrier }
     * 
     * 
     */
    public List<TxtMsgCarrier> getTxtMsgCarrier() {
        if (txtMsgCarrier == null) {
            txtMsgCarrier = new ArrayList<TxtMsgCarrier>();
        }
        return this.txtMsgCarrier;
    }

}
