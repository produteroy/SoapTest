
package com.sendwordnow;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for GrpActionContactsReqActionType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="GrpActionContactsReqActionType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="Add"/>
 *     &lt;enumeration value="Remove"/>
 *     &lt;enumeration value="Empty"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "GrpActionContactsReqActionType")
@XmlEnum
public enum GrpActionContactsReqActionType {

    @XmlEnumValue("Add")
    ADD("Add"),
    @XmlEnumValue("Remove")
    REMOVE("Remove"),
    @XmlEnumValue("Empty")
    EMPTY("Empty");
    private final String value;

    GrpActionContactsReqActionType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static GrpActionContactsReqActionType fromValue(String v) {
        for (GrpActionContactsReqActionType c: GrpActionContactsReqActionType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
