
package com.sendwordnow;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ObjActionResultObjType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="ObjActionResultObjType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="Group"/>
 *     &lt;enumeration value="Contact"/>
 *     &lt;enumeration value="ContactPoint"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "ObjActionResultObjType")
@XmlEnum
public enum ObjActionResultObjType {

    @XmlEnumValue("Group")
    GROUP("Group"),
    @XmlEnumValue("Contact")
    CONTACT("Contact"),
    @XmlEnumValue("ContactPoint")
    CONTACT_POINT("ContactPoint");
    private final String value;

    ObjActionResultObjType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static ObjActionResultObjType fromValue(String v) {
        for (ObjActionResultObjType c: ObjActionResultObjType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
