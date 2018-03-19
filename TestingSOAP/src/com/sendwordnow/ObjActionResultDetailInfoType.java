
package com.sendwordnow;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ObjActionResultDetailInfoType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="ObjActionResultDetailInfoType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="Error"/>
 *     &lt;enumeration value="Information"/>
 *     &lt;enumeration value="Warning"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "ObjActionResultDetailInfoType")
@XmlEnum
public enum ObjActionResultDetailInfoType {

    @XmlEnumValue("Error")
    ERROR("Error"),
    @XmlEnumValue("Information")
    INFORMATION("Information"),
    @XmlEnumValue("Warning")
    WARNING("Warning");
    private final String value;

    ObjActionResultDetailInfoType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static ObjActionResultDetailInfoType fromValue(String v) {
        for (ObjActionResultDetailInfoType c: ObjActionResultDetailInfoType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
